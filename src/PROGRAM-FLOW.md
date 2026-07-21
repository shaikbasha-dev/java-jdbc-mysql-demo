# Program Flow

## Introduction

Understanding the execution flow of a program is essential for learning how different components interact during runtime. This document explains the complete lifecycle of the `MySqlDemo.java` application, from the moment the program starts until it terminates.

In addition to the Java execution flow, this guide also explains how the application communicates with the MySQL database using JDBC.

---

# High-Level Program Flow

The program follows a straightforward sequence of operations.

```text
Start
   │
   ▼
Load MySqlDemo Class
   │
   ▼
Execute main() Method
   │
   ▼
Invoke Database Method
   │
   ▼
Establish Database Connection
   │
   ▼
Execute SQL Statement
   │
   ▼
Display Result
   │
   ▼
Close Resources
   │
   ▼
Program Ends
```

---

# Detailed Program Flow

The following steps describe the complete execution process.

### Step 1: Program Starts

- JVM starts the application.
- The `MySqlDemo` class is loaded into memory.

---

### Step 2: JVM Invokes `main()`

The JVM searches for the `main()` method.

```java
public static void main(String[] args)
```

This serves as the entry point of the application.

---

### Step 3: Database Method is Called

Depending on the program, one of the following methods is executed:

- `connectMySql()`
- `createTable()`
- `insertRow()`

Each method performs an independent database operation.

---

### Step 4: Database Connection Request

The application requests a database connection.

```text
DriverManager
        │
        ▼
MySQL Server
```

The JDBC DriverManager locates the appropriate JDBC driver and forwards the connection request.

---

### Step 5: Connection Object Creation

If authentication succeeds,

- Connection object is created.
- Java application becomes connected to MySQL.

```text
Java Program
      │
      ▼
Connection Object
```

---

### Step 6: Statement Object Creation

The application creates a Statement object.

```java
Statement st = con.createStatement();
```

The Statement object is responsible for sending SQL commands to the database.

---

### Step 7: SQL Execution

The SQL query is sent to MySQL.

Example:

```sql
CREATE TABLE trainers (...);
```

or

```sql
INSERT INTO trainers VALUES(...);
```

The MySQL server processes the SQL statement.

---

### Step 8: Result Returned

The database returns the execution status.

For example,

```text
1 row inserted.
```

or

```text
Table created successfully.
```

---

### Step 9: Console Output

The application displays the result.

Example:

```text
Connected Successfully

Rows Inserted : 1
```

---

### Step 10: Automatic Resource Closing

Because the program uses Try-With-Resources,

- Statement closes automatically.
- Connection closes automatically.

No manual cleanup is required.

---

### Step 11: Program Terminates

After completing all operations,

- Memory is released.
- JVM terminates the application.

---

# JVM Execution Flow

The following diagram illustrates how the JVM executes the application.

```text
User
 │
 ▼
Run Program
 │
 ▼
JVM Starts
 │
 ▼
Class Loader
 │
 ▼
Load MySqlDemo.class
 │
 ▼
Bytecode Verification
 │
 ▼
main()
 │
 ▼
Execute Java Statements
 │
 ▼
Program Ends
```

---

# JDBC Communication Flow

The JDBC API acts as a bridge between Java applications and relational databases.

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
MySQL JDBC Driver
        │
        ▼
MySQL Server
        │
        ▼
Database
```

---

# Database Communication Flow

The communication between Java and MySQL follows these steps.

```text
Java Program
      │
      ▼
Connection Request
      │
      ▼
Authentication
      │
      ▼
Database Connection
      │
      ▼
SQL Statement
      │
      ▼
Database Processing
      │
      ▼
Result
      │
      ▼
Console Output
```

---

# SQL Execution Flow

```text
Statement
      │
      ▼
executeUpdate()
      │
      ▼
SQL Query
      │
      ▼
MySQL Parser
      │
      ▼
Query Execution
      │
      ▼
Rows Affected
      │
      ▼
Return Integer Value
```

---

# Resource Management Flow

The program uses Try-With-Resources.

```text
Open Connection
        │
        ▼
Execute SQL
        │
        ▼
Complete Operation
        │
        ▼
Statement Closed
        │
        ▼
Connection Closed
```

This prevents resource leaks and improves application reliability.

---

# Exception Flow

If an error occurs during execution:

```text
Database Error
      │
      ▼
SQLException
      │
      ▼
throws Exception
      │
      ▼
JVM
      │
      ▼
Error Message
```

---

# Complete End-to-End Workflow

```text
Start
 │
 ▼
Load Class
 │
 ▼
main()
 │
 ▼
Database Method
 │
 ▼
DriverManager
 │
 ▼
Connection
 │
 ▼
Statement
 │
 ▼
executeUpdate()
 │
 ▼
Database
 │
 ▼
Rows Updated
 │
 ▼
Console Output
 │
 ▼
Close Statement
 │
 ▼
Close Connection
 │
 ▼
End
```

---

# Flow Summary

| Stage | Description |
|--------|-------------|
| Program Start | JVM starts the application. |
| Class Loading | `MySqlDemo` class is loaded. |
| Method Invocation | `main()` calls a database method. |
| Database Connection | DriverManager establishes a connection. |
| SQL Execution | Statement executes SQL commands. |
| Result Processing | Database returns the operation status. |
| Console Output | Results are displayed to the user. |
| Resource Cleanup | Connection and Statement are closed automatically. |
| Program End | JVM terminates the application. |

---

# Key Takeaways

- Every Java application starts with the `main()` method.
- JDBC acts as a bridge between Java and MySQL.
- DriverManager establishes database connections.
- Connection creates Statement objects.
- Statement executes SQL commands.
- `executeUpdate()` is used for DDL and DML operations.
- Try-With-Resources automatically closes database resources.
- Understanding the execution flow makes debugging and learning JDBC much easier.

---

# Summary

The `MySqlDemo.java` application follows a structured execution process, beginning with the JVM loading the class and invoking the `main()` method. It establishes a connection to the MySQL database through JDBC, executes SQL statements using the `Statement` interface, processes the results, displays output, and automatically releases resources. Understanding this flow provides a strong conceptual foundation for developing more advanced Java database applications.
