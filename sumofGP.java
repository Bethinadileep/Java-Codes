import java.util.*;

public class Main
{
    static int sumofGP(int a, int r, int n) {
        //common ratio
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a;
            a = a * r;
        }
        return sum;
    }
	public static void main(String[] args) {
	    int a = 2, r = 2, n = 4;
	    System.out.println(sumofGP(a,r,n));
	    
	    
	}
}
