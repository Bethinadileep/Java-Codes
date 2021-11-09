//code by: Dileep
import java.util.*;
class Reverse_String
{
	public static void Reversestring(char[] ch,int length){
		if(length>0){
			Print_Reverse_String(ch[length-1]);
			length--;
			//Recursively Calling the Function
			Reversestring(ch,length);
		}
	}
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		char[] ch = s.toCharArray();//convert String into Character
		int length = ch.length;
		Reversestring(ch,length);
	}
}
