import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        ArrayList<String> res = getss(s);
        System.out.println(res);


    }
    public static ArrayList<String> getss(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        String res=s.substring(1);
        char ch=s.charAt(0);

        ArrayList<String> rres= getss(res);

        ArrayList<String> mylist=new ArrayList<>();

        for(String str:rres)
        {
            mylist.add(str);
        }
        for(String str:rres)
        {
            mylist.add(ch+str);
        }

        return mylist;
    }
}