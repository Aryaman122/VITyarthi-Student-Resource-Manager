package com.vityarthi.services;

import com.vityarthi.models.Resource;
import com.vityarthi.utils.InputUtil;

import java.util.ArrayList;

public class ResourceService {

    private ArrayList<Resource> resources = new ArrayList<>();

    public void addResource() {
        System.out.println("\n--- Add Resource ---");
        String title = InputUtil.getString("Title: ");
        String type = InputUtil.getString("Type (Book/Video/Link/Notes): ");
        String desc = InputUtil.getString("Description: ");

        resources.add(new Resource(title, type, desc));
        System.out.println("Resource added!");
    }

    public void viewResources() {
        System.out.println("\n--- Your Resources ---");
        if (resources.isEmpty()) {
            System.out.println("No resources added yet.");
            return;
        }

        int i = 1;
        for (Resource r : resources) {
            System.out.println(i++ + ". " + r.getTitle() + " (" + r.getType() + ")");
            System.out.println("   " + r.getDescription());
        }
    }

    public void deleteResource() {
        viewResources();

        if (resources.isEmpty()) return;

        int index = InputUtil.getInt("Enter resource number to delete: ");

        if (index < 1 || index > resources.size()) {
            System.out.println("Invalid resource number!");
            return;
        }

        resources.remove(index - 1);
        System.out.println("Resource deleted!");
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }
}
