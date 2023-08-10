/*
10 ** 9 ** 8 ** 7 
6 ** 5 ** 4 
3 ** 2 
1 
 */


package Pattern_JAVA;

public class APattern9 {

    public static void main(String[] args) {
        int n = 4;
        int m = 10;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print(m + " ");
                if (j != i) {
                    System.out.print("** ");
                }
                m -= 1;
            }
            System.out.println();
        }
    }
}
