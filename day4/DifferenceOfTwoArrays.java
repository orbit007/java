import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[]= new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=scn.nextInt();

        }
        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=scn.nextInt();
        }

        int ans[]=new int[n2];
        int i=n1-1;
        int j=n2-1;
        int k=ans.length - 1;
        int b=0;

        while(k>=0)
        {
            int d=arr2[j]+b;
            int ele=0;

            if(i>=0) ele=arr1[i];

            if(d>=ele)
            {
                d=d-ele;
                b=0;

            }
            else
            {
                d=d+10 -ele;
                b=-1;

            }

            ans[k]=d;
            i--;
            j--;
            k--;

        }

        int idx=0;
        while(idx<ans.length)
        {
            if(ans[idx]==0)
            {
                idx++;
            }
            else{
                break;
            }

        }

        while(idx<ans.length)
        {
            System.out.println(ans[idx]);
            idx++;
        }


    }
}