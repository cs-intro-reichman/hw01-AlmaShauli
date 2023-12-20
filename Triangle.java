/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
	public static void main(String[] args) {
		// Put your code here
		int edgeOne = Integer.parseInt(args[0]);
		int edgeTwo = Integer.parseInt(args[1]);
		int edgeThree = Integer.parseInt(args[2]);
		boolean triangle;

		if (((edgeOne + edgeTwo) < edgeThree) || ((edgeOne + edgeTwo) == edgeThree)) {
			triangle = false;
		} else if (((edgeOne + edgeThree) < edgeTwo) || ((edgeOne + edgeThree) == edgeTwo)) {
			triangle = false;
		} else if (((edgeThree + edgeTwo) < edgeOne) || ((edgeThree + edgeTwo) == edgeOne)) {
			triangle = false;
		} else {
			triangle = true;
		}

		System.out.println(edgeOne + ", " + edgeTwo + ", " + edgeThree + ": " + triangle);

	}
}
