import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();

        }

        int data= scn.nextInt();
        int fi=firstidx(arr,data);
        int li=lastidx(arr,data);
        System.out.println(fi);
        System.out.println(li);


    }

    public static int firstidx(int[] arr, int data)
    {
        int ans=-1;
        int right=arr.length-1;
        int left=0;

        while(left<=right)
        {
            int mid=(left+right)/2;

            if(arr[mid]>data)
            {
                right=mid-1;

            }
            else if(arr[mid]<data)
            {
                left= mid+1;

            }
            else{
                ans=mid;
                right=mid-1;

            }
        }
        return ans;
    }

    public static int lastidx(int[] arr, int data)
    {
        int ans = -1;
        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;

            if(arr[mid]>data)
            {
                right= mid-1;

            }
            else if(arr[mid]<data)
            {
                left= mid+1;

            }
            else{
                ans= mid;
                left= mid+1;

            }
        }
        return ans;
    }
}