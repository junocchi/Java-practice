-- create table
/*
Syntax:
create table TableName(
columnName1 datatype,
columnName2 datatype,
.
.
columnNamen datatype);
*/
use wileydi004;

create table employee(
empId int primary key,
empName varchar(20),
designation varchar(20),
deptt varchar(20),
salary double);

/*
insert into TableName(fieldlist)
values(valuelist);
*/

insert into employee(empId,empName,designation,department,salary)
values(101,"AAAA",'Executive','Sales',4567.50);

insert into employee
values(102,"BBBB",'Sr. Executive','HR',7590.00);

select * from employee;

insert into employee
values(103,"CCCC","Manager","IT",7890),
(104,"DDDD","Sr. Manager","HR",9880),
(105,"EEEE","Associate","IT",8950);

insert into employee
values(105,'FFFF',null,'HR',8970);

insert into employee(empId,empName,designation)
values(106,'GGGGG','Clerk');

-- to delete table structure
drop table employee;