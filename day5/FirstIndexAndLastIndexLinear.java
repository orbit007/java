import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();

        }

        int data=scn.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==data)
            {
                System.out.println(i);
                break;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==data)
            {
                System.out.println(i);
                break;
            }
        }

    }
}