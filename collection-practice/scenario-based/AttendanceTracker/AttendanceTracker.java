package AttendanceTracker;

import java.util.*;

public class AttendanceTracker {

    // sessionId -> set of studentIds
    private Map<String, Set<String>> sessionAttendance;

    public AttendanceTracker() {
        sessionAttendance = new HashMap<>();
    }
}

