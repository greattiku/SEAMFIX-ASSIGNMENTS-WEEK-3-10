package SolutionWeek4;

public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void takeCourse(String courseName) {

        System.out.println(getName() + " is taking" + courseName);
    }
}
