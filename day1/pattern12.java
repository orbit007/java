import java.util.*;
public class Main{
   public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int fst = 0;
       int sec = 1;
       for(int row=1;row<=n;row++)
       {
           int nst = row;

           
           for(int i=1;i<=nst;i++)
           {   int thd = fst+sec;
               System.out.print(fst+"\t");
                fst = sec;
               sec = thd;
            }
            System.out.println();
        }
           

          
   }

}