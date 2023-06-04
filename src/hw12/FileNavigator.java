package hw12;


import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(String filePath, String fileName, long fileSize) {
        FileData file = new FileData(fileName, filePath, fileSize);
        if (fileMap.containsKey(filePath)) {
            List<FileData> fileList = fileMap.get(filePath);
            fileList.add(file);
        } else {
            List<FileData> fileList = new ArrayList<>();
            fileList.add(file);
            fileMap.put(filePath, fileList);
        }
    }

    public void printFiles() {
        for (String filePath : fileMap.keySet()) {
            System.out.println("Files at path: " + filePath);
            List<FileData> fileList = fileMap.get(filePath);
            for (FileData file : fileList) {
                System.out.println("File: " + file.getFileName() + ", Size: " + file.getFileSize());
            }
        }
    }

    public List<FileData> find(String filePath) {
        return fileMap.get(filePath);
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            for (FileData file : fileList) {
                if (file.getFileSize() <= maxSize) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    public void remove(String filePath) {
        if (fileMap.containsKey(filePath)) {
            fileMap.remove(filePath);
        }
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            allFiles.addAll(fileList);
        }
        allFiles.sort(Comparator.comparingLong(FileData::getFileSize));
        return allFiles;
    }
}