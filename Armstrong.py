import java.util.*;

public class Main
{
    static boolean isArmstrongNumber(int num) {
        
        int reverse = num;
        int count = 0;
        int num1 = num;
        while(num1 != 0){
            count++;
            num1 /= 10;
        }
        int sum = 0;
        while(reverse > 0) {
            int r = reverse % 10;
            sum += Math.pow(r,count);
            reverse /= 10;
        }
        if(sum == num) return true;
        return false;
    }
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    if(isArmstrongNumber(num)) {
	        System.out.println("Yes Number is Armstrong Number");
	    }
	    else {
	        System.out.println("No Number is Not Armstrong Number");
	    }
		
	}
}
