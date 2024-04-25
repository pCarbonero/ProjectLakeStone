package programmclasses;

/**
 * Class that contains all the properties 
 */
public class Stone {
	
	/**
	 * Tab size
	 */
	final int SIZE = 8;
	/**
	 *  Array that makes the board 
	 */
	int[][] lake = new int[SIZE][SIZE];
	/**
	 *  x pos
	 */
	int posX = 0;
	/**
	 *  y pos
	 */
	int posY = 0;
	/**
	 * Intensity
	 */
	int intensity;

	/**
	 * Method that paint the lake with the waves 
	 */
	public void paintLake() {
		for (int i = 0; i < lake.length; i++) {
			for (int j = 0; j < lake[i].length; j++) {
				System.out.print(lake[i][j] + " ");
			}
			System.out.println();
		}
	}
	
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
	/*
	 * constructor with attributes of the class
	 * 
	 * @param posX
	 * @param posY
	 * @param intensity
	 */
	public Stone(int posX, int posY, int intensity) {
		this.posX = posX;
		this.posY = posY;
		this.intensity = intensity;
	}

	/**
	 * Constructor without parameters
	 */
	public Stone() {

	}

	/**
	 *Method that assigns the waves to the board
	 */
	public void lakeWaves() {
		
		for (int i = 1; i <= intensity; i++) {
			
			for (int j = -i; j <= i; j++) {
				//These are the initial position where the stone is thrown
				int newY = posY - i;
				int newX = posX + j;
				//if the cell is valid the wave is added vertically to the board 
				if (isValidCell(newY, newX, lake.length)) {
					lake[newY][newX] = Math.max(intensity - i, lake[newY][newX]);
				}
				
				//adds i to the Y axis 
				newY = posY + i;
				
				//if the cell is valid the wave is added diagonally to the board
				if (isValidCell(newY, newX, lake.length)) {
					lake[newY][newX] = Math.max(intensity - i, lake[newY][newX]);
				}
				
				//adds j to the Y axis
				newY = posY + j;
				//adds i to the X axis
				newX = posX - i;
				
				//if the cell is valid the wave is added horizontally to the board
				if (isValidCell(newY, newX, lake.length)) {
					lake[newY][newX] = Math.max(intensity - i, lake[newY][newX]);
				}
				
				//adds i to the x axis
				newX = posX + i;
				
				//if the cell is valid the wave is added to the other diagonal to the board
				if (isValidCell(newY, newX, lake.length)) {
					lake[newY][newX] = Math.max(intensity - i, lake[newY][newX]);
				}
			}
		}
		//it changes the value of the intensity where the stone was thrown
		lake[posY][posX] = intensity;
		
	}// method
}

