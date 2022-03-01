/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n = 15;
		int sum = 0;
		for(int i=1;i*i<n;i++){
		    if(n%i == 0){
	            if(i*i == n || i==1){
	                sum += i;
	            }
	            else{
	                sum += i + n / i;
	            }
		    }
		}
		if(sum == n){
		    System.out.println("Number is Perfect square");
		}
		else{
		    System.out.println("Number is not perfect sqaure");
		}
	}
}
