import java.util.*;

public class Main
{
    static boolean isPrime(int n) {
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    boolean ans = isPrime(num);
	    if(ans == true) {
	        System.out.println("Number is Prime Number");
	    }
	    else {
	        System.out.println("Number is Not a Prime Number");
	    }
		
	}
}
