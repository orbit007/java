import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        String ques=scn.nextLine();
        
        printss(ques,"");
    }

    public static void printss(String qsf,String asf)
    {

        if(qsf.length()==0)
        {
            System.out.println(asf);
            return;
        }

        char ch=qsf.charAt(0);
        String roq=qsf.substring(1);

        printss(roq,asf+ch);// inc
    

        printss(roq,asf);//exc


    }
}