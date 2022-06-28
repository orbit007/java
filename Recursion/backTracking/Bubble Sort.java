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
    for(int j=0;j<n;j++)
    {
      System.out.println(arr[j]);
    }

  }

  public static void sort(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          swap(arr,j,j+1);
        }
      }
    }
  }

  public static void swap(int arr[],int i,int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }

}