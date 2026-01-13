package StudentRegistrationSystem;

abstract class RegistrationService {
    abstract void enrollCourse(Student student, String course);
    abstract void dropCourse(Student student);
    abstract void assignGrade(Student student, String grade);
}
