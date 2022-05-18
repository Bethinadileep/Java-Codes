import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int num = 121;
		int reverse = num;
		int sum = 0;
		while(num > 0) {
		    int rem = num % 10;
		    sum = sum * 10 + rem;
		    num /= 10;
		}
		if(sum == reverse) {
		    System.out.println("Number is Plaindrome");
		}
		else {
		    System.out.println("Number is Not Palindrome");
		}
	}
}
