package SolutionWeek4;

public class Principal extends Person {

    public Principal(String name, int age) {

        super(name, age);

    }

    public void expelStudent(Student student) {

        System.out.println(student.getName() + " has been expelled.");

    }

    public void admitApplicant(Applicant applicant) {

        if (applicant.getAge() >= 18) {

            System.out.println(applicant.getName() + "has been admitted as a student.");

        } else {

            System.out.println(applicant.getName() + " is too young to be admitted.");

        }

    }
}
