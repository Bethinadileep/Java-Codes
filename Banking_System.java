//codeby : Dileep

import java.util.*;
public class CO {
	int balance;
	String name;
	double AccountNumber;
	CO(int balance, String name, double Acc) {
		this.balance = balance;
		this.name = name;
		this.AccountNumber = Acc;
	}
	void deposit(int amount) {
		this.balance += amount;
		viewBalance();
		
	}
	void withdraw(int WithrawAmount) {
		if(WithrawAmount <= balance) {
			this.balance -= WithrawAmount;
			viewBalance();
		}
	}
	void viewBalance() {
		System.out.println("The Available Balance is "+this.balance);
	}
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		int Amount = obj.nextInt();
		int Acc = obj.nextInt();
		CO obj1 = new CO(Amount, name, Acc);
		obj1.deposit(1000);
		obj1.withdraw(100);	
	}

}
