import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		for(int ii = 1; ii <= n; ii++){
    		    if(n % ii == 0) {
    		        a.add(ii);
    		    }
    		}
            for(int j = 0; j < a.size(); j++) {
                System.out.print(a.get(j) + " ");
            }
    		System.out.println();
    		// Update your code below this line to solve the problem
		}
	}
}
