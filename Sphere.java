/*Bryce Fisher
 * COSC 1337
 * 10/24/2021
 * Purpose: To encapsulate a Sphere (Program 4)
 */
package threeDimensional;

/**A class that encapsulates a Sphere
 * @author Fishe
 *
 */
public class Sphere {
	/**The radius of this Sphere
	 * 
	 */
	private int radiusOfSphere;

	public Sphere() {
		setRadiusOfSphere(1);

	}

	/**Gets the radius of this Sphere
	 * @return the radius of this Sphere
	 */
	public int getRadiusOfSphere() {
		return radiusOfSphere;
	}

	/**Sets the radius of this Sphere
	 * @param radiusOfSphere the radius of this Sphere 
	 */
	public void setRadiusOfSphere(int radiusOfSphere) {
		this.radiusOfSphere = radiusOfSphere;
	}

	/**Returns a String version of this Sphere
	 *
	 */
	@Override 
	public String toString() {
		return "Sphere: "+getRadiusOfSphere();
	}

	/**Calculates the surface area of this Sphere
	 * @return the surface area of this Sphere
	 */
	public double getSurfaceAreaOfSphere() {
		double surfaceAreaOfSphere = 4*(Math.PI)*getRadiusOfSphere()*getRadiusOfSphere();
		return surfaceAreaOfSphere;
	}

	/**Calculates the volume of this Sphere
	 * @return the volume of this Sphere
	 */
	public double getVolumeOfSphere() {
		double volumeOfCube = 4/3*(Math.PI)*(Math.pow(getRadiusOfSphere(), 3));
		return volumeOfCube;
	}

}
