package SolutionWeek9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement extends Employee {
    Scanner sc = new Scanner(System.in);
    Employee em = new Employee();
    List<String> employeeList = new ArrayList<>();



    void displayInfo() {
        System.out.println("Please enter a number: Enter 1 to add your information. 2, to display your Info.  3, to exit:");

        while (true) {
            System.out.println("1. Enter Data:  \n2. Display Data:   \n3. Exit: >>");
            int opt = sc.nextInt();//we want the user to input number 1, 2, or 3.

            switch (opt) {
                case 1:
                    enterData();
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    System.out.println("exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input: Enter 1, 2, 3 or try refreshing");
            }
        }
    }

    public void enterData(){
        System.out.println("Enter EmployeeID: ");
        em.setEmployeeId(sc.nextInt());

        System.out.println("Enter Name: ");
        em.setEmployeeName(sc.next());

        System.out.println("Enter Department: ");
        em.setDepartment(sc.next());

        System.out.println("Enter Designation: ");
        em.setDesignation(sc.next());

        System.out.println("Enter Date of Entry: ");
        em.setDateOfEntry(sc.next());

        System.out.println("Enter Date of Birth: ");
        em.setDateOfBirth(sc.next());

        System.out.println("Enter Marital Status: ");
        em.setMaritalStatus(sc.next());

        System.out.println("Enter Date of Marriage: ");
        em.setDateOfMarriage(sc.next());

        System.out.println("Input added Successfully.......");

//      if you use this commented method below, when you're done entering your data, the information is displayed immediately without you inputting a code to display the info.
//        System.out.println("Employee ID: " + em.getEmployeeiD() +
//                           "\nEmployee Name: " + em.getEmployeeName() +
//                            "\nDepartment: " + em.getDepartment() +
//                            "\nDesignation: " + em.getDesignation() +
//                            "\nDate of Entry: " + em.getDateofEntry() +
//                            "\nDate of Birth: " + em.getDateofBirth() +
//                            "\nMarital Status: " + em.getMaritalStatus() +
//                            "\nDate of Marriage: " + em.getDateofMarriage());

//  List<String> StringList = new ArrayList<>();//I've called to before above. need to explain
//  I want my string to output these info below.
//  then as ususal I do my (arrayname)stringlist.add and insert the string output I want to add


        String output =("Employee ID: " + em.getEmployeeId() +"\nEmployee Name: " + em.getEmployeeName() +"\nDepartment: " + em.getDepartment() +"\nDesignation:  "+ em.getDesignation() +"\nDate of Entry: "+ em.getDateOfEntry() +"\nDate of Birth:  "+ em.getDateOfBirth()+"\nMarital Status:  "+ em.getMaritalStatus() +"\nDate of Marriage:  "+ em.getDateOfMarriage());
        employeeList.add(output);// adds to the info entered and stores it.
        System.out.println("Your details has been recordedd...");
        System.out.println();
    }

    void displayData(){
        System.out.println();
        System.out.println("DETAILS OF REGISTERED EMPLOYEE");
        System.out.println("Number of registered employees are: " + employeeList.size());
        for(String list: employeeList){
            System.out.println(list);
            System.out.println();
        }
    }

}


