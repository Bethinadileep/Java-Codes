//codeby : Dileep

import java.util.*;

class Counting_Bits {
    public void countBits(int n) {
        int[] res = new int[n+1];
         res[0]=0;
        if(n==0)
           System.out.println(res);
        if(n==1){
            res[1]=1;
            System.out.println(res);
        }
        if(n>1){
            res[1]=1;
            for(int i=2;i<=n;i++)
            res[i]=decToBin(i);
        }
        System.out.println(res);
        
        for(int k=0;k<res.length;k++) {
        	System.out.print("[ "+res[k]+"+" ]");
        } 
        
        
    }
    
    public int decToBin(int num){
        int count=0;
        while(num>0){
            if(num%2==1)
                count+=1;
            num=num/2;
            
        }
        return count;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counting_Bits obj = new Counting_Bits();
		obj.countBits(5);
	}

}
