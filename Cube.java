/*Bryce Fisher
 * COSC 1337 
 * 10/24/2021
 * Purpose: To encapsulate a Cube (Program 4)
 * 
 */
package threeDimensional;

/**A class that encapsulates a Cube
 * @author Fishe
 */
public class Cube {
	/**The length of one side for this Cube
	 * 
	 */
	private int lengthOfSide;

	/**Sets the length of one side to 1
	 * 
	 */
	public Cube() {
		setLengthOfSide(1);
	}

	/**Sets the length of one side for this Cube
	 * @param lengthOfSide returns the length of one side for this Cube
	 */
	public Cube(int lengthOfSide) {
		setLengthOfSide(lengthOfSide);
	}

	/**Gets the length of one side for this Cube
	 * @return the length of one side for this Cube
	 */
	public int getLengthOfSide() {
		return lengthOfSide;
	}

	/**Sets the length of one side of this Cube
	 * @param lengthOfSide the length of one side of this Cube
	 */
	public void setLengthOfSide(int lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}

	/**Returns a String version of this Cube
	 *
	 */
	@Override 
	public String toString() {
		return "Cube: "+getLengthOfSide();
	}

	/**Calculates the surface area of this Cube
	 * @return the surface area of this Cube
	 */
	public double getSurfaceArea() {
		double surfaceAreaOfCube = 6*getLengthOfSide()*getLengthOfSide();
		return surfaceAreaOfCube;
	}

	/**Calculates the volume of this Cube
	 * @return the volume of this Cube
	 */
	public double getVolumeOfCube() {
		double volumeOfCube = getLengthOfSide()*getLengthOfSide()*getLengthOfSide();
		return volumeOfCube;
	}
}
