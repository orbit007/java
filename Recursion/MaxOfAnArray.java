import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();

        }
        int max=find(arr,0);
        System.out.println(max);
    }

    public static int find(int arr[],int idx)
    {

        if(idx==arr.length)
        {
            return Integer.MIN_VALUE;
        }
        int res=find(arr,idx+1);

        if(res>arr[idx])
        {
            return res;
        }
        else{
            return arr[idx];
        }
    }
}