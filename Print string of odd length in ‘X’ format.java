import java.util.*;

public class Main
{
	public static void main(String[] args) {
        String str = "12345";
        int len = str.length();
        for(int i = 0; i < str.length(); i++) {
            int k = len - i - 1;
            for(int j = 0; j < str.length(); j++) {
                if(i == j || j == k) {
                    System.out.print(str.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }
        
	}
}
