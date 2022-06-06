import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int ans = ncr(i,j);
                System.out.print(ans+"\t");
            }
            System.out.println();
        }



    }
    public static int factorial(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res = res*i;

        }
        return res;
    }
    public static int ncr(int n,int r)
    {
        int nfact=factorial(n);
        int nMrfact=factorial(n-r);
        int rfact=factorial(r);
        int k=nMrfact*rfact;

        return nfact/(k);
    }
}