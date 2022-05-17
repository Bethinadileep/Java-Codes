import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int v = s.nextInt();
		int arr[]= new int[n];
		Arrays.fill(arr,0);
		for(int i = 1; i <= v; i++) {
		    int m1 = s.nextInt();
		    int m2 = s.nextInt();
		    int m3 = s.nextInt();
		    
		    arr[m1-1] += m3;
		    arr[m2-1] += m3;
		}
		int max_value = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
		    if(arr[i] > max_value) {
		        max_value = arr[i];
		    }
		}
		System.out.println(max_value);
	}
}
