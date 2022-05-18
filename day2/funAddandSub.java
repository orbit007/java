import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2= scn.nextInt();
        int total = add(num1,num2);
        System.out.println(total);
        sub(num1,num2);

    }

    public static int add(int n1,int n2)
    {
        int ans= n1+n2;
        return ans;
    }

    public static void sub(int n1,int n2)
    {
        int ans = n1-n2;
        System.out.println(ans);

    }
}