package SolutionWeek3;

import java.util.Scanner;

public class Cylinder {
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume has a constant of: 3.14");
        double volume = 3.14;
        System.out.println("Please Enter radius: ");
        int radius = sc.nextInt();
        System.out.println("Please Enter Height: ");
        int height = sc.nextInt();
        System.out.println("Volume of the Solution.Cylinder is: " + volume * radius * radius * height);

    }
        public static void main(String[] args) {
           Cylinder cy = new Cylinder();
           cy.calculate();
    }

}
