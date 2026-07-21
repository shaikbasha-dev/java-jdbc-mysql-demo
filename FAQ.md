# Frequently Asked Questions (FAQ)

## Introduction

This document answers the most frequently asked questions about the **10-Java-JDBC-MySQL-Demo** project. It is intended to help learners quickly resolve common doubts related to project setup, Java, JDBC, MySQL, SQL, execution, troubleshooting, and best practices.

Whether you are running the project for the first time or revising JDBC concepts before an interview, this FAQ serves as a quick reference guide.

---

# General Questions

## 1. What is this project?

This project demonstrates how a Java application communicates with a MySQL database using JDBC (Java Database Connectivity).

It covers:

- Database connectivity
- SQL execution
- Table creation
- Data insertion
- Exception handling
- Resource management

---

## 2. Who should use this project?

This repository is suitable for:

- Students
- Beginners learning JDBC
- Java developers
- Interview candidates
- Anyone interested in Java database programming

---

## 3. What technologies are used?

- Java
- JDBC
- MySQL
- SQL
- MySQL Connector/J

---

## 4. What Java version is recommended?

Java 17 or later is recommended.

---

## 5. Which database is used?

MySQL Database Server.

---

# Installation Questions

## 6. Do I need to install MySQL?

Yes.

The project requires a running MySQL Server instance.

---

## 7. Do I need MySQL Workbench?

No.

It is optional but highly recommended because it simplifies database management.

---

## 8. Do I need the JDBC Driver?

Yes.

Without the MySQL Connector/J driver, Java cannot communicate with MySQL.

---

## 9. Where should the JDBC Driver be added?

It depends on your project setup:

- IntelliJ IDEA → Libraries
- Eclipse → Build Path
- VS Code → Referenced Libraries
- Maven → Dependencies
- Gradle → Dependencies

---

## 10. Which port does MySQL use?

Default:

```text
3306
```

---

# Database Questions

## 11. Which database should be created?

```sql
sampledb
```

---

## 12. Which tables are used?

- sample
- trainers

---

## 13. How do I verify the database?

```sql
SHOW DATABASES;
```

---

## 14. How do I verify the tables?

```sql
SHOW TABLES;
```

---

## 15. How do I check inserted records?

```sql
SELECT * FROM trainers;
```

or

```sql
SELECT * FROM sample;
```

---

# JDBC Questions

## 16. What is JDBC?

JDBC is the standard Java API for connecting Java applications to relational databases.

---

## 17. What package contains JDBC classes?

```java
java.sql
```

---

## 18. Why is DriverManager used?

It establishes a connection between Java and the database.

---

## 19. Why is Connection required?

It represents an active database session.

---

## 20. Why is Statement used?

It executes SQL statements.

---

## 21. Why is PreparedStatement not used?

This project is designed as a beginner-friendly JDBC demonstration.

For production applications, `PreparedStatement` is strongly recommended because it:

- Prevents SQL injection
- Improves performance
- Supports parameterized queries

---

# SQL Questions

## 22. Which SQL statements are demonstrated?

- CREATE DATABASE
- CREATE TABLE
- INSERT INTO
- SELECT
- SHOW DATABASES
- SHOW TABLES
- DESCRIBE

---

## 23. What is DDL?

Data Definition Language.

Examples:

- CREATE
- ALTER
- DROP

---

## 24. What is DML?

Data Manipulation Language.

Examples:

- INSERT
- UPDATE
- DELETE

---

## 25. Why is executeUpdate() used?

Because the project performs DDL and DML operations.

---

# Execution Questions

## 26. How do I run the project?

1. Install Java.
2. Install MySQL.
3. Create the database.
4. Configure credentials.
5. Add the JDBC Driver.
6. Compile the project.
7. Execute the program.

---

## 27. Why am I getting "Access denied"?

Possible reasons:

- Incorrect username
- Incorrect password

Verify the database credentials.

---

## 28. Why am I getting "Unknown database"?

