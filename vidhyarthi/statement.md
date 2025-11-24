# 📄 Project Statement: VITyarthi Student Resource Manager

## 1. Problem Statement
Students, especially in fast-paced academic environments like VIT (implied by "VITyarthi"), often accumulate a large volume of scattered learning resources—ranging from digital notes and PDF books to video links and web articles. This lack of centralized organization makes it **difficult to efficiently track, manage, and analyze** their study material, leading to wasted time searching for resources and an inability to gain insight into their distribution (e.g., "Do I rely too much on video lectures vs. proper textbooks?").

## 2. Objectives
The primary objectives of the VITyarthi Student Resource Manager are:
* To provide a **single, secure platform** for a student to track all academic resources.
* To enable **efficient CRUD (Create, Read, Update, Delete)** operations on the resource data.
* To offer **analytical insights** through reporting on the types of resources being used.
* To apply fundamental Java object-oriented programming (OOP) principles and modular design.

## 3. Scope of the Project
The project is a **standalone, command-line interface (CLI) application** built in Java.

### In Scope:
* Basic user **Registration and Login** for a single user.
* **Storage of Resource objects** (`Title`, `Type`, `Description`) in memory (`ArrayList`).
* Core functionality for **adding, viewing, and deleting** resources.
* Generating a **summary report** categorized by resource type.
* Basic input validation and error handling.

### Out of Scope:
* Persistence (data will be lost when the application closes).
* Networking or database integration (e.g., JDBC).
* A graphical user interface (GUI).
* Multi-user functionality or administrative roles.

## 4. Target Users
The primary target user is a **Student** who needs a simple and quick way to catalogue their study material.

## 5. High-Level Features (Functional Modules)

The system is structured around three major functional modules:

### 1. User Management (Authentication)
* Register a new student account.
* Login using credentials.

### 2. Resource Management (CRUD)
* Add a new Resource (Book, Video, Link, or Notes).
* View all added Resources.
* Delete an existing Resource.

### 3. Reporting & Analytics
* Generate a quantitative report showing the total count of resources and a breakdown by resource type.
