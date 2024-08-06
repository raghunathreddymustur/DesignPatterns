package com.company.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
class Directory implements FileSystem {
    private String name;
    private List<FileSystem> contents = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        contents.add(component);
    }

    public void remove(FileSystem component) {
        contents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystem component : contents) {
            component.showDetails();
        }
    }
}

