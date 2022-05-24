import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();

        }

        int k= scn.nextInt();

        System.out.println(binarySearch(arr,k));

    }
    public static int binarySearch(int[] arr,int k)
    {
        int lo=0 ,hi=arr.length-1;

        while(lo<=hi)
        {
            int mid = (lo + hi)/2;

            if(arr[mid]<k)
            {
                lo = mid+1;
            }
            else if(arr[mid]>k)
            {
                hi=mid-1;

            }
            else{
                return mid;

            }
        }
        return -1;

    }



}