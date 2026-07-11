-- Assessment 2
create database employeemanagement;
use employeemanagement;

CREATE TABLE Department (
   DeptID INT PRIMARY KEY,
   DeptName VARCHAR(50),
   Location VARCHAR(50)
);

INSERT INTO Department VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');

CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);

INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');

CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

-- Project Tasks
-- Basic Queries
select * from Employee;
select EmpName, Salary from Employee;
select EmpName from Employee where Salary>50000;
select EmpName from Employee where Age>30;

-- WHERE Clause
select * from Employee where DeptID in (select deptID from department where deptName = "IT");
select EmpName from Employee where Gender = "Female";
select EmpName from Employee where HireDate > '2022-01-01';

-- ORDER BY 
select * from Employee order by Salary DESC;
select * from Employee order by EmpName;

-- Aggregate Functions
select count(empID) from Employee;
select MAX(Salary) from Employee;
select MIN(Salary) from Employee;
select ROUND(AVG(Salary),2) from Employee;
select SUM(Salary) from Employee;

-- GROUP BY
select DeptID, count(*) from employee Group by DeptID;
select DeptID, AVG(Salary) from employee Group by DeptID;
select DeptID, MAX(Salary) from employee Group by DeptID;

-- JOIN Queries
select e.EmpName, d.DeptName from Employee e join Department d on e.deptID = d.deptID;
select e.EmpName, d.DeptName, d.Location from Employee e join Department d on e.deptID = d.deptID;
select e.EmpName, a.Status from Employee e join attendance a on e.EmpID = a.EmpID;

-- Update
UPDATE Employee
SET Salary = Salary * 1.10
WHERE DeptID = 103;

UPDATE Employee
SET Designation = 'Senior Software Engineer'
WHERE EmpID = 1;

UPDATE Employee
SET DeptID = 104
WHERE EmpID = 3;

-- DELETE
DELETE FROM Employee
WHERE Salary < 40000;

DELETE FROM Attendance
WHERE AttendanceDate = '2026-07-01';

-- Views
CREATE VIEW EmployeeDetails AS
SELECT e.EmpID, e.EmpName, d.DeptName, e.Salary
FROM Employee e
JOIN Department d ON e.DeptID = d.DeptID;

-- Stored Procedure
DELIMITER //

CREATE PROCEDURE GetEmployees()
BEGIN
   SELECT * FROM Employee;
END //

DELIMITER ;

Call GetEmployees();

