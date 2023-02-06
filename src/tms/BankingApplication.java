package tms;

import java.util.Scanner;

/*
 * Basic banking application with a possibility to 
 * make a deposit, withdraw money, check your balance, check last transaction
 */
public class BankingApplication {

	public static void main(String[] args) {
		BankAccount ac = new BankAccount("John Doe", "123456");
		ac.start(ac);

	}

}

class BankAccount{
	String name;
	String id;
	int balance;
	int lastTransaction;
	
	BankAccount(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public void deposit(int amount) {
		if (amount > 0 && amount < Integer.MAX_VALUE) {
			balance += amount;
			lastTransaction = amount;
		} else {
			System.out.println("invalid amount");
		}
	}
	
	public void withdraw(int amount) {
		if (amount > 0 && amount < Integer.MAX_VALUE) {
			balance -= amount;
			lastTransaction = -amount;
		} else {
			System.out.println("invalid amount");
		}
	}
	
	
	public void start(BankAccount client) {
		int option = 0;
		int amount = 0;
		
		System.out.println("Hello, "+ client.name);
		System.out.println("Your id: "+ client.id);
		
		System.out.println("\n1. Deposit\n2. Wthdraw\n3. Check balance\n4. Check last transaction\n5. Exit");	
		
		Scanner scan = new Scanner(System.in);
		do {
				System.out.println("Choose an option");
				
				option = scan.nextInt();
				
				switch(option) {
				case 1:
					System.out.println("Enter amount for deposit");
					amount = scan.nextInt();
					client.deposit(amount);
					break;
				case 2:
					System.out.println("Enter amount for withdrawal");
					amount = scan.nextInt();
					client.withdraw(amount);
					break;
				case 3:
					System.out.println("Your account balance is "+ client.balance);
					break;
				case 4:
					System.out.println("The last transaction: " + client.lastTransaction);
					break;
				case 5:
					System.out.println("see ya later");
					break;
				default:
					System.out.println("Invalid data");
					break;
				}
				
		} while(option != 5);
		scan.close();
	}
}

