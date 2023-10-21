package SolutionWeek10;

public class DoubleValue {
    public static void main(String[] args) {
        double  sum=0;

        int[] num = {1,2,3,4,5,6,7,8,9,11};

        for (int i =0; i< num.length; i++){
            sum = sum + i;
            System.out.println("The sum of the array is: " + sum);
            double average = sum/ i;
            System.out.println("The Average of 10 doubles in an array is: " + average );
        }
    }
}

