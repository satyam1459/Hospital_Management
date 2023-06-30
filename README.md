# Hospital Management System - Backend APIs

This is the backend component of a Hospital Management System. It provides a set of APIs to manage doctors and patients, as well as functionality to suggest doctors based on patient symptoms.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL Database
- Swagger (optional)

## Endpoints

### Doctor Endpoints

#### Add a Doctor

**Endpoint:** `POST /doctor`

This endpoint allows adding a new doctor to the system.

**Request Body:**

<img width="323" alt="image" src="https://github.com/satyam1459/Hospital_Management/assets/114183531/ebe3084f-fcec-49c3-8229-41263d544a0e">


- `docName` (string, required): The name of the doctor.
- `city` (string, required): The city where the doctor is located. Only "Delhi", "Noida", or "Faridabad" are allowed values.
- `email` (string, required): The email address of the doctor.
- `phone` (string, required): The phone number of the doctor. Must be at least 10 digits.
- `speciality` (string, required): The speciality of the doctor. Must be one of "Orthopedic", "Gynecology", "Dermatology", or "ENT specialist".

**Response:** The created doctor object.

---

#### Delete a Doctor

**Endpoint:** `DELETE /doctor/{id}`

This endpoint allows deleting a doctor from the system by their ID.

**Path Parameters:**

- `id` (long, required): The ID of the doctor to delete.

**Response:** None (204 No Content)

---

### Patient Endpoints

#### Add a Patient

**Endpoint:** `POST /patient`

This endpoint allows adding a new patient to the system.

**Request Body:**

<img width="320" alt="image" src="https://github.com/satyam1459/Hospital_Management/assets/114183531/34f6b576-dacf-4981-b854-3b9a8fcd3715">


- `name` (string, required): The name of the patient.
- `city` (string, required): The city where the patient is located.
- `email` (string, required): The email address of the patient.
- `phoneNumber` (string, required): The phone number of the patient. Must be at least 10 digits.
- `symptom` (string, required): The symptom experienced by the patient. Must be one of the predefined values based on the specialities.

**Response:** The created patient object.

---

#### Suggest Doctors

**Endpoint:** `GET /patient/doctor/{patientId}`

This endpoint suggests doctors based on the patient's symptom and location.


<img width="403" alt="image" src="https://github.com/satyam1459/Hospital_Management/assets/114183531/8166c127-a5c9-4bca-b477-290853ede627">

For doctor not available at particular location and doctor not available for symptom or patient not registered having not id


<img width="304" alt="image" src="https://github.com/satyam1459/Hospital_Management/assets/114183531/f820006c-12de-45b2-983a-2fab32759a89">


<img width="377" alt="image" src="https://github.com/satyam1459/Hospital_Management/assets/114183531/2ad76169-d598-40af-ad34-027e5bd7a5a6">


<img width="286" alt="image" src="https://github.com/satyam1459/Hospital_Management/assets/114183531/29a71c4b-107d-44f8-8ec0-669a2a1d2a40">



**Path Parameters:**

- `patientId` (long, required): The ID of the patient.

**Response:** The suggested doctor(s) based on the patient's symptom and location.

---

## Running the Application

1. Clone the repository: `git clone https://github.com/your-username/hospital-management-backend.git`
2. Navigate to the project directory: `cd hospital-management-backend`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

The application will start running on `http://localhost:8080`.

## API Documentation

API documentation is available using Swagger. After running the application, you can access the Swagger UI at `http://localhost:8080/swagger-ui.html`, where you can explore and test the APIs interactively.

## Assumptions

 and Notes

- The validations mentioned in the task description for fields like name, city, email, and phone number have been implemented.
- The database used is H2 for simplicity. You can configure a different database by modifying the application properties accordingly.
- The project structure follows standard Spring Boot conventions.
- Error handling and exception management have been implemented to provide appropriate error responses.
- Unit tests and integration tests have been implemented to ensure the correctness of the code.

Please refer to the codebase and API documentation for more details.

## Further Improvements

Here are a few areas where the project can be further improved:

- Implement authentication and authorization mechanisms to secure the APIs.
- Add pagination and sorting support for retrieving doctors and patients.
- Implement more advanced search and filtering options for doctors and patients.
- Add support for different languages and internationalization.
- Enhance the error handling and validation messages for a better user experience.

Feel free to contribute and improve the project based on your specific requirements and needs.

---
