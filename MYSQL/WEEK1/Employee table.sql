use ustdb;

/*----------------- QUESTION 1------------------------*/
/*------1.1-------*/

create table Employee(emp_id int not null primary key,manager_id int ,first_name varchar(50) not null,last_name varchar(50) not null,
emp_title varchar(50)not null,salary varchar(50) not null,joining_date varchar(50)not null,dep varchar(50)not null);
insert into Employee values ("1",NULL,"monika","arora","manager","100000","02/20/14  9.00","hr");

insert into Employee values ("2","1","niharika","verma","executive","80000","06/11/14  9.00","admin"),("3","1","vishal","singal","executive","300000","02/20/14  9.00","hr"),("4",null,"amitabh","singh","manager","500000","02/20/14  9.00","admin"),("5","4","vivek","bhati","asst.manager","500000","06/11/14  9.00","admin"),("6","5","vipul","diwan","executive","200000","06/11/14  9.00","account"),("7","4","satish","kumar","lead","75000","01/20/14  9.00","account"),("8","4","geetika","chauhan","lead","90000","04/11/14  9.00","admin");
select * from Employee;

/*----------1.2------------*/

select first_name,last_name from Employee where salary  between 50000  AND 100000;

/*----------1.4------------*/

select count(emp_id),dep from Employee group by dep order by count(dep) DESC;

/*----------1.5------------*/

select max(salary)from employee;

/*----------1.7------------*/

select  emp_id,first_name,last_name,emp_title,salary,count(*) from Employee group by emp_id having count(*)>1;

/*----------1.8------------*/

select * from Employee where manager_id IS NULL;

/*----------1.9------------*/

select count(emp_id) from Employee group by joining_date >01/01/14 and joining_date <31/12/15 ;


/*----------1.3------------*/

select v.first_name as Employee  ,s.first_name as Manager from Employee v,Employee s where s.emp_id=v.manager_id;

/*---------------------------------------------------------------*******************-----------------------------------------------------------------------*/

