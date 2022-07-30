/*Bryce Fisher
 * COSC 1337 001
 * 9/20/2021
 * Purpose: To create a program using an array of Strings and a for loop (Program1)
 * Insight: The reason for subtracting 4 it to make that it does not go over 
 */
package initials;

import java.util.Random;

public class Program1Initials {

	public static void main(String[] args) {
		//Create a new array of Strings named strings with the following line of code
		String[] strings = {"David Lee Alger", "Kate Garry Hudson", "Tina Stamatina Fey", "Hugh Mungo Grant",
		"Uma Karuna Thurman"};

		//Creates a for loop to step through the array with the following form "for (int i=0;i<strings.length;i++)"
		for (int i=0;i<strings.length;i++) {
		//the following goes in the loop:
			//Set a new String variable named currentName to "[David Lee Alger]"
			String currentName = strings[i];
			int firstIndex = currentName.indexOf(' ');
			String firstName = currentName.substring(0,firstIndex);
			int middleIndex = currentName.lastIndexOf(' ');
			String middleName = currentName.substring(firstIndex+1, middleIndex);
			int lastIndex = currentName.lastIndexOf(' ');
			String lastName= currentName.substring(lastIndex+1);
			//OUtput "Your first name is [David] with a length of [5]"
			System.out.println("Your first name is "+ firstName +" with a length of "+firstName.length());
			//Output "Your middle name is [Lee] with a length of [5]"
			System.out.println("Your middle name is " + middleName +" with a length of " +middleName.length());
			//Output "Your last name is [Alger] with a length of [5]"
			System.out.println("Your last name is " +lastName +" with a length of " +lastName.length());
			//Output "Your initials are [DLA]. The length of your entire name is [15]"
			System.out.println("Your initials are "+firstName.charAt(0)+middleName.charAt(0)+lastName.charAt(0) +
					" The length of your entire name is "+ currentName.length());
			//Output "A random sequence of 5 letters in your name is "[d Lee A]""
			Random rand = new Random();
			int randomSequence = rand.nextInt(currentName.length()-4);
			int endIndex = randomSequence +5;
			System.out.println("A random sequence of 5 letters in your name is "+
					currentName.substring(randomSequence,endIndex));
			//Output two blank lines to separate the name being processed from the next name being processed
			System.out.println();
			System.out.println();


		}

	}
}