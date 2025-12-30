package methodsandclass;
class Student {
    String name, roll;
    double m1, m2, m3;

    void display() {
        double avg = (m1 + m2 + m3) / 3;
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + roll);
        System.out.println("Grade " + (avg >= 75 ? "B" : "C"));
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Thamarai";
        s.roll = "ECE001";
        s.m1 = 80; s.m2 = 70; s.m3 = 75;
        s.display();
    }
}
