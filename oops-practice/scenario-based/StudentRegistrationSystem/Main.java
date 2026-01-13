package StudentRegistrationSystem;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Harsh", 21, 101);

        RegistrationService service = new CourseRegistration();

        service.enrollCourse(s1, "Java");
        service.assignGrade(s1, "A");
        service.dropCourse(s1);
    }
}
