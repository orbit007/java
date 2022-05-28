import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int mat[][]=new int[n][m];

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=scn.nextInt();
            }
        }

        for(int j=0;j<mat[0].length;j++)
        {
          
          if(j%2==0)
          {
              for(int i=0;i<mat.length;i++)
              {
                  System.out.println(mat[i][j]);
              }
          }
          else
          {
              for(int i=mat.length-1;i>=0;i--)
              {
                  System.out.println(mat[i][j]);
              }
          }

        }

       
    }
}