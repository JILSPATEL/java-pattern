package Pattern_JAVA;
/*
*******
 *****
  ***
   *
   *
  ***
 *****
*******
*/
public class APattern7 {
    public static void main(String[] args) {
         int n,m=0;
    n=7;

    for(int i=n; i>=1; i--)
    {
        for(int k=1; k<=m; k++)
        {

            System.out.print(" ");

        }
        for(int j=1; j<=2*i-1; j++)
        {
            System.out.print("*");
        }
        m++;
        System.out.println();

    }
    int l=n;
    for(int i=1; i<=n; i++)
    {
        for(int k=1; k<=l-1; k++)
        {

            System.out.print(" ");

        }
        for(int j=1; j<=2*i-1; j++)
        {
            System.out.print("*");
        }
        l--;
        System.out.println();

    }
    }
}
