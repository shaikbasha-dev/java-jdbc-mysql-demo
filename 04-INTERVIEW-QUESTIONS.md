# Java JDBC MySQL Demo – Interview Questions

## Introduction

This document contains a comprehensive collection of interview questions related to the **10-Java-JDBC-MySQL-Demo** project. The questions cover Java fundamentals, JDBC architecture, MySQL, SQL, exception handling, best practices, and real-world development concepts.

The objective of this document is to help learners revise important concepts after completing the project and prepare confidently for technical interviews.

---

# Table of Contents

1. Java Fundamentals
2. JDBC Fundamentals
3. JDBC Architecture
4. JDBC API
5. MySQL Questions
6. SQL Questions
7. Project-Based Questions
8. Exception Handling
9. Best Practices
10. Scenario-Based Questions
11. Advanced JDBC Questions
12. Rapid Fire Questions

---

# 1. Java Fundamentals

### 1. What is Java?

Java is an object-oriented, platform-independent programming language developed by Sun Microsystems (now Oracle).

---

### 2. What is JVM?

The Java Virtual Machine (JVM) executes Java bytecode and enables platform independence.

---

### 3. What is JDK?

The Java Development Kit (JDK) contains the tools required to develop, compile, and execute Java applications.

---

### 4. What is JRE?

The Java Runtime Environment (JRE) provides the libraries and JVM required to run Java applications.

---

### 5. What is Platform Independence?

Java programs are compiled into bytecode, which can execute on any operating system that has a compatible JVM.

---

# 2. JDBC Fundamentals

### 6. What is JDBC?

JDBC (Java Database Connectivity) is the standard Java API used to connect Java applications with relational databases.

---

### 7. Why is JDBC used?

JDBC enables Java applications to:

- Connect to databases
- Execute SQL statements
- Retrieve results
- Perform CRUD operations

---

### 8. What package contains JDBC classes?

```java
java.sql
```

---

### 9. What is a JDBC Driver?

A JDBC Driver is software that translates JDBC calls into database-specific commands.

---

### 10. Which JDBC Driver is used in this project?

MySQL Connector/J

---

# 3. JDBC Architecture

### 11. Explain JDBC Architecture.

```text
Java Application
        │
        ▼
JDBC API
        │
        ▼
DriverManager
        │
        ▼
JDBC Driver
        │
        ▼
MySQL Server
        │
        ▼
Database
```

---

### 12. What is DriverManager?

The `DriverManager` class manages database drivers and establishes database connections.

---

### 13. What is Connection?

The `Connection` interface represents an active session between a Java application and the database.

---

### 14. What is Statement?

The `Statement` interface executes SQL statements.

---

### 15. What is executeUpdate()?

It executes:

- INSERT
- UPDATE
- DELETE
- CREATE
- ALTER
- DROP

and returns the number of affected rows.

---

# 4. JDBC API

### 16. Difference between Statement and PreparedStatement?

| Statement | PreparedStatement |
|------------|------------------|
| Simple SQL | Parameterized SQL |
| Slower | Faster |
| SQL Injection Possible | Prevents SQL Injection |
| Recompiled repeatedly | Precompiled |

---

### 17. What is ResultSet?

ResultSet stores data returned by a SELECT query.

---

### 18. What is CallableStatement?

Used to execute stored procedures.

---

### 19. What is SQLException?

An exception generated when a database-related error occurs.

---

### 20. What is Try-With-Resources?

A Java feature that automatically closes resources such as:

- Connection
- Statement
- ResultSet

---

# 5. MySQL Questions

### 21. What is MySQL?

MySQL is an open-source relational database management system.

---

### 22. Default MySQL Port?

```text
3306
```

---

### 23. What is a Database?

A collection of logically related tables.

---

### 24. What is a Table?

A collection of rows and columns used to store data.

---

### 25. What is a Primary Key?

A column that uniquely identifies each record in a table.

---

# 6. SQL Questions

### 26. What is SQL?

Structured Query Language used for managing relational databases.

---

### 27. Difference between DDL and DML?

| DDL | DML |
|-----|-----|
| Defines structure | Manipulates data |
| CREATE | INSERT |
| ALTER | UPDATE |
| DROP | DELETE |

---

### 28. What does CREATE TABLE do?

Creates a new table in the database.

