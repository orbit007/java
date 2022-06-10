import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(getStair(n));

    }

    public static ArrayList<String> getStair(int n)
    {
        if(n==0)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> mylist = new ArrayList<>();

        if(n>=1)
        {
            ArrayList<String> paths= getStair(n-1);
            for(String path:paths)
            {
                mylist.add(1+path);
            }
        }

         if(n>=2)
        {
            ArrayList<String> paths= getStair(n-2);
            for(String path:paths)
            {
                mylist.add(2+path);
            }
        }

         if(n>=3)
        {
            ArrayList<String> paths= getStair(n-3);
            for(String path:paths)
            {
                mylist.add(3+path);
            }
        }
        return mylist;
    }
}