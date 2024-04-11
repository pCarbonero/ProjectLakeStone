package programmclasses;

public class Stone {
	// tamaño tablero
	final int SIZE = 8;
	// array para el lago
	int[][] lago = new int[SIZE][SIZE];
	// posición en X
	int posX = 0;
	// posición en Y
	int posY = 0;
	// intensidad
	int intensity;

	/**
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
				if (isValidCell(newY, newX, lago.length)) {
					lago[newY][newX] = Math.max(intensity - i, lago[newY][newX]);
				}
				
				//adds i to the Y axis 
				newY = posY + i;
				
				//if the cell is valid the wave is added diagonally to the board
				if (isValidCell(newY, newX, lago.length)) {
					lago[newY][newX] = Math.max(intensity - i, lago[newY][newX]);
				}
				
				//adds j to the Y axis
				newY = posY + j;
				//adds i to the X axis
				newX = posX - i;
				
				//if the cell is valid the wave is added horizontally to the board
				if (isValidCell(newY, newX, lago.length)) {
					lago[newY][newX] = Math.max(intensity - i, lago[newY][newX]);
				}
				
				//adds i to the x axis
				newX = posX + i;
				
				//if the cell is valid the wave is added to the other diagonal to the board
				if (isValidCell(newY, newX, lago.length)) {
					lago[newY][newX] = Math.max(intensity - i, lago[newY][newX]);
				}
			}
		}
		//it changes the value of the intensity where the stone was thrown
		lago[posY][posX] = intensity;
		
	}// method

	
	private static boolean isValidCell(int y, int x, int dimension) {
		return y >= 0 && y < dimension && x >= 0 && x < dimension;
	}

}