---

### 29. What does INSERT INTO do?

Inserts records into a table.

---

### 30. What does SELECT do?

Retrieves records from a table.

---

# 7. Project-Based Questions

### 31. Explain the workflow of this project.

```text
Start
 ↓
Connect Database
 ↓
Create Statement
 ↓
Execute SQL
 ↓
Display Output
 ↓
Close Resources
 ↓
End
```

---

### 32. Which classes are used in this project?

- DriverManager
- Connection
- Statement

---

### 33. Which SQL statements are used?

- CREATE DATABASE
- CREATE TABLE
- INSERT INTO
- SELECT

---

### 34. Why is executeUpdate() used?

Because the project performs DDL and DML operations.

---

### 35. Why is Try-With-Resources used?

To automatically close database resources.

---

# 8. Exception Handling

### 36. What exception is commonly thrown by JDBC?

```text
SQLException
```

---

### 37. What happens if the database does not exist?

A SQLException is thrown.

---

### 38. What happens if MySQL Server is stopped?

The connection attempt fails, resulting in a database connectivity exception.

---

### 39. Why should specific exceptions be caught?

They provide more meaningful error handling and simplify debugging.

---

### 40. Difference between throw and throws?

| throw | throws |
|--------|---------|
| Used to explicitly throw an exception | Declares that a method may throw exceptions |

---

# 9. Best Practices

### 41. Why should PreparedStatement be preferred?

- Prevents SQL Injection
- Better performance
- Supports parameters

---

### 42. Why shouldn't passwords be hardcoded?

It creates a security risk.

---

### 43. Why should resources be closed?

To prevent memory and connection leaks.

---

### 44. Why should SQL be formatted?

Improves readability and maintainability.

---

### 45. Why use meaningful method names?

Improves code readability and maintainability.

---

# 10. Scenario-Based Questions

### 46. How would you prevent SQL Injection?

Use `PreparedStatement`.

---

### 47. How would you insert multiple records efficiently?

Use Batch Processing.

---

### 48. How would you retrieve records?

Use:

```java
executeQuery()
```

with a `ResultSet`.

---

### 49. How would you improve this project?

- PreparedStatement
- Transactions
- Logging
- Connection Pooling
- Configuration files

---

### 50. How would you deploy this application?

- Externalize configuration
- Secure credentials
- Use connection pooling
- Implement logging
- Add proper exception handling

---

# 11. Advanced JDBC Questions

- What is Connection Pooling?
- What is Auto Commit?
- What is Transaction Management?
- What is Commit?
- What is Rollback?
- What are Stored Procedures?
- What is DatabaseMetaData?
- What is ResultSetMetaData?
- What is Batch Processing?
- What are Scrollable ResultSets?

---

# 12. Rapid Fire Questions

- What is JDBC?
- What is SQL?
- What is DriverManager?
- What is Connection?
- What is Statement?
- What is PreparedStatement?
- What is ResultSet?
- What is SQLException?
- What is executeQuery()?
- What is executeUpdate()?
- What is MySQL?
- What is a Primary Key?
- What is a Foreign Key?
- What is DDL?
- What is DML?
- What is Try-With-Resources?
- What is SQL Injection?
- What is Connection Pooling?
- What is Transaction?
- What is Rollback?

---

# Interview Preparation Tips

- Understand the complete JDBC architecture.
- Practice writing SQL queries manually.
- Explain every class used in the project.
- Know the purpose of each method.
- Be able to draw the JDBC workflow.
- Learn common JDBC exceptions.
- Practice CRUD operations.
- Revise Java exception handling.
- Explain why PreparedStatement is preferred.
- Understand real-world JDBC best practices.

---

# Key Takeaways

- Covers beginner to intermediate JDBC interview questions.
- Includes Java, SQL, MySQL, and JDBC concepts.
- Focuses on project-based and scenario-based questions.
- Helps strengthen conceptual understanding.
- Serves as a quick revision guide before interviews.

---

# Summary

This interview question bank is designed to complement the **10-Java-JDBC-MySQL-Demo** project by covering the concepts most frequently asked in Java and JDBC technical interviews. Reviewing these questions after completing the project reinforces theoretical knowledge, improves problem-solving skills, and builds confidence for coding tests, technical discussions, and software engineering interviews.
