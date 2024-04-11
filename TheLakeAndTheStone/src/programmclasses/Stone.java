package programmclasses;

public class Stone {

	/**
	 * Method that check if player throws the stone into a valid range
	 * 
	 * @param x         x stone's position in the table
	 * @param y         y stone's position in the table
	 * @param dimensions Max dimension of axes
	 * @return Returns if the stone can be thrown or not
	 */
	private static boolean isValidCell(int x, int y, int dimensions) {
		// Variable that registers the throw
		boolean enter = false;
		// Check if the stone has been thrown in the axes dimensions
		if (x >= 0 && x < dimensions && y >= 0 && y < dimensions) {
			// Changes the variable to true
			enter = true;
		}
		// Returns the result of thrown
		return enter;

	}
}
