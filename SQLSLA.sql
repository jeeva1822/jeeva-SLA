CREATE database EmployeeInfo;
show databases; 
use  EmployeeInfo;
-- For checking Whether the Table is CAreated or Not
create table EmployeeDet(EmpId int, EmpName varchar(23),EmpGender varchar(15));

desc EmployeeDet;
-- decs-Structure describing 
-- likewise String in java, Varchar in DB
-- likewise Return type in java, Transactions  in DB

select* from EmployeeDet;

 -- add a value into the table
 
insert into EmployeeDet values(100,"arun","Male");
insert into EmployeeDet values(101,"Jeeva","Male");
insert into EmployeeDet values(100,"Vinusha","Female");

-- (Alter the Table Students Drop column Email)
-- Alter table_name modify column_name datatype;

-- 1.Altering the table-- 
ALTER TABLE EmployeeDet add EmpLocation varchar(255);

-- 2.Dropping the column
ALTER TABLE EmployeeDet DROP COlUMN EmpLocation;

-- 3. modyfying the column data type
ALTER TABLE EmployeeDet MODIFY COlUMN EmpGender boolean;

-- 4.RENAME COLUMN_ to rename an existing column

ALTER TABLE EmployeeDet rename column EMpId to EmpIdentity;

-- Drop to delete an existing column from the table

-- delete- deleted items can be roll back or revoked
-- drop- deleted items cannot be revoked or roll back



-- 1.add - to add a new column to the table
-- 2.Alter/drop - to change the data type of an existing column
-- 3.DROP- to delete an existing column from the table
-- 4.Rename  column- To rename an existing column
