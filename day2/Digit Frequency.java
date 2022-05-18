import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = scn.nextInt();
        int total = digfr(n,num);
        System.out.println(total);

    }
    public static int digfr(int n,int num)
    {    
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            if(rem==num)
            {
                count++;
            }
            n=n/10;


        }
        return count;
    }
}