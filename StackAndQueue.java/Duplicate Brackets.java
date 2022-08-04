import java.util.*;
public class Main{
   public static void main(String args[])
   {
      Scanner scn=new Scanner(System.in);

      String exp=scn.nextLine();
      System.out.println(duplicate(exp));

   }

   public static boolean duplicate(String exp)
   {
      Stack<Character> St=new Stack<>();

      for(int i=0;i<exp.length();i++)
      {
         char ch=exp.charAt(i);

         if(ch ==' ')
         {
            continue;
         }
         else if(ch==')')
         {
            if(St.peek()=='(')
            {
               return true;
            }
            else{
               while(St.peek() != '(')
               {
                  St.pop();
               }
               St.pop();
            }

         }
         else{
            St.push(ch);
         }
      }
      return false;
   }
}