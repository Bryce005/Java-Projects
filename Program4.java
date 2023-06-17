/*Bryce Fisher
 * COSC 1337 
 * 10/24/2021
 * Purpose: To test the classes for both a Cube and a Sphere that prints out their surface area
 * and volume (Program 4)
 */
package threeDimensional;

import java.util.Scanner;

/**The test class for Program4 that creates a Cube and a Sphere and prints out their surface area and volume
 * 
 * @author Fishe
 *
 */
public class Program4 {

	/**The entry point for the program
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cube firstCube = new Cube();
		Cube secondCube = new Cube();
		Cube thirdCube = new Cube(3);
		System.out.println(firstCube);
		System.out.print("Please enter the length of the side for secondCube: ");
		int accesorValue = firstCube.getLengthOfSide();
		System.out.println("First Cube side length: "+firstCube.getLengthOfSide()+
				", Second Cube surface area: "+secondCube.getLengthOfSide());
		Sphere firstSphere = new Sphere();
		System.out.println(firstSphere);
		System.out.print("Pleas eneter the raidus of the Sphere: ");
		Sphere secondSphere = new Sphere();
		Sphere thirdSphere = new Sphere();
		int accesorValue2 = firstSphere.getRadiusOfSphere();
		System.out.println("First Sphere radius: "+firstSphere.getRadiusOfSphere() + ", "
				+ "Second Sphere radius: "+secondSphere.getRadiusOfSphere());

		scanner.close();
	}

}
