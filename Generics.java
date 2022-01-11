//codeby : Dileep

package Inheritance;

import java.util.*;
//Genarics
class demo <T>{
	T data;
	demo(T d){
		this.data = d;
	}
	T printData() {
		return this.data;
}

public static void main(String args[]) {
	demo obj = new demo(45);
	System.out.println(obj.printData());
	
	demo obj2 = new demo("Jesus");
	System.out.println(obj2.printData());
	
	demo obj3 = new demo('C');
	System.out.println(obj3.printData());
	}
}
