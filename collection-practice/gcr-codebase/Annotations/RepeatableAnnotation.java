package Annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Container Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Repeatable Annotation
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
}

// Class using repeatable annotation
class BugTracker {

    @BugReport(description = "NullPointerException occurs on login")
    @BugReport(description = "UI breaks on mobile view")
    public void processBug() {
        System.out.println("Processing bugs...");
    }
}

// Main class to read repeatable annotations
public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {

        Class<BugTracker> clazz = BugTracker.class;
        Method method = clazz.getMethod("processBug");

        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugReports) {
            System.out.println("Bug Description: " + bug.description());
        }
    }
}

