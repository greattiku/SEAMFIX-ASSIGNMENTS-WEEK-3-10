package SolutionWeek4;

public class SchoolManagementApp {
    public static void main(String[] args) {

        //Create instances
        Teacher mathTeacher = new Teacher("Daniel", 35);
        Teacher JavaTeacher = new Teacher("Chuks", 29);
        Student ginika = new Student("Ginika", 20, 12345);
        Student chris = new Student("Chris", 16, 67890);
        Course math = new Course("Mathematics");
        Course Java = new Course("Java Programming Language");
        Class English =new Class("Math Class", "Daniel", "Ginika");
        Principal principal = new Principal("Great Tiku", 50);
        Applicant ada = new Applicant(3456, "Ada", 20);
        Applicant anna = new Applicant(7897, "anna", 15);



        //calling methods

        math.course();
        Java.course();
        ginika.takeCourse(math.getCourse());
        chris.takeCourse(Java.getCourse());
        mathTeacher.teachCourse(math.getCourse());
        JavaTeacher.teachCourse(Java.getCourse());
        principal.expelStudent(ginika);
        principal.admitApplicant(ada);
        principal.admitApplicant(anna);
        English.addStudent(chris);
        System.out.println();
        System.out.println();

        //Display information
        System.out.println("Teacher: " + mathTeacher.getName());
        System.out.println("Teacher: " + JavaTeacher.getName());
        System.out.println("Student 1: " + ginika.getName());
        System.out.println("Student 2: " + chris.getName());
        System.out.println("Course: " + math.getCourse());
        System.out.println("Course: " + Java.getCourse());
        System.out.println("Principal: " + principal.getName());
        System.out.println("Applicant: " + ada.getName());


    }
}

