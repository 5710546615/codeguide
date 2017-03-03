package CreateDescriptiveName;

import java.util.Scanner;

/**
 * PhysicCalculation is the class for calculate Distance, Time and Velocity.
 * 
 * @author Visurt Anuttivong
 * @version 5710546615
 */

public class physicCalculation {

	/* Initialize scanner */
	Scanner scan = new Scanner(System.in);

	/* Absolutely distance */
	private double distance;
	/* Absolutely time */
	private double time;
	/* Absolutely velocity */
	private double velocity;

	/* Initialize a physicCalculation. */
	public physicCalculation() {
		this.distance = 0;
		this.time = 0;
		this.velocity = 0;
	}

	// TODO rename setS to be more specific.
	/**
	 * Set the distance.
	 * 
	 * @param distance
	 */
	public void setS(double distance) {
		this.distance = distance;
	}

	// TODO rename setT to be more specific.
	/**
	 * Set the time.
	 * 
	 * @param time
	 */
	public void setT(double time) {
		this.time = time;
	}

	// TODO rename setV to be more specific.
	/**
	 * Set the velocity.
	 * 
	 * @param velocity
	 */
	public void setV(double velocity) {
		this.velocity = velocity;
	}

	// TODO rename getS to be more specific.
	/**
	 * Get the distance.
	 * 
	 * @return distance
	 */
	public double getS() {
		if (distance == 0) {
			System.out.print("Input Velocity : ");
			setV(scan.nextDouble());
			System.out.print("Input Time : ");
			setT(scan.nextDouble());

			return velocity * time;
		} else {
			return distance;
		}
	}

	// TODO rename getT to be more specific.
	/**
	 * Get the time.
	 * 
	 * @return time
	 */
	public double getT() {
		if (time == 0) {
			System.out.print("Input Distance : ");
			setS(scan.nextDouble());
			System.out.print("Input Velocity : ");
			setV(scan.nextDouble());

			return distance / velocity;
		} else {
			return time;
		}
	}

	// TODO rename getV to be more specific.
	/**
	 * Get the Velocity.
	 * 
	 * @return velocity
	 */
	public double getV() {
		if (velocity == 0) {
			System.out.print("Input Distance : ");
			setS(scan.nextDouble());
			System.out.print("Input Time : ");
			setT(scan.nextDouble());

			return distance / time;
		} else {
			return velocity;
		}
	}
}
