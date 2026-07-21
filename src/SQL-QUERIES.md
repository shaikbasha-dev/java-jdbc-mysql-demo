# SQL Queries

## Introduction

Structured Query Language (SQL) is the standard language used to communicate with relational databases. In the `MySqlDemo.java` project, SQL statements are executed through JDBC to create database objects and manipulate data stored in MySQL.

This document explains every SQL statement used in the project, including its syntax, purpose, execution process, examples, and best practices.

---

# Learning Objectives

After studying this document, you will be able to:

- Understand the SQL statements used in the project.
- Differentiate between DDL and DML statements.
- Create databases and tables.
- Insert records into database tables.
- Retrieve records for verification.
- Understand how JDBC executes SQL commands.

---

# SQL Categories Used in This Project

The project uses two categories of SQL statements.

| Category | Full Form | Purpose |
|----------|-----------|---------|
| DDL | Data Definition Language | Defines and modifies database objects |
| DML | Data Manipulation Language | Inserts and modifies data stored in tables |

---

# SQL Query 1: CREATE DATABASE

## Purpose

Creates a new database to store application data.

## Syntax

```sql
CREATE DATABASE database_name;
```

## Project Example

```sql
CREATE DATABASE sampledb;
```

## Explanation

| Keyword | Description |
|----------|-------------|
| `CREATE DATABASE` | Creates a new database |
| `sampledb` | Name of the database |

## Expected Output

```text
Query OK, 1 row affected
```

---

# SQL Query 2: USE Database

## Purpose

Selects the database in which SQL operations will be performed.

## Syntax

```sql
USE database_name;
```

## Project Example

```sql
USE sampledb;
```

## Expected Output

```text
Database changed
```

---

# SQL Query 3: CREATE TABLE

## Purpose

Creates a new table named `trainers`.

## SQL Category

Data Definition Language (DDL)

## Syntax

```sql
CREATE TABLE table_name
(
    column_name datatype,
    ...
);
```

## Project Example

```sql
CREATE TABLE trainers
(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    subject VARCHAR(100)
);
```

## Explanation

| Component | Purpose |
|-----------|---------|
| `CREATE TABLE` | Creates a new table |
| `trainers` | Table name |
| `id` | Primary key column |
| `INT` | Integer data type |
| `VARCHAR(100)` | Variable-length text up to 100 characters |
| `PRIMARY KEY` | Ensures unique values |

## Expected Output

```text
Query OK, 0 rows affected
```

---

# SQL Query 4: INSERT INTO

## Purpose

Adds a new record to the database table.

## SQL Category

Data Manipulation Language (DML)

## Syntax

```sql
INSERT INTO table_name
VALUES (...);
```

## Project Example

```sql
INSERT INTO trainers
VALUES
(
    101,
    'John',
    'Java'
);
```

## Explanation

| Value | Description |
|--------|-------------|
| `101` | Trainer ID |
| `John` | Trainer Name |
| `Java` | Subject |

## Expected Output

```text
Query OK, 1 row affected
```

---

# SQL Query 5: SELECT

## Purpose

Retrieves records from the database.

## Syntax

```sql
SELECT * FROM table_name;
```

## Project Example

```sql
SELECT * FROM trainers;
```

## Expected Output

```text
+-----+------+---------+
| id  | name | subject |
+-----+------+---------+
| 101 | John | Java    |
+-----+------+---------+
```

---

# SQL Query 6: SHOW DATABASES

## Purpose

Displays all available databases.

## Syntax

```sql
SHOW DATABASES;
```

## Expected Output

```text
information_schema
mysql
performance_schema
sampledb
sys
```

---

# SQL Query 7: SHOW TABLES

## Purpose

Lists all tables in the selected database.

## Syntax

```sql
SHOW TABLES;
```

## Example Output

```text
sample
trainers
```

---

# SQL Query 8: DESCRIBE Table

## Purpose

Displays the structure of a table.

## Syntax

```sql
DESCRIBE trainers;
```

## Example Output

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

# SQL Execution Through JDBC

The SQL statements are executed using the `Statement` interface.

Example:

```java
Statement st = con.createStatement();
st.executeUpdate(sql);
```

Execution Flow:

```text
Java Program
      │
      ▼
Statement Object
      │
      ▼
executeUpdate()
      │
      ▼
JDBC Driver
      │
      ▼
MySQL Server
      │
      ▼
SQL Executed
      │
      ▼
Execution Result
```

---

# DDL vs DML

| Feature | DDL | DML |
|---------|-----|-----|
| Full Form | Data Definition Language | Data Manipulation Language |
| Purpose | Defines database structure | Manipulates stored data |
| Project Example | CREATE TABLE | INSERT INTO |
| Affects | Database objects | Table records |

---

# SQL Keywords Used

| Keyword | Purpose |
|----------|---------|
| CREATE | Creates a database or table |
| DATABASE | Defines a new database |
| TABLE | Defines a new table |
| INSERT | Inserts records |
| INTO | Specifies the target table |
| VALUES | Supplies data to insert |
| SELECT | Retrieves records |
| FROM | Specifies the source table |
| SHOW | Displays databases or tables |
| DESCRIBE | Displays table structure |
| USE | Selects the active database |

---

# Common SQL Errors

| Error | Cause | Solution |
|--------|-------|----------|
| Unknown database | Database not created | Create the database |
| Table doesn't exist | Table missing | Create the table |
| Duplicate entry | Existing primary key | Use a unique value |
| Column count doesn't match | Incorrect number of values | Match values with columns |
| Syntax error | Invalid SQL | Review SQL syntax |

---

# Best Practices

- Use meaningful database and table names.
- Always define a primary key.
- Use appropriate data types.
- Format SQL statements for readability.
- Verify SQL statements before execution.
- Use `PreparedStatement` for dynamic values.
- Avoid hardcoding SQL in large applications.

---

# Interview Questions

1. What is SQL?
2. What is the difference between DDL and DML?
3. What is the purpose of `CREATE TABLE`?
4. What is the purpose of `INSERT INTO`?
5. What is the difference between `executeQuery()` and `executeUpdate()`?
6. Why is `PRIMARY KEY` used?
7. What does `SHOW TABLES` do?
8. What is the purpose of the `USE` statement?
9. What happens if a table already exists?
10. Why should `PreparedStatement` be preferred over `Statement`?

---

# Key Takeaways

- SQL is the language used to interact with relational databases.
- The project primarily uses DDL and DML statements.
- `CREATE TABLE` defines database structures.
- `INSERT INTO` stores records.
- `SELECT` verifies stored data.
- JDBC executes SQL statements through the `Statement` interface.
- Understanding SQL is essential for effective Java database programming.

---

# Summary

The `MySqlDemo.java` application relies on SQL to create databases, define tables, insert records, and verify stored data. Understanding the purpose, syntax, and execution of each SQL statement is fundamental to working with JDBC and relational databases. Mastering these SQL commands provides a strong foundation for building more advanced database-driven Java applications.
