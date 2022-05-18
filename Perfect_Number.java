import java.util.*;

public class Main
{
    static boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return n == sum;
    }
    
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    if(isPerfect(num)) {
	        System.out.println("Numer is a Perfect Number");
	    }
	    else {
	        System.out.println("Not Perfect");
	    }
	}
}
