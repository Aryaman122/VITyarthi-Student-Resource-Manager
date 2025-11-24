package com.vityarthi.main;

import com.vityarthi.services.*;
import com.vityarthi.utils.InputUtil;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        ResourceService resourceService = new ResourceService();
        ReportService reportService = new ReportService();

        System.out.println("------ Welcome to VITyarthi Student Resource Manager ------");

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = InputUtil.getInt("Enter choice: ");

            switch (choice) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    if (userService.login()) {
                        studentMenu(resourceService, reportService);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using VITyarthi!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void studentMenu(ResourceService resourceService, ReportService reportService) {
        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Resource");
            System.out.println("2. View Resources");
            System.out.println("3. Delete Resource");
            System.out.println("4. Generate Report");
            System.out.println("5. Logout");

            int choice = InputUtil.getInt("Enter choice: ");

            switch (choice) {
                case 1:
                    resourceService.addResource();
                    break;
                case 2:
                    resourceService.viewResources();
                    break;
                case 3:
                    resourceService.deleteResource();
                    break;
                case 4:
                    reportService.generateReport(resourceService.getResources());
                    break;
                case 5:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
