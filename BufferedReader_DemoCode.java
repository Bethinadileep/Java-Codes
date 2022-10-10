//Code by: Bethina Dileep

import java.io.*;

public class Main
{
	public static void main(String[] args)throws Exception {
		InputStreamReader s = new InputStreamReader(System.in);
		BufferedReader r = new BufferedReader(s);
		String name = "";
		while(!name.equals("stop")) {
		    System.out.println("Enter your name");
		    name = r.readLine();
		    System.out.println(name);   
		}
	}
}
