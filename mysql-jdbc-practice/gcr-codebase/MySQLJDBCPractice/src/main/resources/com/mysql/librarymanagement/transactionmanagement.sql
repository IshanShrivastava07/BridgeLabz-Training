-- ==========================================
-- Library Management System
-- ==========================================

CREATE DATABASE IF NOT EXISTS library_db;
USE library_db;

DROP TABLE IF EXISTS borrow_records;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS books;

-- ==========================================
-- BOOK INVENTORY TABLE
-- ==========================================
CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150) NOT NULL,
    author VARCHAR(100),
    genre VARCHAR(50),
    total_copies INT NOT NULL,
    available_copies INT NOT NULL
);

-- ==========================================
-- STUDENTS TABLE
-- ==========================================
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(100) NOT NULL,
    department VARCHAR(100)
);

-- ==========================================
-- BORROW RECORDS TABLE
-- ==========================================
CREATE TABLE borrow_records (
    borrow_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    book_id INT,
    borrow_date DATE,
    return_date DATE,
    fine DOUBLE DEFAULT 0,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

-- ==========================================
-- SAMPLE DATA
-- ==========================================
INSERT INTO books (title, author, genre, total_copies, available_copies) VALUES
('Java Fundamentals', 'James Gosling', 'Programming', 5, 5),
('Database Systems', 'Elmasri', 'Database', 3, 3),
('Operating Systems', 'Galvin', 'CS Core', 4, 4);

INSERT INTO students (student_name, department) VALUES
('Ishan', 'CSE'),
('Rahul', 'IT'),
('Sneha', 'ECE');

-- ==========================================
-- STORED PROCEDURES
-- ==========================================

DELIMITER $$

CREATE PROCEDURE borrow_book (
    IN p_student_id INT,
    IN p_book_id INT
)
BEGIN
    DECLARE available INT;

    SELECT available_copies INTO available
    FROM books
    WHERE book_id = p_book_id;

    IF available > 0 THEN
        INSERT INTO borrow_records (student_id, book_id, borrow_date)
        VALUES (p_student_id, p_book_id, CURDATE());

        UPDATE books
        SET available_copies = available_copies - 1
        WHERE book_id = p_book_id;

        SELECT 'Book Borrowed Successfully' AS Message;
    ELSE
        SELECT 'Book Not Available' AS Message;
    END IF;
END$$


CREATE PROCEDURE return_book (
    IN p_borrow_id INT
)
BEGIN
    DECLARE days_late INT;
    DECLARE calculated_fine DOUBLE;
    DECLARE b_id INT;

    SELECT DATEDIFF(CURDATE(), borrow_date), book_id
    INTO days_late, b_id
    FROM borrow_records
    WHERE borrow_id = p_borrow_id;

    IF days_late > 7 THEN
        SET calculated_fine = (days_late - 7) * 10;
    ELSE
        SET calculated_fine = 0;
    END IF;

    UPDATE borrow_records
    SET return_date = CURDATE(),
        fine = calculated_fine
    WHERE borrow_id = p_borrow_id;

    UPDATE books
    SET available_copies = available_copies + 1
    WHERE book_id = b_id;

    SELECT calculated_fine AS Fine;
END$$


CREATE PROCEDURE search_books (
    IN p_title VARCHAR(150),
    IN p_author VARCHAR(100),
    IN p_genre VARCHAR(50)
)
BEGIN
    SELECT *
    FROM books
    WHERE (p_title IS NULL OR title LIKE CONCAT('%', p_title, '%'))
      AND (p_author IS NULL OR author LIKE CONCAT('%', p_author, '%'))
      AND (p_genre IS NULL OR genre LIKE CONCAT('%', p_genre, '%'));
END$$

DELIMITER ;

-- ==========================================
-- EXECUTION SECTION
-- ==========================================

-- View Books
SELECT * FROM books;

-- Borrow Book (Student 1 borrows Book 1)
CALL borrow_book(1, 1);

-- View Books After Borrow
SELECT * FROM books;

-- Return Book (Borrow ID 1)
CALL return_book(1);

-- View Borrow Records
SELECT * FROM borrow_records;

-- Search Example
CALL search_books('Java', NULL, NULL);

-- ===============================

-- Initial Books

+---------+-------------------+---------------+-------------+-------------+------------------+
| book_id | title             | author        | genre       | total_copies| available_copies |
+---------+-------------------+---------------+-------------+-------------+------------------+
| 1       | Java Fundamentals | James Gosling | Programming | 5           | 5                |
| 2       | Database Systems  | Elmasri       | Database    | 3           | 3                |
| 3       | Operating Systems | Galvin        | CS Core     | 4           | 4                |
+---------+-------------------+---------------+-------------+-------------+------------------+

-- =================================

--Message
--Book Borrowed Successfully

--Fine: 0

-- ==================================

+-----------+------------+---------+------------+------------+------+
| borrow_id | student_id | book_id | borrow_date| return_date| fine |
+-----------+------------+---------+------------+------------+------+
| 1         | 1          | 1       | 2026-02-13 | 2026-02-13 | 0    |
+-----------+------------+---------+------------+------------+------+

-- ==================================================================

-- Search Result

+---------+-------------------+---------------+-------------+-------------+------------------+
| 1       | Java Fundamentals | James Gosling | Programming | 5           | 5                |
+---------+-------------------+---------------+-------------+-------------+------------------+

