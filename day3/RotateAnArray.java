import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=scn.nextInt();
    }

    int k=scn.nextInt();
    k=k%arr.length;

    if(k<0)
    {
      k=k+arr.length;

    }

    int low=n-k;
    int high = n-1;
    // System.out.println(arr[low]);
    // for(int i=0;i<=n-1;i++)
    // {
    //   if(low>high)
    //   {
    //     break;
    //   }
    //   int ele = arr[low];
    //   arr[low]=arr[high];
    //   arr[high]=ele;
    //   low++;
    //   high--;
      
    // }
    // System.out.println(arr[4]);
    while(low<high)
    {
      int ele = arr[low];
      arr[low]= arr[high];
      arr[high]=ele;
      low++;
      high--;
    }
   // System.out.println(arr[4]);
   int l=0;
   int h=(n-1)-k;
   while(l<h)
   {
     int ele = arr[l];
     arr[l]= arr[h];
     arr[h]=ele;
     l++;
     h--;
   }
   int l1=0;
   int h1=n-1;
   while(l1<h1)
   {
     int ele = arr[l1];
     arr[l1]=arr[h1];
     arr[h1]= ele;
     l1++;
     h1--;
   }

   for(int i=0;i<=n-1;i++)
   {
     System.out.print(arr[i]+" ");
   }

    

  }
    
}