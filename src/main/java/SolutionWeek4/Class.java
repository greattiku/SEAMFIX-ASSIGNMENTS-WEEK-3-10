package SolutionWeek4;

public class Class {
    private String className;
    private String students;
    private String teacher;

    public Class(String className, String teacher, String students) {
        this.className = className;
        this.teacher = teacher;
        this.students = students;

    }

    public String getTeacher() {
        return teacher;
    }

    public void addStudent(Student student) {
        System.out.println(student.getName() + " has been added");

    }
}
