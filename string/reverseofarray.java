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
		int l=0,h=arr.length-1;
		while(l<h)
		{
			int ele=arr[l];
			arr[l]=arr[h];
			arr[h]=ele;
			
			l++;
			h--;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}


	}
}