package FileBackUpScheduler;

class BackupTask implements Comparable<BackupTask> {
    String folderPath;
    int priority;

    BackupTask(String folderPath, int priority) throws InvalidBackupPathException {
        if (folderPath == null || folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        this.folderPath = folderPath;
        this.priority = priority;
    }

    public int compareTo(BackupTask other) {
        return other.priority - this.priority;
    }

    void executeBackup() {
        System.out.println("Backing up folder: " + folderPath + " with priority " + priority);
    }
}

