package Infitq_Exam;
import java.util.Scanner;
public class Demo1 {
	public static int  reverse(int num) {
		int rem,sum=0;
		while(num>0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		return sum;
	}
	public static boolean printPalindrome(int val) {
		return val == reverse(val);
	}
	public static void main(String args[])
	{
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int num = obj.nextInt();
		while(true) {
			num = num+reverse(num);
			if(printPalindrome(num)) {
				System.out.println(num);
				break;
			}
		}
	}

}
