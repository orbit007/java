import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int mat[][]=new int[n][m];
        input(mat,scn);
        exit(mat);

    }

    public static void input(int mat[][],Scanner scn)
    {
        for(int r=0;r<mat.length;r++)
        {
            for(int c=0;c<mat[0].length;c++)
            {
                mat[r][c]=scn.nextInt();
            }
        }
    }

    public static void exit(int mat[][])
    {
        int dir=0;
        int r=0;
        int c=0;
        // for(int r=0;r<mat.length;r++)
        // {
        //     for(int c=0;c<mat[0].length;c++)
        //     {
        //         dir=(dir + mat[r][c])%4;
        //         if(dir==0)
        //         {
        //             c=c+1;
        //         }
        //         else if(dir==1)
        //         {
        //             r=r+1;
        //         }
        //         else if(dir==2)
        //         {
        //             c=c-1;
        //         }
        //         else{
        //             r=r-1;
        //         }
        //     }
        // }
        while(r >=0 && r< mat.length && c >=0 && c< mat[0].length)
        {
              dir=(dir+mat[r][c])%4;
                if(dir==0)
                {
                    c+=1;
                }
                else if(dir==1)
                {
                    r+=1;
                }
                else if(dir==2)
                {
                    c-=1;
                }
                else{
                    r-=1;
                }    
        }
        
                if(dir==0)
                {
                    c-=1;
                }
                else if(dir==1)
                {
                    r-=1;
                }
                else if(dir==2)
                {
                    c+=1;
                }
                else{
                    r+=1;
                }    

                System.out.println(r);
                System.out.println(c);


    }
}