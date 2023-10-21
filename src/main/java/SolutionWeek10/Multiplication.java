package SolutionWeek10;

public class Multiplication {
    public static void main(String[] args) {
        int[][] table =new int [12][12];

        for (int row =0; row<= table.length  ; row++){
            for(int col = 0; col < table[row].length; col++){
                //  table [row][col] = (row + 1) * (col + 1);
                System.out.printf ("%6d", (row + 1) * (col +1));
            }
            System.out.println();

        }

    }
}

