import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args){
			Scanner scn=new Scanner(System.in);
			int dr=scn.nextInt();
			int dc=scn.nextInt();
			String psf = "";
			int sr=1;
			int sc=1;
			printMazePaths(sr,sc,dr,dc,psf);



	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

			if(sr==dr && sc==dc)
			{
				System.out.println(psf);
				return;
			}

			if(sc+1<=dc)
			{
				printMazePaths(sr,sc+1,dr,dc,psf+"h");
			}
			if(sr+1<=dr)
			{
				printMazePaths(sr+1,sc,dr,dc,psf+"v");
			}
	        
	    }

	}