# Database Setup

## Introduction

Before executing the `MySqlDemo.java` application, the required MySQL database and tables must be created. This document provides a complete guide for setting up the database environment used in this project.

It explains how to create the database, create tables, verify the database objects, insert sample records, and prepare the database for successful execution of the JDBC application.

---

# Purpose

The purpose of this document is to help developers and learners create the required database environment before running the project.

A proper database setup ensures that:

- The application connects successfully.
- SQL statements execute without errors.
- Required tables are available.
- Sample records can be inserted successfully.

---

# Prerequisites

Before setting up the database, ensure the following software is installed:

| Software | Recommended Version |
|----------|----------------------|
| MySQL Server | 8.x or later |
| MySQL Workbench | Latest Version |
| Java Development Kit (JDK) | 17 or later |
| MySQL Connector/J | Latest Compatible Version |

---

# Step 1: Start MySQL Server

Ensure that the MySQL Server service is running.

You can verify this by opening MySQL Workbench or using the command line.

---

# Step 2: Log in to MySQL

Open the MySQL Command Line Client or MySQL Workbench and log in using your database credentials.

Example:

```sql
mysql -u root -p
```

Enter your password when prompted.

---

# Step 3: Create the Database

Execute the following SQL statement:

```sql
CREATE DATABASE sampledb;
```

If the database already exists, use:

```sql
CREATE DATABASE IF NOT EXISTS sampledb;
```

---

# Step 4: Verify the Database

Display all available databases.

```sql
SHOW DATABASES;
```

Example Output:

```text
information_schema
mysql
performance_schema
sampledb
sys
```

---

# Step 5: Select the Database

Before creating tables, select the required database.

```sql
USE sampledb;
```

Expected Output:

```text
Database changed
```

---

# Step 6: Create the `sample` Table

The `connectMySql()` method inserts data into the `sample` table.

Create the table using:

```sql
CREATE TABLE sample
(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);
```

---

# Step 7: Verify the Table

Display all tables inside the selected database.

```sql
SHOW TABLES;
```

Expected Output:

```text
sample
```

---

# Step 8: Create the `trainers` Table

The `createTable()` method creates this table programmatically.

If you prefer to create it manually, execute:

```sql
CREATE TABLE trainers
(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    subject VARCHAR(100)
);
```

---

# Step 9: Describe the Table Structure

View the table structure.

```sql
DESCRIBE trainers;
```

Example Output:

```text
+---------+--------------+------+-----+---------+-------+
| Field   | Type         | Null | Key | Default | Extra |
+---------+--------------+------+-----+---------+-------+
| id      | int          | NO   | PRI | NULL    |       |
| name    | varchar(100) | YES  |     | NULL    |       |
| subject | varchar(100) | YES  |     | NULL    |       |
+---------+--------------+------+-----+---------+-------+
```

---

# Step 10: Insert Sample Data

Insert a sample record.

```sql
INSERT INTO trainers
VALUES
(
    101,
    'John',
    'Java'
);
```

---

# Step 11: Verify Inserted Records

Retrieve all records.

```sql
SELECT * FROM trainers;
```

Example Output:

```text
+-----+------+---------+
| id  | name | subject |
+-----+------+---------+
| 101 | John | Java    |
+-----+------+---------+
```

---

# Step 12: Verify the `sample` Table

Execute:

```sql
SELECT * FROM sample;
```

This verifies that the `connectMySql()` method inserted data successfully.

---

# Complete Database Setup Flow

```text
Install MySQL
       │
       ▼
Start MySQL Server
       │
       ▼
Login
       │
       ▼
Create Database
       │
       ▼
Select Database
       │
       ▼
Create Tables
       │
       ▼
Verify Tables
       │
       ▼
Insert Sample Data
       │
       ▼
Verify Records
       │
       ▼
Run Java Program
```

---

# Database Objects Used

| Object | Purpose |
|---------|---------|
| Database | Stores application tables |
| sample Table | Used by `connectMySql()` |
| trainers Table | Used by `createTable()` and `insertRow()` |

---

# SQL Commands Used

| Command | Purpose |
|----------|---------|
| `CREATE DATABASE` | Creates a new database |
| `USE` | Selects the database |
| `CREATE TABLE` | Creates a table |
| `SHOW DATABASES` | Lists all databases |
| `SHOW TABLES` | Lists all tables |
| `DESCRIBE` | Displays table structure |
| `INSERT INTO` | Inserts records |
| `SELECT` | Retrieves records |

---

# Common Setup Errors

| Error | Cause | Solution |
|--------|-------|----------|
| Unknown database | Database not created | Create the database |
| Table doesn't exist | Table missing | Create the required table |
| Access denied | Incorrect credentials | Verify username and password |
| Duplicate entry | Existing primary key | Use a unique ID |
| Connection refused | MySQL service stopped | Start MySQL Server |

---

# Best Practices

- Use meaningful database names.
- Define primary keys for tables.
- Choose appropriate data types.
- Verify every SQL statement after execution.
- Keep backup copies of important databases.
- Use `IF NOT EXISTS` when creating databases or tables.
- Follow consistent naming conventions.

---

# Database Setup Checklist

Before running the project, verify the following:

- MySQL Server is running.
- Database `sampledb` exists.
- Required tables are created.
- Sample records are inserted (if required).
- JDBC URL matches the database name.
- Username and password are correct.
- MySQL Connector/J is configured.

---

# Screenshots (Recommended)

You may include screenshots of:

- MySQL Server connection
- Database creation
- Table creation
- Table structure
- Inserted records
- Successful query execution

These screenshots help beginners verify that each setup step has been completed correctly.

---

# Key Takeaways

- A properly configured database is essential for JDBC applications.
- Creating the database is the first step before executing Java code.
- Tables must exist before inserting records.
- SQL verification commands help confirm successful setup.
- Following a structured setup process minimizes runtime errors.

---

# Summary

This document provides a complete guide to preparing the MySQL environment required for the `MySqlDemo.java` project. By creating the database, configuring the tables, verifying their structure, inserting sample data, and validating the setup, you ensure that the JDBC application can execute successfully without database-related issues. This setup process forms the foundation for developing reliable Java database applications.
