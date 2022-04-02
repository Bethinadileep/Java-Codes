import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str = "abchh";
	    int fre[] = new int[26];
	    for(int i = 0; i < str.length(); i++) {
	        fre[str.charAt(i)-'a'] += 1;
	    }
	    String ans = "";
	    for(int i = 0; i < 26; i++) {
	        if(fre[i] != 0) {
	            char ch = (char)(i + 97);
	            ans += ch;
	            ans += fre[i];
	        }
	    }
	    System.out.println(ans);
	    
		
	}
}
