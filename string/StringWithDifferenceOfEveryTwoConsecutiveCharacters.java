import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		System.out.println(diff(str));

	}
	public static String diff(String str)
	{
		StringBuilder sb=new StringBuilder();
		sb.append(str.charAt(0));

		for(int i=1;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			char ch2=sb.charAt(sb.length()-1);

			int dif= ch1 - ch2;

			sb.append(dif);
			sb.append(ch1);
		}
		return sb.toString();
	}
}