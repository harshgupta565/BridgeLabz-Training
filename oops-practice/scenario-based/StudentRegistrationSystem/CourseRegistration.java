package StudentRegistrationSystem;
class CourseRegistration extends RegistrationService {

    @Override
    void enrollCourse(Student student, String course) {
        student.setCourse(course);
        System.out.println(student.name + " enrolled in " + course);
    }

    @Override
    void dropCourse(Student student) {
        System.out.println(student.name + " dropped " + student.getCourse());
        student.setCourse(null);
    }

    @Override
    void assignGrade(Student student, String grade) {
        student.setGrade(grade);
        System.out.println("Grade " + grade + " assigned to " + student.name);
    }
}
