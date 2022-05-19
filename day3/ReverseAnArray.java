import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    int arr2[]=new int[n];
    
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=scn.nextInt();

    }


    for(int i=0;i<=n-1;i++)
    {
      int val = arr[i];
      arr2[(n-1)-i]=val;
    }

    for(int i=0;i<=n-1;i++)
    {
      System.out.print(arr2[i]+" ");
    }

  }
}