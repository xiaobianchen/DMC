select * from flow where Date=sysdate()-4;

select count(*) from app;

truncate table flow;
truncate table pc;
truncate table app;
