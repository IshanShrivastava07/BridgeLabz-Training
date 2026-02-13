-- ==========================================
-- Employee Management System - MySQL Script
-- ==========================================

-- Create Database
CREATE DATABASE IF NOT EXISTS company_db;
USE company_db;

-- Drop table if already exists
DROP TABLE IF EXISTS employees;

-- Create Employees Table
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL
);

-- Insert Sample Employees
INSERT INTO employees (name, salary) VALUES
('Ishan', 50000),
('Rahul', 60000),
('Sneha', 55000),
('Amit', 45000);

-- ==========================================
-- VIEW ALL EMPLOYEES
-- ==========================================
SELECT * FROM employees;

-- ==========================================
-- UPDATE EMPLOYEE SALARY
-- ==========================================
UPDATE employees 
SET salary = 70000 
WHERE id = 2;

SELECT * FROM employees;

-- ==========================================
-- SEARCH EMPLOYEE BY NAME
-- ==========================================
SELECT * FROM employees 
WHERE name LIKE '%Sneha%';

-- ==========================================
-- DELETE EMPLOYEE
-- ==========================================
DELETE FROM employees 
WHERE id = 4;

SELECT * FROM employees;

-- ==========================================

-- After Initial Insert
+----+--------+--------+
| id | name   | salary |
+----+--------+--------+
|  1 | Ishan  | 50000  |
|  2 | Rahul  | 60000  |
|  3 | Sneha  | 55000  |
|  4 | Amit   | 45000  |
+----+--------+--------+

-- ==========================================

-- After Updating Rahul Salary (id=2 → 70000)
+----+--------+--------+
| id | name   | salary |
+----+--------+--------+
|  1 | Ishan  | 50000  |
|  2 | Rahul  | 70000  |
|  3 | Sneha  | 55000  |
|  4 | Amit   | 45000  |
+----+--------+--------+

-- ==========================================

-- Search Result (Sneha)
+----+--------+--------+
| id | name   | salary |
+----+--------+--------+
|  3 | Sneha  | 55000  |
+----+--------+--------+

-- ==========================================

-- After Deleting Employee id = 4
+----+--------+--------+
| id | name   | salary |
+----+--------+--------+
|  1 | Ishan  | 50000  |
|  2 | Rahul  | 70000  |
|  3 | Sneha  | 55000  |
+----+--------+--------+

-- ==========================================
