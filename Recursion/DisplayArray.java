import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }

        dis(n,arr);

    }
    public static void dis(int n,int arr[])
    {
        if(n==0)
        {
            return;
        }

        dis(n-1,arr);
        System.out.println(arr[n-1]);
    }
}



import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }

        dis(0,arr);

    }
    public static void dis(int k,int arr[])
    {
        if(k==arr.length)
        {
            return;
        }
        System.out.println(arr[k]);
        dis(k+1,arr);
        
    }
}