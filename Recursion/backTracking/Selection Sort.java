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

    sort(arr);

    for(int k=0;k<n;k++)
    {
      System.out.println(arr[k]);
    }
  }

  public static void sort(int arr[])
  {

    for(int idx=1;idx<=arr.length;idx++)
    {
      int midx=idx-1;
      for(int i=idx;i<arr.length;i++)
      {
        if(arr[midx]>arr[i])
        {
          midx=i;
        }
      }

     swap(arr,midx,idx-1);
    }


  }
  public static void swap(int arr[],int i,int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
}