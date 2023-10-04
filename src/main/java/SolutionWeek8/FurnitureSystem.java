package SolutionWeek8;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FurnitureSystem  {
    Scanner sc = new Scanner(System.in);
    Furniture fr = new Furniture();
    List<String> furnitureList = new ArrayList<>();

    public void details() {
        try {
            while (true) {
                System.out.println("Bookshelves enter 1 \nChairs enter 2 \nDisplay Data enter 3\nExit 4>>");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        bookshelvesDetails();
                        break;
                    case 2:
                        chairDetails();
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

    public void bookshelvesDetails() {
        System.out.println("enter Price:");
        fr.setPrice(sc.nextInt());

        System.out.println("enter Width:");
        fr.setWidth(sc.nextDouble());

        System.out.println("enter Height:");
        fr.setHeight(sc.nextDouble());

        System.out.println("enter other specifications you need to specify:");
        fr.setOthers(sc.next());

        System.out.println("Input added successfully......");

        String output= ("Price " + fr.getPrice() + "\nWidth: " + fr.getWidth()+ "\nHeight: " + fr.getHeight() + "\nOthers: "+ fr.getOthers());
        furnitureList.add(output);
    }

    public void chairDetails() {
        System.out.println("enter Price:");
        fr.setPrice(sc.nextInt());

        System.out.println("enter Width:");
        fr.setWidth(sc.nextDouble());

        System.out.println("enter Height:");
        fr.setHeight(sc.nextDouble());

        System.out.println("enter other specifications you need to specify:");
        fr.setOthers(sc.next());

        System.out.println();
        System.out.println("Input added successfully......");

        String output= ("Price " + fr.getPrice() + "\nWidth: " + fr.getWidth()+ "\nHeight: " + fr.getHeight() + "\nOthers: "+ fr.getOthers());
        furnitureList.add(output);

    }
    void displayData() {
        System.out.println();
        System.out.println("Number of orders taken are: " + furnitureList.size());
        for (String fl : furnitureList) {
            System.out.println(fl);
            System.out.println();
        }
    }

}
