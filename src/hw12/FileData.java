package hw12;

public class FileData {
    private final String filePath;
    private final String fileName;
    private final long fileSize;

    public FileData(String filePath, String fileName, long fileSize) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }
}