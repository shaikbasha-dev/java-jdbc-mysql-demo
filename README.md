# JDBC with MySQL Demo Project

##  Project Overview
This project demonstrates how a Java application connects to a MySQL database using JDBC (Java Database Connectivity). It breaks down how to build database schemas, insert table rows, and manage active system connections cleanly.

---

##  Technologies Used
* **Java** (Programming Language)
* **JDBC API** (Database Connection Management)
* **MySQL** (Database Server Engine)
* **SQL** (Structured Query Language)

---

##  Method Registry & Technical Specs

Here is a quick look at how every method in our code behaves under the hood:

| Method Name | Access Scope | Input Parameters | What it does (Core Mechanism) |
| :--- | :--- | :--- | :--- |
| `main` | `public static` | `String[] args` | Main thread entry gate; handles the order of execution. |
| `connectMySql` | `public static` | None | Performs basic connection validation and prints the connection object to the console. |
| `createTable` | `public static` | None | Runs structural SQL commands (DDL) to dynamically build new tables. |
| `insertRow` | `public static` | None | Executes standard SQL insert statements to save new data rows. |

---

##  Architectural Processes Explained

### 1. Automatic Resource Management (Try-With-Resources)
Instead of manually opening and closing things, our program initializes `Connection` and `Statement` inside a `try()` block like this:

try (Connection con = ...; Statement st = ...) { 
    // code runs here 
}

Because of this, the Java Virtual Machine (JVM) guarantees that the database connection and socket channels are automatically closed the exact moment the block finishes. This eliminates memory wastage and keeps the database server running fast.

2. Table Structural Design Map
The createTable() method creates a database structure named trainers based on this explicit schema map:

id: An Integer field to hold numeric identifiers.

name: A Variable Character Array (VARCHAR) tracking text up to a maximum length of 10 characters.

 Complete Program Pseudocode

START

    // Step 1: Main Control Execution
    CALL Method connectMySql()
    
    // Step 2: Database Connection & Default Insert
    METHOD connectMySql()
        SET database credentials (URL, User, Password)
        SET sql = "INSERT INTO sample VALUES(999, 'Anusha')"
        OPEN connection and statement container
        EXECUTE sql update query
        PRINT success messages
    END METHOD

    // Step 3: Schema Structural Setup
    METHOD createTable()
        SET database credentials
        SET sql = "CREATE TABLE trainers(id INT, name VARCHAR(10))"
        OPEN connection and statement container
        EXECUTE sql create query
        PRINT "Table created successfully"
    END METHOD

    // Step 4: Data Entry Setup
    METHOD insertRow()
        SET database credentials
        SET sql = "INSERT INTO trainers VALUES(1,'DEEP')"
        OPEN connection and statement container
        EXECUTE sql insert query
        PRINT row update count
    END METHOD
END

 Expected Outputs
output from connectMySql():
Rows Updated: 1
Connection Successful: com.mysql.cj.jdbc.ConnectionImpl@2a139a55

output from createTable():
Table created successfully

output from insertRow():
Inserted rows : 1

 Runtime Exception Management Matrix
The system tracks and logs specific database driver warnings and errors directly via console dumps:

SQLException: Triggers due to access verification blocks, incorrect password hashes, or offline ports.

SQLSyntaxErrorException: Thrown if raw queries contain structural syntax typos or target column properties that do not exist.

Communications Link Failure: Triggers when the localized database daemon background engine goes offline.

 Project Summary
This JDBC utility highlights how a backend Java application communicates with relational databases. By separating actions into isolated methods (connectMySql, createTable, insertRow), the project follows clean architecture principles, making it an excellent baseline for enterprise Java development.

