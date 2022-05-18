import java.util.*;

public class Main
{
    static int Sumofn(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    System.out.println(Sumofn(num));
	}
}
