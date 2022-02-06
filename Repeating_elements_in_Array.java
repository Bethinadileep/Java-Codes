package Object_Oriented_Programming;
import java.util.*;
public class Set_HashSet {
	static void repeatingEle(int[] arr,int n) {
		int cnt = 0;
		int re[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					re[cnt++] = arr[i];
				}
			}
		}
		for(int i=0;i<cnt;i++)
		{
			System.out.print(re[i]+" ");
		}
	}
	public static void main(String[] args) {
		int n = 9;
		int arr[] = { 4, 3, 9, 2, 2, 4, 1, 10, 10, 89, 34 };
		repeatingEle(arr,n);
		
		

	}

}
