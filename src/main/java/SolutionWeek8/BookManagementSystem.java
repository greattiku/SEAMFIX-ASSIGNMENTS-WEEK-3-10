package SolutionWeek8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookManagementSystem extends Books {

        Scanner sc = new Scanner(System.in);
        Books bk = new Books();
        List<String> BookList = new ArrayList<>();


        public void details() {
            try {
                while (true) {
                    System.out.println("Software Books enter 1 \nHardware Books enter 2 \nDisplay Data enter 3\nExit enter 4>>");
                    int opt = sc.nextInt();

                    switch (opt) {
                        case 1:
                            softwareBooksDetails();
                            break;
                        case 2:
                            hardwareBooksDetails();
                            break;
                        case 3:
                            displayData();
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            System.exit(0);
                            break;
                        default:
                            throw new InputMismatchException("Unexpected value: input should be between 1 and 2");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong: Input Mismatch \nReload and try again.");
            }

        }


        public void softwareBooksDetails() {
            System.out.println("enter Author's name:");
            bk.setAuthorName(sc.next());

            System.out.println("enter Title:");
            bk.setTitle(sc.next());

            System.out.println("enter Price:");
            bk.setPrice(sc.nextInt());

            System.out.println("enter Stock:");
            bk.setStock(sc.nextInt());

            System.out.println("enter Software Version:");
            bk.setSoftwareVersion(sc.next());

            System.out.println("enter Software Name:");
            bk.setSoftwareName(sc.next());

            System.out.println("enter Page Number:");
            bk.setPageNumber(sc.nextInt());

            System.out.println("Input added Successfully....");

            System.out.println();
            System.out.println("------------------------------------------------");

            String output = ("Author name: " + bk.getAuthorName() +
                    "\nTitle: " + bk.getTitle() +
                    "\nPrice: " + bk.getPrice() +
                    "\nStock: " + bk.getStock() +
                    "\nSoftware Version: " + bk.getSoftwareVersion() +
                    "\nSoftware Name: " + bk.getSoftwareName() +
                    "\nPage Number: " + bk.getPageNumber());
            BookList.add(output);
            System.out.println("Your input has been recorded....");

        }

        public void hardwareBooksDetails() {
            System.out.println("enter Author's name:");
            bk.setAuthorName(sc.next());

            System.out.println("enter Title:");
            bk.setTitle(sc.next());

            System.out.println("enter Price:");
            bk.setPrice(sc.nextInt());

            System.out.println("enter Stock:");
            bk.setStock(sc.nextInt());

            System.out.println("enter Hardware Category:");
            bk.setHardwareCategory(sc.next());

            System.out.println("enter Publisher:");
            bk.setPublisher(sc.next());

            System.out.println("enter Page Number:");
            bk.setPageNumber(sc.nextInt());


            System.out.println("Input added Successfully....");

            System.out.println();
            System.out.println("------------------------------------------------");

            String output = ("Author name: " + bk.getAuthorName() +
                    "\nTitle: " + bk.getTitle() +
                    "\nPrice: " + bk.getPrice() +
                    "\nStock: " + bk.getStock() +
                    "\nHardware Category: " + bk.getHardwareCategory() +
                    "\nPublisher: " + bk.getPublisher() +
                    "\nPage Number: " + bk.getPageNumber());
            BookList.add(output);
            System.out.println("Your input has been recorded....");
            System.out.println();
        }
        void displayData(){
            System.out.println();
            System.out.println("Number of entered Books are: " + BookList.size());
            for (String list : BookList) {
                System.out.println(list);
                System.out.println();
            }
        }
    }
