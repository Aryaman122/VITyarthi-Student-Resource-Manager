package com.vityarthi.services;

import com.vityarthi.models.Student;
import com.vityarthi.utils.InputUtil;
import com.vityarthi.utils.ValidationUtil;

public class UserService {

    private Student registeredStudent = null;

    public void register() {
        System.out.println("\n--- Registration ---");
        String username = InputUtil.getString("Enter username: ");
        String password = InputUtil.getString("Enter password: ");

        if (!ValidationUtil.isValidUsername(username)) {
            System.out.println("Invalid username!");
            return;
        }

        registeredStudent = new Student(username, password);
        System.out.println("Registration successful!");
    }

    public boolean login() {
        if (registeredStudent == null) {
            System.out.println("No users registered yet!");
            return false;
        }

        System.out.println("\n--- Login ---");
        String username = InputUtil.getString("Username: ");
        String password = InputUtil.getString("Password: ");

        if (registeredStudent.getUsername().equals(username)
                && registeredStudent.getPassword().equals(password)) {
            System.out.println("Login Successful!");
            return true;
        }

        System.out.println("Incorrect username or password!");
        return false;
    }
}
