package test;

import org.combinedEvent.cas5.DecathlonEvents;

public class Cas5 {

	DecathlonEvents deca;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (DecathlonEvents d : DecathlonEvents.values()) {
			System.out.println(d);
		}

	}

}
