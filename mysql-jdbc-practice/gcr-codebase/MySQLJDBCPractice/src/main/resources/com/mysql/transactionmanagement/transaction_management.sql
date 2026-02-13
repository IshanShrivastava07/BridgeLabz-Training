-- ==========================================
-- Banking System with Transaction Management
-- ==========================================

CREATE DATABASE IF NOT EXISTS banking_db;
USE banking_db;

-- Drop existing tables
DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS accounts;

-- ==============================
-- ACCOUNTS TABLE
-- ==============================
CREATE TABLE accounts (
    account_id INT PRIMARY KEY AUTO_INCREMENT,
    account_holder VARCHAR(100) NOT NULL,
    balance DOUBLE NOT NULL CHECK (balance >= 0)
);

-- ==============================
-- TRANSACTION HISTORY TABLE
-- ==============================
CREATE TABLE transactions (
    transaction_id INT PRIMARY KEY AUTO_INCREMENT,
    from_account INT,
    to_account INT,
    amount DOUBLE,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (from_account) REFERENCES accounts(account_id),
    FOREIGN KEY (to_account) REFERENCES accounts(account_id)
);

-- ==============================
-- INSERT SAMPLE DATA
-- ==============================
INSERT INTO accounts (account_holder, balance) VALUES
('Ishan', 10000),
('Rahul', 8000),
('Sneha', 15000);

-- ==============================

SELECT account_id, account_holder, balance 
FROM accounts;

-- ==============================

+------------+---------------+---------+
| account_id | account_holder| balance |
+------------+---------------+---------+
| 1          | Ishan         | 10000   |
| 2          | Rahul         | 8000    |
| 3          | Sneha         | 15000   |
+------------+---------------+---------+

-- ==============================

START TRANSACTION;

-- Deduct from sender
UPDATE accounts
SET balance = balance - 2000
WHERE account_id = 1 AND balance >= 2000;

-- Add to receiver
UPDATE accounts
SET balance = balance + 2000
WHERE account_id = 2;

-- Record transaction
INSERT INTO transactions (from_account, to_account, amount)
VALUES (1, 2, 2000);

COMMIT;

-- ==============================

+------------+---------------+---------+
| account_id | account_holder| balance |
+------------+---------------+---------+
| 1          | Ishan         | 8000    |
| 2          | Rahul         | 10000   |
| 3          | Sneha         | 15000   |
+------------+---------------+---------+

-- ================================

SELECT * FROM transactions;

+---------------+--------------+------------+--------+---------------------+
| transaction_id| from_account | to_account | amount | transaction_date    |
+---------------+--------------+------------+--------+---------------------+
| 1             | 1            | 2          | 2000   | 2026-02-13 12:10:23 |
+---------------+--------------+------------+--------+---------------------+








