import java.util.*;
public class Main{
   public static void main(String args[])
   {
       Scanner scn= new Scanner(System.in);
       int n = scn.nextInt();
       int arr[]=new int[n];
       

       for(int i=0;i<=n-1;i++)
       {
           arr[i]=scn.nextInt();
       }

       int num=scn.nextInt();

       int total = find(arr,num);
       System.out.println(total);



    }

    public static int find(int arr[],int num)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }

        return -1;

    }


}
