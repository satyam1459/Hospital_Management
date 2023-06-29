# Hospital Management System

The Doctor Patient Management System is a backend API application built with Spring Boot and Hibernate. It provides functionalities for managing doctors, patients, and suggesting doctors based on patient symptoms.

## Features

- Adding a doctor with name, city, email, phone number, and speciality.
- Adding a patient with name, city, email, phone number, and symptom.
- Suggesting doctors based on patient's location and symptom.
- Validation of input fields such as name, city, email, and phone number.
- Handling edge cases when there are no doctors available for a location or symptom.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Swagger (optional)

## Getting Started

Follow the instructions below to get started with the Doctor Patient Management System:

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- MySQL Database Server

### Installation

1. Clone the repository or download the source code.

2. Create a MySQL database for the application.

3. Open the `application.properties` file located in the `src/main/resources` directory.

4. Modify the following properties with your MySQL database details:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

5. Build the project using Maven:

   ```bash
   mvn clean install
   ```

6. Run the application:

   ```bash
   mvn spring-boot:run
   ```

7. The application will start running on `http://localhost:8080`.

## API Documentation

To view the available APIs and their documentation, you can access the Swagger UI:

- Open your web browser and go to `http://localhost:8080/swagger-ui.html`.

- You will see the list of available APIs along with detailed documentation.

## Conclusion

The Doctor Patient Management System is now up and running. You can use the provided APIs to add doctors, add patients, and suggest doctors based on patient symptoms.
