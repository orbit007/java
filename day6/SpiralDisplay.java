import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();

        int mat[][]= new int[n][m];

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]= scn.nextInt();

            }
        }

        int rmin=0, cmin=0, rmax=n-1, cmax=m-1, count=0;
        while(count<n*m)
        {
            //left wall
            for(int r=rmin;r<=rmax && count<n*m;r++)
            {
                System.out.println(mat[r][cmin]);
                count++;
            }
            //bottom wall
            for(int c=cmin+1;c<=cmax && count<n*m;c++)
            {
                System.out.println(mat[rmax][c]);
                count++;
            }
            // right wall
            for(int r=rmax-1;r>=rmin && count<n*m;r--)
            {
                System.out.println(mat[r][cmax]);
                count++;
            }
            //top wall
            for(int c=cmax-1;c>=cmin+1 && count<n*m;c--)
            {
                System.out.println(mat[rmin][c]);
                count++;

            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;


        }

    }
}