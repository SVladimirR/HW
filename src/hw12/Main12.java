package hw12;

import java.util.List;

public class Main12 {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();
        navigator.add("/path/to/file", "files.txt", 1000);
        navigator.add("/path/to/file", "firstApp.java", 2000);
        navigator.add("/path/to/other", "example.txt", 500);
        navigator.add("/path/to/other", "secondApp.java", 3000);

        System.out.println("Files at /path/to/file:");
        List<FileData> files = navigator.find("/path/to/file");
        if (files != null) {
            for (FileData file : files) {
                System.out.println("File: " + file.getFileName() + ", Size: " + file.getFileSize());
            }
        }

        System.out.println("Files with size <= 2000 bytes:");
        List<FileData> filteredFiles = navigator.filterBySize(2000);
        for (FileData file : filteredFiles) {
            System.out.println("File: " + file.getFileName() + ", Size: " + file.getFileSize());
        }

        System.out.println("Files sorted by size:");
        List<FileData> sortedFiles = navigator.sortBySize();
        for (FileData file : sortedFiles) {
            System.out.println("File: " + file.getFileName() + ", Size: " + file.getFileSize());
        }

        navigator.remove("/path/to/other");
        System.out.println("Remaining files:");
        navigator.printFiles();
    }

}
