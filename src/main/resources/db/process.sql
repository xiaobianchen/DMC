/*get top 3 records from flow table*/
truncate table process

insert into process
(select distinct 'Flow' as 'Table', a.SourceDetails, abs(a.AccessNum-b.AccessNum) as '访问量变化', a.AccessNum as '当天的访问量', b.AccessNum as '最近一天的访问量',
c.AccessNum as '最近两天的访问量', d.AccessNum as '最近一周的访问量process', Round(a.AccessNum/b.AccessNum -1, 3) as '同比', Round(a.AccessNum/d.AccessNum -1, 3) as '环比',
a.Date as '当前日期'
from flow a , flow b, flow c, flow d
where a.SourceDetails = b.SourceDetails and b.SourceDetails=c.SourceDetails and c.SourceDetails=d.SourceDetails and a.SourceDetails !='汇总' 
and a.Date=(select max(Date) from flow) and b.Date=(select date_sub(max(Date),interval 1 day) from flow)
and c.Date=(select date_sub(max(Date),interval 2 day) from flow) 
and d.Date=(select date_sub(max(Date),interval 7 day) from flow)
order by abs(a.AccessNum-b.AccessNum) desc limit 0,3);


/*get top 3 records from pc table*/
insert into process
(select distinct 'PC' as 'Table', a.SourceDetails, abs(a.AccessNum-b.AccessNum) as '访问量变化', a.AccessNum as '当天的访问量', b.AccessNum as '最近一天的访问量',
c.AccessNum as '最近两天的访问量', d.AccessNum as '最近一周的访问量process', Round(a.AccessNum/b.AccessNum -1, 3) as '同比', Round(a.AccessNum/d.AccessNum -1, 3) as '环比',
a.Date as '当前日期'
from pc a , pc b, pc c, pc d
where a.SourceDetails = b.SourceDetails and b.SourceDetails=c.SourceDetails and c.SourceDetails=d.SourceDetails and a.SourceDetails !='汇总' 
and a.Date=(select max(Date) from pc) and b.Date=(select date_sub(max(Date),interval 1 day) from pc)
and c.Date=(select date_sub(max(Date),interval 2 day) from pc) 
and d.Date=(select date_sub(max(Date),interval 7 day) from pc)
order by abs(a.AccessNum-b.AccessNum) desc limit 0,3);

/*get max change records*/
select * from process order by AccessNumChange desc limit 0,3;