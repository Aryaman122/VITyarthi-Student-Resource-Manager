package com.vityarthi.services;

import com.vityarthi.models.Resource;

import java.util.ArrayList;

public class ReportService {

    public void generateReport(ArrayList<Resource> resources) {
        System.out.println("\n--- Resource Report ---");

        if (resources.isEmpty()) {
            System.out.println("No resources to analyze.");
            return;
        }

        int books = 0, videos = 0, links = 0, notes = 0;

        for (Resource r : resources) {
            switch (r.getType().toLowerCase()) {
                case "book": books++; break;
                case "video": videos++; break;
                case "link": links++; break;
                case "notes": notes++; break;
            }
        }

        System.out.println("Total Resources: " + resources.size());
        System.out.println("Books: " + books);
        System.out.println("Videos: " + videos);
        System.out.println("Links: " + links);
        System.out.println("Notes: " + notes);
    }
}
