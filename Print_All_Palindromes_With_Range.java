import java.util.*;

public class Main
{
    static boolean isPalindrome(int n) {
            int sum = 0;
		    int reverse = n;
		    while(reverse > 0) {
		        int rem = reverse % 10;
		        sum = sum * 10 + rem;
		        reverse /= 10;
		    }
		    if(sum == n) return true;
		    return false;
    }
	public static void main(String[] args) {
	    ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 100; i < 150; i++) {
		    if(isPalindrome(i)) {
		        System.out.print(i + " ");
		    }
		}
		
	}
}
