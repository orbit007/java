import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
    
        printnum2(n);
        printnum(n);

    }

    public static void printnum(int n)
    {
        if(n==0)
        {
            return;
        }
        
        printnum(n-1);
        System.out.println(n);
    }

    public static void printnum2(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printnum2(n-1);
    }
}