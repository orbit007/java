import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String str = scn.next();
        palindromicSubstring(str);

	}

	public static void palindromicSubstring(String str){
		for(int i = 0 ; i < str.length() ; i++){
			for(int j = i + 1 ; j <= str.length() ; j++){
				String ss = str.substring(i,j);
				if(ispal(ss))
				{
					System.out.println(ss);
				}
				
			}	
		}
	}

	public static boolean ispal(String s)
	{
		int l=0, h=s.length()-1;
		while(l<h)
		{
			if(s.charAt(l)==s.charAt(h))
			{
				l++;
				h--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}