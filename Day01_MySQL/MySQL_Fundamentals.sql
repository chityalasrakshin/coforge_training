CREATE DATABASE School;
USE School;

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50),
    Age INT,
    Gender VARCHAR(10),
    City VARCHAR(50)
);

INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES (101, 'Rahul', 20, 'Male', 'Hyderabad');

INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES (102, 'Priya', 19, 'Female', 'Chennai');

INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES (103, 'Arjun', 21, 'Male', 'Bengaluru');

INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES (104, 'Sneha', 20, 'Female', 'Mumbai');

INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES (105, 'Kiran', 22, 'Male', 'Pune');


-- 1. Display all records
SELECT * FROM Students;

-- 2. Display only Name and City
SELECT Name, City FROM Students;

-- 3. Students aged greater than 20
SELECT * FROM Students WHERE Age > 20;

-- 4. Female students
SELECT * FROM Students WHERE Gender = 'Female';

-- 5. Students from Hyderabad
SELECT * FROM Students WHERE City = 'Hyderabad';

-- 1. Sort by Name (A-Z)
SELECT * FROM Students ORDER BY Name ASC;

-- 2. Sort by Age (highest first)
SELECT * FROM Students ORDER BY Age DESC;

-- 3. Sort by City then Name
SELECT * FROM Students ORDER BY City, Name;

-- 1. Age between 19 and 21
SELECT * FROM Students WHERE Age BETWEEN 19 AND 21;

-- 2. Name starts with 'R'
SELECT * FROM Students WHERE Name LIKE 'R%';

-- 3. City ends with 'i'
SELECT * FROM Students WHERE City LIKE '%i';

-- 4. Age is 20 or 22
SELECT * FROM Students WHERE Age IN (20, 22);

SET SQL_SAFE_UPDATES = 0;
-- 1. Change Rahul's city to Delhi
UPDATE Students
SET City = 'Delhi'
WHERE Name = 'Rahul';

-- 2. Increase Arjun's age by 1
UPDATE Students
SET Age = Age + 1
WHERE Name = 'Arjun';

-- 3. Change Sneha's city to Kolkata
UPDATE Students
SET City = 'Kolkata'
WHERE Name = 'Sneha';

-- 1. Delete student with StudentID 105
DELETE FROM Students
WHERE StudentID = 105;

-- 2. Delete all students from Chennai
DELETE FROM Students
WHERE City = 'Chennai';