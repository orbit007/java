import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
            
        }
        int x=scn.nextInt();
        int a=index(arr,0,x);
        System.out.println(a);
    }
    public static int index(int arr[],int idx,int x)
    {
        if(idx==arr.length)
        {
            return -1;
        }

       
         if(x==arr[idx])
        {
            return idx;
        }
        else{
          return index(arr,idx+1,x);
        }

        

        

       

        
    }
}