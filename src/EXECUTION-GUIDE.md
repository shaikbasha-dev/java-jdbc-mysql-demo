# Execution Guide

## Introduction

This document provides a complete guide for compiling, configuring, and executing the `MySqlDemo.java` application. It explains every step required to successfully run the project, from preparing the development environment to verifying the output.

Whether you are using an IDE or the command line, this guide ensures that you can execute the application without configuration issues.

---

# Purpose

The purpose of this guide is to help learners:

- Configure the development environment
- Compile the Java source code
- Execute the application
- Verify successful database operations
- Troubleshoot common execution problems

---

# Software Requirements

| Software | Recommended Version |
|----------|----------------------|
| Java Development Kit (JDK) | 17 or later |
| MySQL Server | 8.x or later |
| MySQL Connector/J | Latest Compatible Version |
| MySQL Workbench | Latest Version |
| IDE | IntelliJ IDEA / Eclipse / VS Code |

---

# Project Structure

```text
10-Java-JDBC-MySQL-Demo
│
├── src
│   └── MySqlDemo.java
│
├── README.md
├── LICENSE
└── docs
```

---

# Step 1: Verify Java Installation

Open the terminal or command prompt and execute:

```bash
java -version
```

Example Output:

```text
java version "17.0.x"
```

Verify the Java compiler:

```bash
javac -version
```

---

# Step 2: Verify MySQL Server

Ensure the MySQL Server service is running.

You can verify this by:

- Opening MySQL Workbench
- Connecting successfully
- Executing:

```sql
SHOW DATABASES;
```

---

# Step 3: Verify Database

Ensure the required database exists.

```sql
SHOW DATABASES;
```

Expected:

```text
sampledb
```

---

# Step 4: Verify Required Tables

Select the database.

```sql
USE sampledb;
```

Display available tables.

```sql
SHOW TABLES;
```

Expected:

```text
sample
trainers
```

---

# Step 5: Configure Database Credentials

Open `MySqlDemo.java`.

Verify the following values:

```java
String url = "jdbc:mysql://localhost:3306/sampledb";
String username = "root";
String password = "root";
```

Modify these values according to your local MySQL configuration if necessary.

---

# Step 6: Add JDBC Driver

Before compiling, ensure the MySQL Connector/J library is added to the project.

Depending on your development environment:

- IntelliJ IDEA → Add JAR as Library
- Eclipse → Build Path → Add External JARs
- VS Code → Add JAR to Referenced Libraries
- Maven → Add Connector/J dependency
- Gradle → Add Connector/J dependency

---

# Step 7: Compile the Program

Using the command line:

```bash
javac MySqlDemo.java
```

If compilation succeeds:

```text
MySqlDemo.class
```

will be generated.

---

# Step 8: Execute the Program

Run the application.

```bash
java MySqlDemo
```

---

# Program Execution Flow

```text
Start
   │
   ▼
Load JVM
   │
   ▼
Load MySqlDemo.class
   │
   ▼
Invoke main()
   │
   ▼
Read JDBC URL
   │
   ▼
Create Connection
   │
   ▼
Create Statement
   │
   ▼
Execute SQL
   │
   ▼
Receive Result
   │
   ▼
Display Output
   │
   ▼
Close Resources
   │
   ▼
End
```

---

# Expected Console Output

Example:

```text
Connected Successfully

Table Created Successfully

1 Row Inserted Successfully
```

The exact output depends on the SQL operations performed by the application.

---

# Verify Database Changes

After execution, verify the inserted data.

```sql
SELECT * FROM sample;
```

or

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

# Execution Workflow

```text
Start Program
      │
      ▼
Verify Environment
      │
      ▼
Compile Java Code
      │
      ▼
Run Application
      │
      ▼
Connect Database
      │
      ▼
Execute SQL
      │
      ▼
Verify Output
      │
      ▼
End Program
```

---

# Common Execution Errors

| Error | Cause | Solution |
|--------|-------|----------|
| Java not recognized | JDK not installed or PATH not configured | Install JDK and configure PATH |
| Access denied | Incorrect database credentials | Verify username and password |
| Unknown database | Database not created | Create `sampledb` |
| Table doesn't exist | Required table missing | Create the required table |
| No suitable driver | JDBC Driver missing | Add MySQL Connector/J |
| Communications link failure | MySQL Server stopped | Start MySQL Server |
| ClassNotFoundException | Missing JDBC library | Add the Connector/J JAR |

---

# Troubleshooting Checklist

Before executing the project, verify:

- Java is installed.
- JDK PATH is configured.
- MySQL Server is running.
- Database exists.
- Required tables exist.
- JDBC Driver is configured.
- Database credentials are correct.
- Source code compiles successfully.

---

# Best Practices

- Keep database credentials in configuration files.
- Use Try-With-Resources.
- Test database connectivity before executing SQL statements.
- Validate SQL queries independently.
- Organize project dependencies properly.
- Keep the JDBC Driver updated.

---

# Execution Checklist

✔ Java Installed

✔ MySQL Running

✔ Database Created

✔ Tables Available

✔ JDBC Driver Added

✔ Credentials Verified

✔ Program Compiled

✔ Program Executed Successfully

✔ Database Records Verified

---

# Key Takeaways

- The application requires both Java and MySQL to be configured correctly.
- The JDBC Driver is mandatory for database communication.
- Always verify the database before running the application.
- Compilation should complete without errors before execution.
- Database changes should be verified after successful execution.

---

# Summary

Executing the `MySqlDemo.java` project involves preparing the Java development environment, configuring MySQL, adding the JDBC driver, compiling the source code, and running the application. By following this guide, learners can confidently execute the project, verify database operations, and troubleshoot common issues. This execution workflow provides the practical foundation required for developing larger JDBC-based Java applications.
