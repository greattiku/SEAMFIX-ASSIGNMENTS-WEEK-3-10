package SolutionWeek4;

public class Teacher extends Person {

    public Teacher(String name, int age) {

        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void teachCourse(String courseName) {

        System.out.println(getName() + " is teaching" + courseName);
    }

}
