import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<=n-1;i++)
        {
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]);
        }
    }
}