package oopsfundamental;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println(rollNumber + " - " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        s.rollNumber = 101;
        s.name = "Rahul";
        s.setCGPA(8.5);

        s.display();
        System.out.println("CGPA: " + s.getCGPA());
    }
}
