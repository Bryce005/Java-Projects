/*Bryce Fisher
 * COSC 1337 001
 * 11/19/2021
 * Purpose: To encapsulate information about a Passenger (Program5Trains)
 */
package trainsDemo;

/**To encapsulate information about a Passenger
 * 
 * @author Fishe
 *
 */
public class Passenger {
	/**The name of a Passenger*/
	String name;
	/**True iff the Passenger is first class*/
	boolean isFirstClass;
	
	/**Constructs a new Passenger from the input data
	 * 
	 * @param name the name of the Passenger
	 * @param isFirstClass true iff the Passenger is first class
	 */
	public Passenger(String name, boolean isFirstClass) {
		setName(name);
		setIsFirstClass(isFirstClass);
	}
	
	/**Returns the name of the Passenger
	 * 
	 * @return the name of the Passenger
	 */
	public String getName() {
		return name;
	}

	/**Sets the name of the Passenger
	 * 
	 * @param name the Passenger name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**Returns true iff Passenger is first class
	 * 
	 * @return ifFirstClass
	 */
	public boolean isFirstClass() {
		return isFirstClass;
	}

	/**Sets ifFirstCLass to true iff the Passenger is first class
	 * 
	 * @param isFirstClass the isFirstClass to set
	 */
	public void setIsFirstClass(boolean isFirstClass) {
		this.isFirstClass = isFirstClass;
	}

	/**Returns whether or not the Passenger is first class or not 
	 * 
	 * @return whether or not the Passenger is first class or not
	 */
	@Override 
	public String toString() {
		String result;
		if (isFirstClass) {
			result = getName()+": !";
		}
		else {
			result = getName();
		}
		return result;
	}

	/**Returns true if and only if the Passenger is first class
	 * 
	 * @param o the object to compare this Passenger to 
	 * @return true iff the Passenger is first class
	 */
	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}



}


