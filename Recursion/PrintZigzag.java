import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        zig(n);

    }

    public static void zig(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+ " ");
        zig(n-1);
        System.out.print(n+ " ");
        zig(n-1);
        System.out.print(n+ " ");
    }
}