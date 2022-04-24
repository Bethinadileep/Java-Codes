import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int k = 3, n = 5;
	    int sum = 1;
	    while(k != 0) {
	        sum *= n;
	        k--;
	    }
	    System.out.println(sum);
	}
}
