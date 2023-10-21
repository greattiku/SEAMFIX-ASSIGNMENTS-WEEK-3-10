package SolutionWeek10;

import java.util.Scanner;

public class DivideNumbers {
    int num1;
    int num2;
    int result;
    public void division() throws InputErrorException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculation by Division.");
        System.out.println("Enter the First Number to be divided: ");
        num1 =  sc.nextInt();
        if (num1 == 0 ){
            throw new InputErrorException("Cannot divide by 0.Please try again.");
        }

        System.out.println("Enter the Second Number to be divided: ");
       num2 = sc.nextInt();

       if (num2 == 0){
           throw new InputErrorException("Cannot divide by 0.Please try again.");
       }

       result = num1/num2;
        System.out.println("The result for " + num1 + " divided by " + num2 + " is " + result);
    }
    public static void main(String[] args) throws InputErrorException {
        DivideNumbers dn = new DivideNumbers();
        dn.division();

    }
}
