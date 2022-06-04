import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//System.out.println(list+ " " + list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

		list.remove(0);
		System.out.println(list);

	}


}