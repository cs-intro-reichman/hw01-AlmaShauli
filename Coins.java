/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here

		// Receiving a number
		int quan = Integer.parseInt(args[0]);

		// The max quarters that can be get from the received number
		int quar = quan / 25;

		// The remainder in cents from the received number
		int cents = quan % 25;

		// Print how to represent the received number
		System.out.println("Use " + quar + " quarters and " + cents + " cents");

	}
}