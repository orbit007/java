import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder();

		sb.append("abhishek");
		System.out.println(sb);
		sb.append("biswas");
		System.out.println(sb);
		System.out.println(sb+ " " + sb.length());
		System.out.println(sb.charAt(0));
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.insert(0,'a');
		System.out.println(sb);
		sb.setCharAt(13,'#');
		System.out.println(sb);
	}
}