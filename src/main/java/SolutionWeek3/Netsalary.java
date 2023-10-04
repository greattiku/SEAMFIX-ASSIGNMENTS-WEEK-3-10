package SolutionWeek3;

import java.util.Scanner;

    public class Netsalary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter your Basic Salary: ");
            double basicsalary = sc.nextDouble();
            double HRA = 0.5 * basicsalary;
            double specialallowance = 0.75 * basicsalary;
            double PF = 0.12 * basicsalary;
            double netsalary = basicsalary + HRA + specialallowance - PF;
            System.out.println("Your Net Payable salary is: $" + netsalary);


    }

}
