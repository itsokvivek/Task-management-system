# Task Management System

A task management system built using Java.

## Project Goal

Build a real-world task management system while learning:

- Java
- Spring Boot
- Git & GitHub
- Software Engineering

## Current Status

- ✅ CLI Version Completed

## Roadmap

- [x] CLI
- [ ] Spring Boot REST API
- [ ] Database
- [ ] Authentication
- [ ] Docker
- [ ] Deployment
## schema for the Tasks module.
| Column          | Type         | Description        |
| --------------- | ------------ | ------------------ |
| TaskNumber      | INT (PK)     | Unique Task ID     |
| TaskName        | VARCHAR(200) | Task title         |
| TaskDescription | VARCHAR(500) | Task details       |
| ProjectName     | VARCHAR(200) | Associated project |
| Department      | VARCHAR(200) | Department name    |
| Priority        | VARCHAR(100) | Task priority      |
| ApprovedByName  | VARCHAR(50)  | Approver           |
| AssigneeName    | VARCHAR(50)  | Assigned user      |
