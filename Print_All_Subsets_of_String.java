import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		int temp = 0;
		
		//total subsets for a string of size is n(n+1)/2
		String arr[] = new String[len*(len+1)/2];
		
		for(int i = 0; i < len; i++) {
		    for(int j = i; j < len; j++) {
		        arr[temp] = str.substring(i,j+1); 
		        temp++;
		    }
		}
		
		//Printing All Subsets of array length
		for(int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}
		
	}
}
