/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here

		// Receiving numbers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		// Choose three random number between the received numbers (a,b) not included b
		int num1 = (int) ((Math.random() * (b - a) + a));
		int num2 = (int) ((Math.random() * (b - a) + a));
		int num3 = (int) ((Math.random() * (b - a) + a));

		// Print the 3 chosen numbers
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		// Determines that the min number is num1
		int min = num1;

		// Check if min is bigger then num2
		if (min > num2) {
			min = num2;
		}

		// Check if min is bigger then num3
		if (min > num3) {
			min = num3;
		}

		// Print the minimal number
		System.out.println("The minimal generated number was " + min);

	}
}
