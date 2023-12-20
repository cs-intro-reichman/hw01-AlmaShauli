/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
	public static void main(String[] args) {
		// Put your code here

		// Receiving numbers
		int edgeOne = Integer.parseInt(args[0]);
		int edgeTwo = Integer.parseInt(args[1]);
		int edgeThree = Integer.parseInt(args[2]);

		// Determines the value of triangle
		boolean triangle = true;

		// Check if side 1 + side 2 smaller then side 3
		if (((edgeOne + edgeTwo) < edgeThree) || ((edgeOne + edgeTwo) == edgeThree)) {
			triangle = false;
		} else

		// Check if side 1 + side 3 smaller then side 2
		if (((edgeOne + edgeThree) < edgeTwo) || ((edgeOne + edgeThree) == edgeTwo)) {
			triangle = false;
		} else

		// Check if side 2 + side 3 smaller then side 1
		if (((edgeThree + edgeTwo) < edgeOne) || ((edgeThree + edgeTwo) == edgeOne)) {
			triangle = false;
		}

		// Print each sides and if it form triangle
		System.out.println(edgeOne + ", " + edgeTwo + ", " + edgeThree + ": " + triangle);

	}
}
