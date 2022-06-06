import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int a=num(n);
        System.out.println(a);

    }

    public static int num(int n)
    {
        
        if(n==0)
        {
            return 1;
        }
         
       int ans=(num(n-1))*n;
        

    

      return ans;  
    }
}