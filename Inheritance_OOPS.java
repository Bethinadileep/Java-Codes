//codeby : Dileep

package Inheritance;
import java.util.*;
class ClassA{
	void firstMethod() {
		System.out.println("Johnny Johnny...,;");
	}
	void secondMethod() {
		System.out.println("Yes Papa.");
	}
	void thirdMethod() {
		System.out.println("Eating Sugar...,");
	}
}
class ClassB extends ClassA {
	void secondMethod() {
		super.firstMethod();
		super.secondMethod();
		super.thirdMethod();
		System.out.println("No Papa.");
	}
	void thirdMethod() {
		System.out.println("Telling Lies...,");
	}
}
class ClassC extends ClassB{
	void firstMethod() {
		System.out.println("Open Your Mouth..., Ha. Ha. Ha.");
	}
	void secondMethod() {
		System.out.println("No Papa.");
	}
	void thirdMethod() {
		super.secondMethod();
		super.thirdMethod();
		this.secondMethod();
	}
}


public class Infosys_Inheritance_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA objA = new ClassA();
		ClassB objB = new ClassB();
		ClassC objC = new ClassC();
		
		objB.secondMethod();
		objB.thirdMethod();
		objC.secondMethod();
		objC.firstMethod();

	}

}
