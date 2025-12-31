package oopsfundamental;
class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " months | ₹" + fee);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");
        System.out.println("Institute: " + instituteName);
    }
}
