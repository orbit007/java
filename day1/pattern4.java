import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int row=1;row<=n;row++)
        {
            int nst = (n+1)-row;
            int nsp = n-nst;
            for(int i=1;i<=nsp;i++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}