package SolutionWeek3;

import java.util.Scanner;

    public class Netsalary {
        public double Salary(){
           // Scanner sc = new Scanner(System.in);

            //System.out.println("Please Enter your Basic Salary: ");

            double basicsalary = 12000;
            //sc.nextDouble();

            double HRA = 0.5 * basicsalary;

            double specialallowance = 0.75 * basicsalary;

            double PF = 0.12 * basicsalary;

            double netsalary = basicsalary + HRA + specialallowance - PF;

            System.out.println("Your Net Payable salary is: $" + netsalary);
            return netsalary;

        }
        public static void main(String[] args) {
           Netsalary ns = new Netsalary();
            ns.Salary();
    }

}
