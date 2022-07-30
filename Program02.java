/*Bryce Fisher
 * COSC 1315 001
 * 3/1/2021
 * Purpose: To convert an integer value of meters to inches.
 */
package inchesMeters;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner cameron = new Scanner(System.in);
		
		//Prompt with Input a value for meters: 
		System.out.print("Input a value for meters: ");
		//Read meters
		double meters = cameron.nextDouble();
		//Calculate inches given value of meters
		double inches = meters * 39.36;
		//Output meters is
		//Output inches
		System.out.println(meters + " meters is " + inches + " inches");
		cameron.close();

	}

}
