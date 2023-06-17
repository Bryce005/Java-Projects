/*Bryce Fisher
 * COSC 1337 001
 * 2/29/2021
 * Purpose: To write a program that will verify that the credit card number is valid using the Luhn Algorithim (Program2)
 * Insight: 
 */
package creditCard;

import java.util.Random;
import java.util.Scanner;

public class Program2CCValidation {

	public static void main(String[] args) {
		//set up a scanner
		Scanner scanner =  new Scanner(System.in);
		//set up a boolean named validCreditCard and set it to false
		boolean validCreditCard = false;
		//loop while not a valid credit card
		while(!validCreditCard) {
			//prompt the user for a potential credit card number 
			System.out.print("Please enter a credit card number: ");
			//Get the credit card number as a String - store in potentialCCN (use scanner's nextLine)
			String potentialCCN = scanner.nextLine();

			//use Luhn to validate credit card using the following steps:
			int lastDigit = Integer.parseInt(potentialCCN.substring(potentialCCN.length()-1));
			potentialCCN = potentialCCN.substring(0, potentialCCN.length()-1);

			//check the last digit
			System.out.println(lastDigit);
			//check potentialCCN
			System.out.println(potentialCCN);

			//create reversedCCN as a empty String
			String reversedCCN = "";
			//reverse the digits using a for loop by adding characters to reversedCCN
			for(int i = potentialCCN.length()-1; i>=0;i--) {
				reversedCCN = reversedCCN+potentialCCN.charAt(i);
			}

			//check reversedCCN
			System.out.println(reversedCCN);
			//set boolean isOddDigit to false
			boolean isOddDigit = false;
			//set up an integer called current digit and set it to 0
			int currentDigit = 0;
			//create an integer named sum and set it to 0
			int sum = 0;
			//multiply the digits in odd positions by 2, then subtract 9 from any number higher than 9
			//(for loop running 0 to less than length of reversed CCN)
			for(int i = potentialCCN.length()-1; i>=0; i--) {
				//set currentDigit equal to the integer version of the current character
				currentDigit = Character.getNumericValue(potentialCCN.charAt(i));
				//Test then comment out! - currentDigit -System.out.print(currentDigit);
				System.out.println(currentDigit);
				//toggle isOddDigit	
				isOddDigit = !isOddDigit;
				//if isOddDigit
				if (isOddDigit) {
					currentDigit = currentDigit*2;
					if (currentDigit > 9) {
						currentDigit = currentDigit - 9;
						System.out.println(currentDigit);
					
					}else
						System.out.println(isOddDigit);
				}

			}

			sum = currentDigit + sum;

			int temp = (sum + lastDigit)%10;
			System.out.println(sum + " " + lastDigit + " " + temp);
			if (temp == 0) {
				validCreditCard = true;
			}else 
				System.out.println("Credit card is not valid ");
		}
		
		Random rand = new Random();
		int pin = rand.nextInt(9999-1111)+1112;
		System.out.println(pin);

		scanner.close();
	}

}
