package SolutionWeek9;

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



















//    public static void main(String[] args) {
//        for(int i=1; i<=12; i++){
//            for (int j=1; j<=12; j++){
//                System.out.printf("%4d", i*j);
//
//            }
//            System.out.println();
//        }
//

//
//}
//int a;
//int b;
//static int sum;
//    public static void main(String[] args) {
//
//        for (int a = 1; a <= 12;a++) {
//            for (int b =1; b <= 12; b++) {
//                sum = a*b;
//                System.out.printf(String.valueOf(sum));
//                if (sum<10) {
//                    System.out.println("    ");
//                }else if (sum >=10){
//                    System.out.println("    ");
//                }else if (sum>=10){
//                    System.out.println("    ");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//
//    }
//public class Multiplication {
//
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 12; i++) {
//            for (int j = 12; j <= 12; j++) {
//
//                System.out.printf("%d * %d = %d \n", i, j, (i * j));
//               System.out.println();
//            }
//
//        }
//    }
//}
