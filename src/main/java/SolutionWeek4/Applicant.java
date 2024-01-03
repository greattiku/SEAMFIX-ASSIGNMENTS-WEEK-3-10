package SolutionWeek4;

public class Applicant extends Person{
    private int applicantID;

    public Applicant(int applicantID, String name, int age){
        super(name, age);
        this.applicantID= applicantID;
    }


public void isAdmitted(){
    System.out.println(getName() + ","+ getAge() + ", has been admitted");

}
}
