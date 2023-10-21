package SolutionWeek10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SammyEmployee extends Sammy {

    Scanner sc = new Scanner(System.in);
    Sammy em = new Sammy();
    List<String> SammyList = new ArrayList<>();


    public void details() throws InputErrorException {
//        try {
            while (true) {
                System.out.println("Enter Details  1 \nDisplay Details 2 \nExit enter 3>>");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        enterDetails();
                        break;
                    case 2:
                        displayDetails();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        throw new InputErrorException("Unexpected value: input should be between 1, 2 and 3");
                }
            }
    }

    void enterDetails() throws InputErrorException {
        System.out.println("Enter name: ");
        em.setName(sc.next());
        System.out.println("Enter Contact Details: ");
        em.setContact(sc.next());
        System.out.println("Enter Age: ");
        em.setAge(sc.nextInt());



        if ((em.getAge() >= 20) && (em.getAge() <=55)) {
            System.out.println("Welcome");
        }
        else {
            throw new InputErrorException("Age cannot be less than 20 or more than 55. Please try again.");
        }
       System.out.println("Welcome");

        System.out.println();
        String output = ("First Name: " + em.getName() + "\nContact Details: " + em.getContact() + "\nAge: " + em.getAge());
        SammyList.add(output);// adds to the info entered and stores it.
        System.out.println("Your details has been recordedd...");
        System.out.println();
    }

    void displayDetails() {
        System.out.println();
        System.out.println("DETAILS OF REGISTERED EMPLOYEE");
        System.out.println("Number of registered employees are: " + SammyList.size());
        for (String list : SammyList) {
            System.out.println(list);
            System.out.println();
        }
    }

}