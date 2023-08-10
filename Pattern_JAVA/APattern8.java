/*
2 
4 6 
8 10 12 
14 16 18 20 
*/


package Pattern_JAVA;

public class APattern8 {

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(m + " ");
                m += 2;
            }
            System.out.println();
        }
    }
}
