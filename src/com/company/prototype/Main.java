package com.company.prototype;

public class Main {
    public static void main(String[] args) {
        // Create a registry and add notebook prototypes
        NotebookRegistry registry = new NotebookRegistry();
        registry.addPrototype("Lined", new LinedNotebook());
        registry.addPrototype("Dotted", new DottedNotebook());
        registry.addPrototype("Plain", new PlainNotebook());

        try {
            // Clone and customize Lined Notebook
            Notebook travelNotebook = registry.getPrototype("Lined");
            travelNotebook.setCoverDesign("Travel Cover");
            travelNotebook.setRearDesign("Travel Rear");

            // Clone and customize Dotted Notebook
            Notebook artNotebook = registry.getPrototype("Dotted");
            artNotebook.setCoverDesign("Artistic Cover");
            artNotebook.setRearDesign("Artistic Rear");

            // Clone and customize Plain Notebook
            Notebook sketchNotebook = registry.getPrototype("Plain");
            sketchNotebook.setCoverDesign("Sketch Cover");
            sketchNotebook.setRearDesign("Sketch Rear");

            // Display notebooks
            System.out.println("Travel Notebook:");
            travelNotebook.display();

            System.out.println("\nArt Notebook:");
            artNotebook.display();

            System.out.println("\nSketch Notebook:");
            sketchNotebook.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

