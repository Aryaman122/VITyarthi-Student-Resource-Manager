# 📚 VITyarthi Student Resource Manager

## ✨ Overview
The **VITyarthi Student Resource Manager** is a simple, command-line interface (CLI) application designed to help students manage their educational resources. It allows a single registered student to track, organize, and analyze various types of study material such as Books, Videos, Links, and Notes.

## 🚀 Features
The application provides core functionality for user management and resource tracking:

### User Management
* **Registration:** Allows a user (student) to create an account (single user system).
* **Login:** Secures access to the resource management features.

### Resource Management (CRUD Operations)
* **Add Resource:** Record a new resource with a title, type (Book/Video/Link/Notes), and description.
* **View Resources:** Display a numbered list of all added resources.
* **Delete Resource:** Remove an existing resource by its index number.

### Reporting
* **Generate Report:** Provides a simple summary of the resources, listing the total number of resources and the count for each type (Book, Video, Link, Notes).

## 🛠️ Technologies & Tools Used
* **Language:** Java (Core)
* **Project Structure:** Standard Java Package/Module structure.
* **Input/Output:** Standard CLI (Command Line Interface) via `System.out.println` and `java.util.Scanner`.
* **Data Storage:** In-memory storage using `ArrayList` (data is not persistent upon application exit).

## 📁 Project Structure (Simplified)
The project follows a modular structure using packages:

| Package | Purpose | Key Files |
| :--- | :--- | :--- |
| `com.vityarthi.main` | Application entry point | `Main.java` |
| `com.vityarthi.services` | Business logic/core operations | `UserService.java`, `ResourceService.java`, `ReportService.java` |
| `com.vityarthi.models` | Data model classes | `Student.java`, `Resource.java` |
| `com.vityarthi.utils` | Utility classes for common tasks | `InputUtil.java`, `ValidationUtil.java` |

## ⚙️ Steps to Install & Run the Project

1.  **Prerequisites:** Ensure you have a Java Development Kit (**JDK 8 or higher**) installed on your system.
2.  **Compile:** Navigate to the project root directory (`vidhyarthi/src`) and compile the Java source files:
    ```bash
    # Assuming you are in the directory containing the 'com' folder (e.g., 'vidhyarthi/src')
    javac com/vityarthi/main/Main.java com/vityarthi/services/*.java com/vityarthi/models/*.java com/vityarthi/utils/*.java
    ```
3.  **Run:** Execute the main class:
    ```bash
    java com.vityarthi.main.Main
    ```
4.  **Interaction:** Follow the on-screen menu prompts to register, log in, and manage resources.

## 📝 Instructions for Testing
The application is tested through manual interaction using the CLI menu:

1.  **Start the Application:** Run the `Main` class as described above.
2.  **Test Registration (Choice 1):**
    * Attempt to register with an invalid username (e.g., less than 3 characters) to test `ValidationUtil`.
    * Register successfully.
3.  **Test Login (Choice 2):**
    * Attempt to log in with incorrect credentials.
    * Log in successfully using the registered credentials.
4.  **Test Resource Management (Student Menu):**
    * **Add (Choice 1):** Add various resources (Book, Video, Link, Notes).
    * **View (Choice 2):** Verify all added resources are listed correctly.
    * **Delete (Choice 3):** Delete a resource by its number and verify the list is updated.
    * **Generate Report (Choice 4):** Check if the report accurately counts the different resource types.
5.  **Test Logout (Choice 5):** Verify returning to the main menu.
6.  **Test Exit (Main Menu Choice 3):** Verify the application terminates.
