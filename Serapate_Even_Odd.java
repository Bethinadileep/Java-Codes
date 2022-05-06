import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {3,4,5,2,1,7,86,4};
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
		    if(arr[i]%2 == 0){
		        l.add(arr[i]);
		    }
		}
		for(int i = 0; i < arr.length; i++) {
		    if(arr[i]%2 != 0) {
		        l.add(arr[i]);
		    }
		}
		System.out.print(l);
		
	}
}
