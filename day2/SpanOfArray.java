import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<=n-1;i++)
        {
            arr[i]=scn.nextInt();

        }
           int min=arr[0];
           int max=arr[0];
        for(int i=1;i<=n-1;i++)
        {
            
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }


        }

        int total= max-min;
        System.out.println(total);
    }
}