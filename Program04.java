/*Bryce Fisher
 * COSC 1315 001
 * 4/7/2021
 * Purpose: To write a program that accepts a current balance and a transaction (Program04)
 */
package bankApp;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextDouble();
		displayPrompt();
		computeNewBalance();
		displayOutput();
		scanner.close();
	}
	
	public static void displayPrompt() {
		System.out.println("Please enter your current balance: ");
	}
	
	public static double computeNewBalance() {
		double currentBalance = 0;
		double newBalance = 0;
		return currentBalance + newBalance;
	}
		
	public static void displayOutput() {
		double OVERDRAFT_FEE = 25.00;
		double currentBalance = 0;
		System.out.print("\nYour balance before the current transaction was: "
				+ "$"+(currentBalance)+".\nYou made a ");
		double newBalance = 0;
		if (newBalance < 0)
			System.out.print("withdrawl");
		else 
			System.out.print("deposit");
		System.out.println(" of $"+newBalance+".\n");
		if (currentBalance < 0 && newBalance <0)
			System.out.println("An overdraft fee of $"+OVERDRAFT_FEE+" was assessed.\n");
		System.out.println("Your new balance is $"+newBalance+".\n");
		currentBalance = newBalance;
		System.out.print("Do you want to continue? (Y/N): ");



		
	}
}