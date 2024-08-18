# ScholarLog 🎓

<img src="https://www.onetapcheckin.com/images/class-attendance-app.jpg" alt="ScholarLog" width="600" height="400" />

**ScholarLog** is a powerful Spring Boot REST API project designed to revolutionize student attendance management in educational institutions. It streamlines processes, reduces paperwork, enhances accuracy, and simplifies attendance tracking for students, faculty, and administrative staff.

## 🚀 Project Overview

**ScholarLog** delivers a comprehensive REST API to efficiently manage student attendance. Key features include recording, viewing, and managing attendance records, with core entities like Students, Subjects, Faculty, and Attendance Records.

### Key Features:
- **Automated Attendance Tracking** 📊: Integrate seamlessly with existing systems to automate attendance processes.
- **Data Accuracy** ✅: Ensure precise record-keeping through automated validation and storage.
- **Enhanced Workflows** 🔄: Improve faculty and administrative operations with smooth integration into educational platforms.

## 🎯 Objectives:
- **Streamline Management** 🏫: Automate and simplify the recording and management of student attendance.
- **Accuracy and Efficiency** 🔍: Implement automated validation and accurate storage of attendance data.
- **Integration Capabilities** 🔗: Facilitate integration with educational platforms for optimized workflows.

## 🔧 Project Structure

**ScholarLog** utilizes a layered architecture to separate concerns and enhance maintainability:

1. **Controller Layer**:
   - Manages HTTP requests and responses.
   - Validates parameters and delegates logic to the service layer.

2. **Service Layer**:
   - Contains business logic and coordinates interactions between controllers and DAOs.
   - Handles data manipulation, validation, and transaction management.

3. **DAO Layer**:
   - Performs CRUD operations on the database.
   - Abstracts database interactions, providing a clean interface for the service layer.

## 🛠 Technology Stack:
- **Backend Framework**: Spring Boot 2.5.6
- **Database**: MySQL 8
- **Database Framework**: Hibernate 5.6
- **Java**: JDK 1.8
- **Build Tool**: Maven
- **Development Environment**: Eclipse
- **API Testing Tool**: Postman

## 🗂 Modules:
1. **Student Module** 👩‍🎓: Manage student records with CRUD operations.
2. **Subject Module** 📚: Handle subject-related operations including creation, update, and deletion.
3. **Faculty Module** 👨‍🏫: Oversee faculty records and manage related functionalities.
4. **Attendance Module** 🗂️: Record and manage attendance data for students and subjects.
5. **User Module** 🔐: Manage user authentication, roles, and access control.

## 📋 API Endpoints:

### Student Module
- `GET /student/get-all-students`: Retrieve all student records.
- `POST /student/add-student`: Create a new student record.
- `GET /student/get-student-by-id/{id}`: Fetch details of a specific student.
- `PUT /student/update-student`: Update an existing student’s details.
- `DELETE /student/delete-student/{id}`: Delete a student record.

### Subject Module
- `GET /subject/get-all-subjects`: Retrieve all subjects.
- `POST /subject/add-subject`: Create a new subject record.
- `GET /subject/get-subject-by-id/{id}`: Fetch details of a specific subject.
- `PUT /subject/update-subject`: Update an existing subject’s details.
- `DELETE /subject/delete-subject/{id}`: Delete a subject record.

### Faculty Module
- `GET /faculty/get-all-faculties`: Retrieve all faculty records.
- `POST /faculty/add-faculty`: Create a new faculty record.
- `GET /faculty/get-faculty-by-id/{id}`: Fetch details of a specific faculty member.
- `PUT /faculty/update-faculty`: Update an existing faculty’s details.
- `DELETE /faculty/delete-faculty/{id}`: Delete a faculty record.

### Attendance Module
- `GET /attendance/get-all-attendance-records`: Retrieve all attendance records.
- `POST /attendance/add-attendance`: Create a new attendance record.

### User Module
- `POST /user/login-user`: Authenticate a user and return details.
- `POST /user/register-user`: Register a new user.
- `GET /user/get-user-by-username/{username}`: Fetch details of a specific user.
- `GET /user/get-all-users`: Retrieve all registered users.
- `DELETE /user/delete-user/{username}`: Delete a specific user.

## 🗂 Database

Includes an Entity-Relationship (ER) diagram to illustrate the database schema and relationships between entities.

Let’s innovate student attendance tracking together! 🚀

#ScholarLog #OpenSource #EducationTech #SpringBoot
