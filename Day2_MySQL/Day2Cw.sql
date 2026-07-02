CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employee (
    employee_id INT,
    employee_name VARCHAR(10),
    employee_salary INT,
    dept_num INT
);

desc employee;
INSERT INTO employee VALUES (1, 'John', 50000, 10);
INSERT INTO employee VALUES (2, 'Sarah', 55000, 20);
INSERT INTO employee VALUES (3, 'Mike', 48000, 10);
INSERT INTO employee VALUES (4, 'Priya', 62000, 30);
INSERT INTO employee VALUES (5, 'David', 51000, 20);

SELECT * FROM employee;

SELECT dept_num, COUNT(*) AS "Total Num of employee" 
FROM employee 
GROUP BY dept_num;

select dept_num, sum(employee_salary), avg(employee_salary), min(employee_salary), max(employee_salary) from employee group by dept_num;

select dept_num, sum(employee_salary), avg(employee_salary), min(employee_salary), max(employee_salary) from employee group by dept_num having min(employee_salary) > 10000;

select dept_num, sum(employee_salary), avg(employee_salary), min(employee_salary),
max(employee_salary) from employee group by dept_num order by dept_num DESC;

select * from employee order by employee_id;

select * from employee order by employee_id desc;

CREATE TABLE dept (
    dept_num INT,
    dept_name VARCHAR(10)
);

insert into dept values(10, "Develop");
insert into dept values(20, "Testing");

select * from dept;

SELECT dept_name 
FROM dept 
WHERE dept_num = (SELECT dept_num FROM employee WHERE employee_id = 1);

SELECT * 
FROM employee 
WHERE dept_num = (SELECT dept_num FROM dept WHERE dept_name = 'Testing');

SELECT dept_name from dept where dept_num = (select dept_num from employee where employee_name = "John");

SELECT dept_name from dept where dept_num in (select dept_num from employee where employee_id = 1 or employee_id = 2);


drop table employee;

CREATE TABLE employee (
    employee_id INT primary key,
    employee_name VARCHAR(50) not null,
    employee_salary INT check(employee_salary>0),
    email VARCHAR(50) unique,
    dept_num INT
);
drop table employee;
drop table emplo;
drop table dept;
DROP PROCEDURE IF EXISTS insertEmployee;


CREATE TABLE dept (
    dept_num INT PRIMARY KEY,
    dept_name VARCHAR(30)
);

CREATE TABLE employee(
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    employee_salary INT,
    dept_num INT
);

DELIMITER //

CREATE PROCEDURE insertEmployee(
    IN employee_id INT,
    IN employee_name VARCHAR(30),
    IN employee_salary INT,
    IN dept_num INT
)
BEGIN
    INSERT INTO employee(employee_id, employee_name, employee_salary, dept_num)
    VALUES (employee_id, employee_name, employee_salary, dept_num);
END //

DELIMITER ;

CALL insertEmployee(102, 'Ramesh', 58000, 10);

select * from employee;

DELIMITER //
create procedure getEmployeeName(in empid integer, out empname varchar(30))
begin
	SELECT employee_name INTO empname FROM employee WHERE employee_id = empid;
end //
DELIMITER ;

CALL insertEmployee(101, 'Srakshin', 30000, 20);
call getEmployeeName(101, @empname);
select @empname

DELIMITER //
create function getEmpName(empid integer) returns varchar(30)
DETERMINISTIC
begin
	declare empname varchar(30); 
	SELECT employee_name INTO empname FROM employee WHERE employee_id = empid;
    return empname;
end //
DELIMITER ;

select getEmpName(101);

CREATE TABLE agents (
    agent_code    VARCHAR(6) PRIMARY KEY,
    agent_name    VARCHAR(40),
    working_area  VARCHAR(40)
);

CREATE TABLE customers (
    customer_code  VARCHAR(6) PRIMARY KEY,
    customer_name  VARCHAR(40),
    customer_area  VARCHAR(40)
);

INSERT INTO agents VALUES ('A101', 'agent1', 'chennai');
INSERT INTO agents VALUES ('A102', 'agent2', 'chennai');
INSERT INTO agents VALUES ('A103', 'agent3', 'Bangalore');
INSERT INTO agents VALUES ('A104', 'agent4', 'Bangalore');
INSERT INTO agents VALUES ('A105', 'agent5', 'New York');

INSERT INTO customers VALUES ('C101', 'customer1', 'chennai');
INSERT INTO customers VALUES ('C102', 'customer2', 'chennai');
INSERT INTO customers VALUES ('C103', 'customer3', 'chennai');
INSERT INTO customers VALUES ('C104', 'customer4', 'Bangalore');
INSERT INTO customers VALUES ('C105', 'customer5', 'Bangalore');
INSERT INTO customers VALUES ('C106', 'customer6', 'Delhi');

SELECT agents.agent_name, customers.customer_name, customers.customer_area
FROM agents, customers
WHERE agents.working_area = customers.customer_area;

SELECT agents.agent_name, customers.customer_name, customers.customer_area
FROM agents
JOIN customers ON agents.working_area <> customers.customer_area;

SELECT agents.agent_name, customers.customer_name, customers.customer_area
FROM agents
INNER JOIN customers ON agents.working_area = customers.customer_area;

SELECT *
FROM agents
LEFT OUTER JOIN customers ON agents.working_area = customers.customer_area;

SELECT *
FROM agents
RIGHT OUTER JOIN customers ON agents.working_area = customers.customer_area;

SELECT * FROM agents
LEFT JOIN customers ON agents.working_area = customers.customer_area
UNION
SELECT * FROM agents
RIGHT JOIN customers ON agents.working_area = customers.customer_area;

SELECT agents.agent_name, customers.customer_name, customers.customer_area
FROM agents
CROSS JOIN customers;

SELECT a.agent_code, b.agent_name, a.working_area
FROM agents a
JOIN agents b ON a.working_area = b.working_area
WHERE a.agent_code <> b.agent_code;

SELECT *
FROM agents
NATURAL JOIN customers;
