/*
*****        *****
 *****      *****
  *****    *****
   *****  ***** 
    **********
    **********
   *****  *****
  *****    *****
 *****      *****
*****        *****
*/
package Pattern_JAVA;

import java.util.Scanner;

public class APattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int m = sc.nextInt();
        int n = m / 2;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i - 1; k++) {

                System.out.print(" ");

            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            for (int l = 1; l <= (m - (i * 2)); l++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= n; s++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {

                System.out.print("*");

            }
            for (int l = 1; l <= (m - (i * 2)); l++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= n; s++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
