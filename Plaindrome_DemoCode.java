//Code by: Bethina Dileep
//Program to check wheather given number is palindrome or not
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//int rem;
		int sum = 0;
		int t = n;
		while(n != 0) {
		    int rem = n % 10;
		    sum = (sum*10) + rem;
		    n /= 10;
		}
		if(t == sum){
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not a Palindrome"+sum);
		    
		}
	}
}


//Program to check wheather given string is palindrome or not
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String name = "aabaa";
		String cp = "";
		String temp = name;
		for(int i = name.length()-1; i >= 0; i--) {
		    cp += name.charAt(i);
		}
		if(temp.equals(cp)){
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not a Palindrome number");
		}
	}
}

