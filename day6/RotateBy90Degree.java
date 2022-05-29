import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int mat[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=scn.nextInt();
            }
        }

        tran(mat);
        rot(mat);
        display(mat);


    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tran(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int ele=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=ele;

            }
        }
    }

    public static void rot(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            int lo=0;
            int hi=mat.length-1;
            while(lo<hi)
            {
               int ele=mat[i][lo];
               mat[i][lo]=mat[i][hi];
               mat[i][hi]=ele;

               lo++;
               hi--;
            }
        }
    }

}