# Java Student Management System with MySQL

## Description

This project is a Java-based Student Management System that interacts with a MySQL database. It allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through a terminal interface. The application demonstrates the use of the DAO (Data Access Object) pattern to separate database operations from business logic.

## Features

- List all students
- Search for a specific student
- Add a new student
- Modify existing student information
- Delete a student
- MySQL database integration
- User-friendly terminal interface

## Technologies Used

- Java
- MySQL
- JDBC (Java Database Connectivity)

## Project Structure

The project consists of several key components:

1. `Estudiante` class: Represents a student with attributes like name, surname, phone, and email.
2. `Estudiante DAO` class: Declares methods for CRUD operations and Implements the `Estudiante DAO` interface, handling database operations.
3. Main application class: Provides the user interface and interactions.

## Prerequisites

- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J (JDBC driver for MySQL)

## How to Run

1. Ensure you have Java and MySQL installed on your system.
2. Set up a MySQL database and update the connection details in the project.
3. Add the MySQL Connector/J to your project's classpath.
4. Clone this repository to your local machine.
5. Navigate to the project directory in your terminal.
6. Compile the Java files.
7. Run the compiled program.

## Usage

Upon running the program, you'll be presented with a menu in the terminal:

1. Enter a number to select an operation:
- 1: List all students
- 2: Search for a student
- 3: Add a new student
- 4: Modify student information
- 5: Delete a student
- 6: Exit the application
2. Follow the prompts to interact with the student database.
3. The program will continue running until you choose to exit.

## Project Status

This project is completed but may be updated with additional features in the future.

## Learning Objectives

This project demonstrates advanced Java concepts including:
- Database connectivity with JDBC
- Implementation of the DAO pattern
- CRUD operations in a relational database
- Command-line interface design
- Object-Oriented Programming principles

## Implementation Details

- The `Estudiante` class defines the structure for student data.
- The `Estudiante DAO` class declares methods for database operations and implements the actual database interactions using JDBC..
- MySQL is used as the backend database to store student information.
- The application handles basic error scenarios and provides user feedback.

## Note

The code comments and variable names in this project are written in Spanish as it was developed for personal learning purposes. The logic and structure of the code remain universal.

---

This project serves as an excellent example of integrating a Java application with a MySQL database using the DAO pattern. It's ideal for learning about database operations in Java. Feel free to explore, contribute, or use it as a learning resource!