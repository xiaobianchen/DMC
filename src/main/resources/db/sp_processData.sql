/*create procedure sp_processData*/
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_processData`()
BEGIN

/*get top 3 records from pc table*/	
INSERT INTO process
(SELECT DISTINCT 'Flow' AS 'Table', a.SourceDetails, abs(a.AccessNum-b.AccessNum) AS '访问量变化', a.AccessNum AS '当天的访问量', b.AccessNum AS '最近一天的访问量',
c.AccessNum AS '最近两天的访问量', d.AccessNum AS '最近一周的访问量', Round(a.AccessNum/b.AccessNum -1, 2) AS '同比', Round(a.AccessNum/d.AccessNum -1, 2) AS '环比',
a.Date AS '当前日期'
FROM flow a , flow b, flow c, flow d
where a.SourceDetails = b.SourceDetails AND b.SourceDetails=c.SourceDetails AND c.SourceDetails=d.SourceDetails AND a.SourceDetails !='汇总' 
AND a.Date=(SELECT max(Date) FROM flow) AND b.Date=(SELECT date_sub(max(Date),interval 1 day) FROM flow)
AND c.Date=(SELECT date_sub(max(Date),interval 2 day) FROM flow) 
AND d.Date=(SELECT date_sub(max(Date),interval 7 day) FROM flow)
ORDER BY abs(a.AccessNum-b.AccessNum) DESC limit 0,3);


/*get top 3 records FROM pc table*/
INSERT INTO process
(SELECT distinct 'PC' AS 'Table', a.SourceDetails, abs(a.AccessNum-b.AccessNum) AS '访问量变化', a.AccessNum AS '当天的访问量', b.AccessNum AS '最近一天的访问量',
c.AccessNum AS '最近两天的访问量', d.AccessNum AS '最近一周的访问量', Round(a.AccessNum/b.AccessNum -1, 2) AS '同比', Round(a.AccessNum/d.AccessNum -1, 2) AS '环比',
a.Date AS '当前日期'
FROM pc a , pc b, pc c, pc d
where a.SourceDetails = b.SourceDetails AND b.SourceDetails=c.SourceDetails AND c.SourceDetails=d.SourceDetails AND a.SourceDetails !='汇总' 
AND a.Date=(SELECT max(Date) FROM pc) AND b.Date=(SELECT date_sub(max(Date),interval 1 day) FROM pc)
AND c.Date=(SELECT date_sub(max(Date),interval 2 day) FROM pc) 
AND d.Date=(SELECT date_sub(max(Date),interval 7 day) FROM pc)
ORDER BY abs(a.AccessNum-b.AccessNum) DESC limit 0,3);

/*get top 3 records FROM pc table*/
SELECT * FROM process where Date=(SELECT max(Date) FROM  process) ORDER BY AccessNumChange DESC limit 0,3;

END