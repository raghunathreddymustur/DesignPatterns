package com.company.composite;

// Client
public class CompositePatternExample {
    public static void main(String[] args) {
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.txt");

        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");

        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        Directory rootDir = new Directory("Root");
        rootDir.add(dir1);
        rootDir.add(dir2);

        // Show details of the root directory
        rootDir.showDetails();
    }
}