The required database has not been created.

Execute:

```sql
CREATE DATABASE sampledb;
```

---

## 29. Why am I getting "Table doesn't exist"?

Create the required table before executing SQL operations.

---

## 30. Why am I get "No suitable driver"?

The MySQL Connector/J library is missing from the project.

Add the JDBC Driver to your project dependencies.

---

# Exception Handling Questions

## 31. Why does the project use `throws Exception`?

To keep the demonstration simple and focus on JDBC fundamentals.

Production applications should use specific exception handling.

---

## 32. What is SQLException?

A database-related exception thrown when SQL operations fail.

---

## 33. What is Try-With-Resources?

A Java feature that automatically closes resources such as:

- Connection
- Statement
- ResultSet

---

# Best Practices Questions

## 34. Why should database credentials not be hardcoded?

Hardcoded credentials create security risks and make configuration changes difficult.

---

## 35. Why should PreparedStatement be preferred?

It provides:

- Better security
- Better performance
- Cleaner code

---

## 36. Why should resources be closed?

To prevent:

- Connection leaks
- Memory leaks
- Resource exhaustion

---

## 37. Should SQL statements be formatted?

Yes.

Readable SQL improves maintenance and debugging.

---

## 38. Should methods perform only one task?

Yes.

Following the Single Responsibility Principle improves readability, testing, and maintainability.

---

# Troubleshooting Questions

## 39. The program compiles but doesn't connect.

Check:

- MySQL Server status
- Database credentials
- JDBC URL
- JDBC Driver configuration

---

## 40. The SQL statement fails.

Verify:

- SQL syntax
- Database name
- Table name
- Column names
- Data types

---

## 41. Records are not inserted.

Verify:

- Database connection
- SQL statement
- Primary key values
- Table existence

---

## 42. The application crashes unexpectedly.

Review:

- Stack trace
- Exception message
- Database logs
- Console output

---

# Project Questions

## 43. Can this project be extended?

Yes.

Possible enhancements include:

- CRUD operations
- PreparedStatement
- ResultSet
- Transactions
- Batch Processing
- Stored Procedures
- Connection Pooling
- Logging
- Maven or Gradle integration

---

## 44. Is this project suitable for interviews?

Yes.

It demonstrates fundamental JDBC concepts commonly discussed in Java Full Stack and backend development interviews.

---

## 45. Which concepts should I learn next?

Recommended learning path:

1. PreparedStatement
2. ResultSet
3. Batch Processing
4. Transactions
5. CallableStatement
6. Connection Pooling
7. Hibernate
8. Spring Data JPA
9. Spring Boot

---

# Quick Tips

- Verify Java installation before running the project.
- Ensure MySQL Server is running.
- Add the JDBC Driver correctly.
- Check database credentials.
- Verify SQL statements independently.
- Use Try-With-Resources.
- Prefer PreparedStatement in real-world applications.
- Read exception messages carefully.

---

# Additional Resources

Refer to the following project documentation for more details:

- README.md
- src/README.md
- src/JDBC-ARCHITECTURE.md
- src/MYSQL-CONNECTION-GUIDE.md
- src/DATABASE-SETUP.md
- src/EXECUTION-GUIDE.md
- src/EXCEPTION-HANDLING.md
- src/BEST-PRACTICES.md
- INTERVIEW-QUESTIONS.md

---

# Key Takeaways

- Covers the most common questions about the project.
- Helps resolve setup and execution issues quickly.
- Explains important JDBC and MySQL concepts.
- Provides troubleshooting guidance.
- Acts as a quick reference for learners and interview candidates.

---

# Summary

The FAQ document serves as a centralized knowledge base for the **10-Java-JDBC-MySQL-Demo** project. It answers common questions related to project setup, execution, JDBC architecture, SQL operations, exception handling, troubleshooting, and best practices. By consulting this guide, learners can quickly resolve issues, strengthen their understanding of JDBC, and make more effective use of the repository as a learning resource.
