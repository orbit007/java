import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		String s="hello";
		System.out.println(s);
		System.out.println(s.length());
		String s2="abhishek";
		System.out.println(s+" "+s2);

		int v1=10;
		int v2=20;
		System.out.println(v1+v2+s);
		System.out.println(v1+s+v2);
		System.out.println(s+v1+v2);
		System.out.println(s+v1*v2);
		System.out.println(v1*v2+s);
	}
}