/*Bryce Fisher
 * COSC 1337 001
 * 11/19/2021
 * Purpose: To encapsulate information about a Train (Program5Trains)
 */
package trainsDemo;

import java.util.ArrayList;

/**To encapsulate information about a Train
 * 
 * @author Fishe
 *
 */
public class Train {
	/**The name of a Train*/
	String name;
	/**Passenger list*/
	ArrayList<Passenger> list;

	/**Constructs a new Train from the input data
	 * 
	 * @param name the name of the Train
	 */
	public Train(String name) {
		setName(name);
		list = new ArrayList<>();
	}

	/**Returns the name of the Train
	 * 
	 * @return the name of the Train
	 */
	public String getName() {
		return name;
	}

	/**Sets the name of the Train
	 * 
	 * @param name the Train name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**Adds a Passenger to the list of passengers 
	 * 
	 * @param passenger the list of passengers to add to
	 * @return a new Passenger to the list of passengers
	 */
	public int addPassenger(Passenger passenger) {
		list.add(passenger);
		return list.size();
	}

	/**Returns the percentage of passengers in first class
	 * 
	 * @return the percentage of passengerrs in first class
	 */
	public double getPercentInFirstClass() {
		int count = 0;
		for (Passenger passenger : list) {
			if (passenger.isFirstClass()) {
				count ++;
			}

		}

		/**Returns the passenger count divided by the list of passengers
		 * 
		 */
		return (double) count / list.size();
	}

	/**Returns the revenue for the regular price and first class price for a Train
	 * 
	 * @param priceForFirstClass the price for first price for a Train
	 * @param regularPrice the regular price for a Train
	 * @return the revenue for the regualr price and the first class price for a Train
	 */
	public double getTrainRevenue(double priceForFirstClass, double regularPrice) {
		int total = 0;
		for (Passenger passenger : list) {
			if (passenger.isFirstClass()) {
				total += priceForFirstClass;
			}
			else {
				total += regularPrice;
			}

		}

		/**Returns the total price
		 * 
		 */
		return total;
	}
	
	/**Returns true iff the Passenger is on the Train
	 * 
	 * @param nameOfPassenger the name of the Passenger
	 * @return isPassengerOnTrain
	 */
	public boolean isPassengerOnTrain(String nameOfPassenger) {
		for (Passenger passenger : list) {
			if (passenger.getName().equals(nameOfPassenger)) {
				return true;
			}
		}return false;
	}

	/**Returns iff the Passenger is on the Train
	 * 
	 * @param o the object to compare this Train to
	 * @return true iff the Passenger is on the Train
	 */
	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}

	/**Returns the name of the Train and the names of the passengers on it 
	 * 
	 * @return the name of the Train and the names of the passengers on it
	 */
	@Override 
	public String toString() {
		String result;
		result = getName();
		int i = 1;
		for (Passenger passenger : list) {
			result+="\n"+i++ +" - "+passenger.toString(); 
		}
		
		/**Returns the result
		 * 
		 */
		return result;
	}

}




