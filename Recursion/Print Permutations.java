import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        String ques=scn.nextLine();
        printPermutations(ques,"");

    }

    public static void printPermutations(String qsf, String asf){

        if(qsf.length()==0)
        {
            System.out.println(asf);
            return;
        }

        for(int i=0;i<qsf.length();i++)
        {
            char ch=qsf.charAt(i);
            StringBuilder sb=new StringBuilder(qsf);
            sb.deleteCharAt(i);
            String roq=sb.toString();

            printPermutations(roq,asf+ch);

        }
        
    }

}