import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        printInc(n);

    }

    public static void printInc(int n)
    {
        if(n==0)
        {
            return;   // base case
        }

        printInc(n-1);  // faith   a
        System.out.println(n);  //b
    }
}