import java.util.*;
import java.util.Random;

public class Logic {
	public static void main(String args[])
	{
		String str = "Hello My name is Dileep";
		String ch[] = str.split(" ");
		for(int i = 0; i <= ch.length; i++) {
			String rev = ch[i];
			for(int j = rev.length()-1; j >= 0; j--) {
				System.out.print(rev.charAt(j));
			}
			System.out.print(" ");
			
		}
		
	}
}
