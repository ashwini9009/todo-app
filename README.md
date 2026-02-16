#  Todo Application (Spring Boot + MySQL)

A simple Todo Application built using Spring Boot and MySQL.  
This project demonstrates CRUD operations with a clean MVC architecture.

---

#  Features

- Add new tasks
- View all tasks
- Mark tasks as completed
- Delete tasks
- Persistent storage using MySQL
- Dynamic UI using Thymeleaf
- Clean layered architecture (Controller → Service → Repository)

---

# Technologies Used

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- Thymeleaf
- MySQL
- Bootstrap 5
- Maven

---

# Project Structure

```
com.app.todoapp
│
├── TodoApplication.java
│
├── controller
│   └── TaskController.java
│
├── service
│   └── TaskService.java
│
├── repository
│   └── TaskRepository.java
│
└── model
    └── Task.java
```

---

#  Database Setup (MySQL)

## Step 1: Install MySQL

Make sure MySQL is installed and running on your system.

---

## Step 2: Create Database

Open MySQL and run:

```sql
CREATE DATABASE todo-app;
```

---

## Step 3: Configure application.properties

Open:

```
src/main/resources/application.properties
```

Add or update the following:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo-app
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

Replace:

```
YOUR_PASSWORD
```

with your actual MySQL password.

---

#  How To Run The Project

## Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git
```

---

## Step 2: Navigate to Project Folder

```bash
cd YOUR_REPOSITORY_NAME
```

---

## Step 3: Open in IDE

Open the project in:

- IntelliJ IDEA
- Eclipse
- VS Code (with Java extensions)

Make sure you have:

- Java 17+
- Maven installed
- MySQL running

---

## Step 4: Build the Project

Using Maven:

```bash
mvn clean install
```

---

## Step 5: Run the Application

Run the main class:

```
TodoApplication.java
```

OR run using Maven:

```bash
mvn spring-boot:run
```

---

## Step 6: Open in Browser

After the application starts successfully, open:

```
http://localhost:8080/tasks
```

---

# How The Application Works

1. User enters a task in the input field.
2. Form sends POST request to `/tasks`.
3. Controller receives request.
4. Service layer handles business logic.
5. Repository saves data into MySQL.
6. Thymeleaf renders updated task list.
7. Tasks can be marked complete or deleted.

---

# Author

Ashwini Rukare

---

