package StudentRegistrationSystem;

class Student extends Person {

    private int studentId;   // encapsulation
    private String course;
    private String grade;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // getters & setters
    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

