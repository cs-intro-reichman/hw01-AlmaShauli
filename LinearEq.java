/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	// Put your code here
	public static void main(String[] args) {

		// Receiving numbers
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);

		// Print the linear equation
		System.out.println(a + " * " + "x" + " + " + b + " = " + c);

		// Calculate the solution to the equation
		double x = (c - b) / a;

		// Print the solution
		System.out.println("X = " + x);

	}
}