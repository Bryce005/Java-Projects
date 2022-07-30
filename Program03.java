/*Bryce Fisher
 * COSC 1315 001
 * 3/29/20201
 * Purpose: To write a program that will allow a user to multiply and divide pairs of integer fractions (Program03)
 */
package cool;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner reed = new Scanner(System.in);
		//Prompt with “Please enter the numerator for fraction 1: “
		System.out.print("Please enter the numerator for fraction 1: ");
		//Read numerator1. 
		int numerator1 = reed.nextInt();
		//Prompt with “Please enter the denominator for fraction 1(zero not allowed): “
		System.out.print("Please enter the denominator for fraction 1 (zero not allowed): ");
		//Read denominator1. 
		int denominator1 = reed.nextInt();
		//Prompt with “Please enter the numerator for fraction 2: “
		System.out.print("Please enter the numerator for fraction 2: ");
		//Read numerator2. 
		int numerator2 = reed.nextInt();
		//Prompt with “Please enter the denominator for fraction 2 (zero not allowed): “ 
		System.out.print("Please enter the denominator for fraction 2 (zero not allowed: ");
		//Read denominator2. 
		int denominator2 = reed.nextInt();
		//Calculate fraction1String = getFraction(numerator1, denominator1) 
		int fraction1String = getFraction(numerator1, denominator1);
		//Calculate fraction2string = getFraction(numerator2, denominator2)
		int fraction2String = getFraction(numerator2, denominator2);
		//Calculate numeratorProduct = numerator1*numerator2
		int numeratorProduct = numerator1 * numerator2;
		//Calculate denominatorProduct = denominatorProduct = denominator1*denominator2
		int denominatorProduct = denominator1 * denominator2;
		//Calculate productString = getFraction(numeratorProduct, denominatorProduct)
		int productString = numeratorProduct / denominatorProduct;
		//Calculate productDecimal = fractionToDecimal(numeratorProduct, denominatorProduct)
		double productDecimal = numeratorProduct / denominatorProduct; 
		//Calculate numeratorQuotient = numeratorQuotient = numerator1 * denominator2
		int numeratorQuotient = numerator1 * denominator2; 
		//Calculate denominatorQuotient = denominatorQuotient = denominator1 * numerator2 
		int denominatorQuotient = denominator1 * numerator2;
		//Calculate quotientString = getFraction(numeratorQuotient, denominatorQuotient)
		int quotientString = numeratorQuotient / denominatorQuotient;
		//Calculate quotientDecimal = fractionToDecimal(numeratorQuotient, denominatorQuotient)
		double quotientDecimal = numeratorQuotient / denominatorQuotient;

		//Output fraction1String+” * “+fraction2String+”: The resulting fraction is “+productString+”.”
		System.out.println("The resulting fraction is: "+productString);
		//Output “The decimal representation of “+productString+” is “+productDecimal+”.”
		System.out.println("The decimal representation of "+productString+" is "+productDecimal);
		//Output fraction1String+” / “+fraction2String+”: The resulting fraction is “+quotientString+”.”
		System.out.println("The resulting fraction is "+quotientString);
		//Output “The decimal representation of “+quotientString+” is “+quotientDecimal+”.”
		System.out.println("The decimal representation of "+quotientString+" is "+quotientDecimal+".");
		//Call Method getFraction(numerator, denominator)
		getFraction(numerator1, denominator1);
		//Call Method fraction to decimal(numerator, denominator)
		fractionToDecimal(numerator1, denominator1);
		reed.close();
	}
	
	//String getFraction(int numerator, int denominator)
	public static int getFraction(int numerator, int denominator) {
		//return numerator+”/”+denominator
		return numerator / denominator;
	
	}
	
	//double fractionToDecimal(int numerator, int denominator)
	public static double fractionToDecimal(int numerator, int denominator) {
		//return (double) numerator / denominator 
		return (double) numerator / denominator;

		


	}

}
