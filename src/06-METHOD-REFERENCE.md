# Method Reference

## Introduction

This document provides a detailed reference for every method used in the `MySqlDemo.java` program. Each method is explained individually, including its purpose, syntax, parameters, return type, exceptions, workflow, and real-world usage.

Understanding each method independently helps learners understand how different parts of the program work together to perform database operations.

---

# Method Summary

| Method | Description |
|---------|-------------|
| `main()` | Entry point of the application. |
| `connectMySql()` | Connects to the MySQL database and inserts a record into the `sample` table. |
| `createTable()` | Creates the `trainers` table in the database. |
| `insertRow()` | Inserts a new record into the `trainers` table. |

---

# Method 1: main()

## Method Signature

```java
public static void main(String[] args) throws Exception
```

---

## Purpose

The `main()` method is the entry point of the Java application. When the program starts, the Java Virtual Machine (JVM) invokes this method first.

---

## Syntax Breakdown

| Component | Description |
|-----------|-------------|
| `public` | Accessible from anywhere. |
| `static` | Can be executed without creating an object. |
| `void` | Does not return any value. |
| `main()` | Standard entry point recognized by the JVM. |
| `String[] args` | Stores command-line arguments. |
| `throws Exception` | Passes exceptions to the JVM. |

---

## Parameters

| Parameter | Type | Description |
|-----------|------|-------------|
| `args` | `String[]` | Stores command-line arguments passed during program execution. |

---

## Return Type

```text
void
```

The method does not return any value.

---

## Exceptions

```text
Exception
```

Any exception occurring during execution is propagated to the JVM.

---

## Responsibilities

- Starts program execution.
- Calls the required database method.
- Terminates after execution completes.

---

## Workflow

```text
Program Starts
       │
       ▼
main()
       │
       ▼
Invoke Database Method
       │
       ▼
Program Ends
```

---

## Example

```java
public static void main(String[] args) throws Exception
{
    connectMySql();
}
```

---

## Real-World Usage

Every Java application, regardless of its complexity, begins execution with the `main()` method.

---

# Method 2: connectMySql()

## Method Signature

```java
public static void connectMySql() throws Exception
```

---

## Purpose

Establishes a connection with the MySQL database and executes an SQL INSERT statement.

---

## Return Type

```text
void
```

---

## Parameters

```text
No Parameters
```

---

## Exceptions

```text
Exception
```

---

## Responsibilities

- Define database URL.
- Define username.
- Define password.
- Establish database connection.
- Create Statement object.
- Execute SQL statement.
- Display affected rows.
- Close resources automatically.

---

## Workflow

```text
Create URL
      │
      ▼
Create Connection
      │
      ▼
Create Statement
      │
      ▼
Execute INSERT
      │
      ▼
Display Result
      │
      ▼
Close Resources
```

---

## Example

```java
connectMySql();
```

---

## Real-World Usage

Used in applications that need to establish a connection and perform simple database operations.

---

# Method 3: createTable()

## Method Signature

```java
public static void createTable() throws Exception
```

---

## Purpose

Creates the `trainers` table in the MySQL database.

---

## Return Type

```text
void
```

---

## Parameters

```text
No Parameters
```

---

## Exceptions

```text
Exception
```

---

## Responsibilities

- Connect to MySQL.
- Create Statement object.
- Execute CREATE TABLE statement.
- Display success message.
- Close resources.

---

## Workflow

```text
Connect Database
       │
       ▼
Create Statement
       │
       ▼
Execute CREATE TABLE
       │
       ▼
Table Created
       │
       ▼
Close Resources
```

---

## Example

```java
createTable();
```

---

## Real-World Usage

Used during database initialization to create tables before storing application data.

---

# Method 4: insertRow()

## Method Signature

```java
public static void insertRow() throws Exception
```

---

## Purpose

Inserts a new record into the `trainers` table.

---

## Return Type

```text
void
```

---

## Parameters

```text
No Parameters
```

---

## Exceptions

```text
Exception
```

---

## Responsibilities

- Connect to database.
- Create Statement object.
- Execute INSERT statement.
- Display affected rows.
- Close resources.

---

## Workflow

```text
Connect Database
       │
       ▼
Create Statement
       │
       ▼
Execute INSERT
       │
       ▼
Display Rows Inserted
       │
       ▼
Close Resources
```

---

## Example

```java
insertRow();
```

---

## Real-World Usage

Used in applications that need to store new records in a database, such as registration systems, inventory systems, banking applications, and employee management systems.

---

# Method Relationships

```text
main()
   │
   ├──────────────┐
   ▼              ▼
connectMySql()  createTable()
                     │
                     ▼
                insertRow()
```

Each method performs a specific responsibility, making the program modular, readable, and easier to maintain.

---

# Method Comparison

| Method | Purpose | Database Operation | SQL Category |
|---------|---------|-------------------|--------------|
| `main()` | Starts the application | No | N/A |
| `connectMySql()` | Connects and inserts into `sample` table | INSERT | DML |
| `createTable()` | Creates `trainers` table | CREATE TABLE | DDL |
| `insertRow()` | Inserts a record into `trainers` table | INSERT | DML |

---

# Best Practices

- Keep each method focused on a single responsibility.
- Use descriptive method names.
- Avoid duplicating database connection logic.
- Use Try-With-Resources to manage database resources.
- Consider using `PreparedStatement` instead of `Statement` when accepting user input.
- Handle exceptions appropriately in production applications.

---

# Common Mistakes

- Calling a method before establishing a database connection.
- Using incorrect database credentials.
- Writing invalid SQL statements.
- Forgetting to close database resources.
- Using `Statement` with user-supplied input, which can lead to SQL injection.

---

# Key Takeaways

- Each method has a well-defined responsibility.
- `main()` starts the application.
- `connectMySql()` establishes a connection and performs a database operation.
- `createTable()` creates database structures.
- `insertRow()` stores data in the database.
- Modular methods improve readability, maintainability, and code reuse.

---

# Summary

The `MySqlDemo.java` program is organized into small, focused methods, each performing a specific task in the JDBC workflow. Understanding the purpose, parameters, execution flow, and responsibilities of each method makes it easier to understand the complete application and provides a strong foundation for building larger Java database applications.
