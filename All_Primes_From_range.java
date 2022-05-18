import java.util.*;

public class Main
{
    static boolean isPrime(int n) {
        for(int i = 2; i < n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int min = s.nextInt();
	    int max = s.nextInt();
	    for(int i = min; i <= max; i++){
    	    if(isPrime(i)){
    	        System.out.print(i + " ");
    	    }
    	        
    	    
	    }
	    
		
	}
}
