/* -----SBA WEEK 4 QUESTIONS------*/

create database org;
show databases;
use org;
create table Worker(worker_id int not null primary key,first_name varchar(50) not null,last_name varchar(50) not null,
salary varchar(50) not null,joining_date varchar(50)not null,department varchar(50)not null);
insert into worker values("001","monika","arora","100000","2014-02-20 09:00:00","hr");
insert into worker values("002","niharika","verma","80000","2014-06-11 09:00:00","admin");
insert into worker values("003","vishal","singhal","300000","2014-02-20 09:00:00","hr");
insert into worker values("004","amitabh","singh","500000","2014-02-20 09:00:00","admin");
insert into worker values("005","vivek","bhati","500000","2014-06-11 09:00:00","admin");
insert into worker values("006","vipul","diwan","200000","2014-06-11 09:00:00","account");
insert into worker values("007","satish","kumar","75000","2014-01-20 09:00:00","account");
insert into worker values("008","geetika","chauhan","90000","2014-04-11 09:00:00","admin");
select * from worker;
create table bonus(worker_ref_id varchar(10)not null,bonus_date varchar(30)not null,bonus_amount varchar(30)not null);
insert into bonus values("1","2016-02-20 00:00:00","5000");
insert into bonus values("2","2016-06-11 00:00:00","3000");
insert into bonus values("3","2016-02-20 00:00:00","4000");
insert into bonus values("1","2016-02-20 00:00:00","4500");
insert into bonus values("2","2016-06-11 00:00:00","3500");
create table title(worker_ref_id varchar(10)primary key not null,worker_title varchar(30)not null,affected_from varchar(20)not null);
insert into title values("1","manager","2016-02-20 00:00:00");
insert into title values("2","executive","2016-06-11 00:00:00");
insert into title values("8","executive","2016-06-11 00:00:00");
insert into title values("5","manager","2016-06-11 00:00:00");
insert into title values("4","asst.manager","2016-06-11 00:00:00");
insert into title values("7","executive","2016-06-11 00:00:00");
insert into title values("6","lead","2016-06-11 00:00:00");
insert into title values("3","lead","2016-06-11 00:00:00");
select * from bonus;

/*------------question 22------*/

select first_name,last_name from worker where salary>=50000 and salary<=100000;

/*------------question 23------*/

select  count(worker_id),department from worker group by department order by count(department)DESC;

/* ----------17------------*/

select * from worker where first_name LIKE '%a';

/*----------question 19---------*/

select * from worker where salary between 100000 and 500000;

/*--------------question ---------*/

select count(worker_id),department from worker group by department having department="admin";

/*----------------question 1------------------*/

select first_name as worker_name from worker;

/*----------------question 2------------------*/

select upper(first_name) from worker;
/*-----------------------************---------------------------*/