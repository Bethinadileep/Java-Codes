import java.util.*;

public class Main
{
    public static void CountVCS(String str) {
        int vowel_count = 0, conso_count = 0, space_count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel_count++;
            } 
            else if(ch >= 'a' && ch <= 'z'){
                conso_count++;
            }
            else if(ch == ' ') {
                space_count++;
            }
            
        }
        System.out.println("Count of Vowels: "+ vowel_count);
        System.out.println("Count of consonants: "+ conso_count);
        System.out.println("Count of Spaces: "+ space_count);
    }
    
	public static void main(String[] args) {
        String str = "palindrome program in java";
        CountVCS(str);    
	}
}
