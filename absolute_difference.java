//Absolute Difference between 
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = new int[]{1,3,2};
		Arrays.sort(arr);
		int v = 0;
		for(int i = 1; i < arr.length; i++) {
		    v += Math.abs((arr[i]) - (arr[i-1]));
		}
		System.out.println(v);
	}
}
