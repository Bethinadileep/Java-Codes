import java.util.*;

public class Main
{
    static double sumofAP(double a, double d, int n) {
        double sum = (n / 2.0) * ( 2.0 * a + (n - 1) * d);
        return sum;
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    double a = s.nextDouble();
	    double d = s.nextDouble();
	    int n = s.nextInt();
	    
	    System.out.println(sumofAP(a,d,n));
	    
	    
	}
}
