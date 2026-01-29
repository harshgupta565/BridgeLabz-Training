package FileBackUpScheduler;

import java.util.PriorityQueue;

public class FileBackupScheduler {
    public static void main(String[] args) {
        PriorityQueue<BackupTask> queue = new PriorityQueue<>();

        try {
            queue.add(new BackupTask("/system", 5));
            queue.add(new BackupTask("/user/docs", 2));
            queue.add(new BackupTask("/database", 4));
            queue.add(new BackupTask("", 3));
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            task.executeBackup();
        }
    }
}

