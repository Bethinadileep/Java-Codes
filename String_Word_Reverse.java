import java.util.Arrays;

public class Main
{
    static void reverse(String[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }
        for(int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
	public static void main(String[] args) {
		String names[] = {"John","Jammy","Luke"};
		System.out.println("Original Array "+ Arrays.toString(names));
		//reversing array with three elemenets
		reverse(names);
		System.out.println("Reverse Array "+ Arrays.toString(names));
	}
}
