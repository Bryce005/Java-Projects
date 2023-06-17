/*Bryce Fisher
 * COSC 1337 001
 * 10/11/2021
 * Purpose: To convert a number in some other number system (such as binary) to decimal. (Program3NumberConversion)
 */
package numberSystem;

import java.util.Scanner;

public class Program3NumberConversion {

	public static int parseNumber(char letter) {
		switch (letter) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9': 
			return 9;
		case 'A':
		case 'a':
			return 10;
		case 'B':
		case 'b':
			return 11;
		case 'C':
		case 'c':
			return 12;
		case 'D':
		case 'd':
			return 13;
		case 'E':
		case 'e':
			return 14;
		case 'F':
		case 'f':
			return 15;

		}
		return 0;
	}

	public static int valueOfDigit(int place, int radix, int number) {
		return number * (int) Math.pow(radix,place);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String response = "";
		do {
			int sum = 0;
			System.out.println("Enter a base up to 16: ");
			int radix = scanner.nextInt();
			System.out.println("Enter a number: ");
			String inputNumber;
			inputNumber = scanner.next();
			int place = 0;
			for (int i = inputNumber.length()-1; i>=0; i--, place++) {
				char currentCharacter = inputNumber.charAt(i);
				int	currentInteger = parseNumber(currentCharacter);
				sum += valueOfDigit(place,radix,currentInteger);
			}
			System.out.println("" +inputNumber+" in base "+radix+" converts to "+sum+" in base 10.");
			System.out.print("Enter 'y' to convert another number: ");

		}while (response.equals("y"));

		scanner.close();

	}
}	