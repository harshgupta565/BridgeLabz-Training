package Annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    int priority();
    String assignedTo();
}

// Class using the annotation
class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Harsh")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

// Main class to read annotation using Reflection
public class AnnotationDemo {
    public static void main(String[] args) throws Exception {

        TaskManager taskManager = new TaskManager();
        Class<?> clazz = taskManager.getClass();

        Method method = clazz.getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}
