package ThreadStateMonitoringSystem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TaskRunner extends Thread {

    TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            // TIMED_WAITING
            Thread.sleep(2000);

            // RUNNABLE (dummy computation)
            for (int i = 0; i < 1_000_000; i++) {
                int x = i * i;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // TERMINATED automatically after run() ends
    }
}

class StateMonitor extends Thread {

    TaskRunner t1, t2;
    Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    StateMonitor(TaskRunner t1, TaskRunner t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public void run() {
        try {
            while (true) {
                monitorThread(t1);
                monitorThread(t2);

                if (t1.getState() == Thread.State.TERMINATED &&
                        t2.getState() == Thread.State.TERMINATED) {
                    break;
                }

                Thread.sleep(500);
            }

            // Summary
            System.out.println("\nSummary:");
            for (String name : stateHistory.keySet()) {
                System.out.println(name + " went through " +
                        stateHistory.get(name).size() + " states");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void monitorThread(Thread t) {
        stateHistory.putIfAbsent(t.getName(), new HashSet<>());
        stateHistory.get(t.getName()).add(t.getState());

        System.out.println("[Monitor] " + t.getName() +
                " is in " + t.getState() +
                " state at " + LocalTime.now());
    }
}

public class ThreadStateMonitoringSystem {
    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);

        // NEW state visible here
        monitor.start();
        task1.start();
        task2.start();
    }
}

