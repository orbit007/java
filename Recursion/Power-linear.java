import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int a=pow(x,n);
        System.out.println(a);

    }

    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int ans= x*(pow(x,(n-1)));

        return ans;
    }
}