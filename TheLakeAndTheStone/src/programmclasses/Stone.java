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
		int intensidad;

		/**
		 * constructor with attributes of the class 
		 * @param posX
		 * @param posY
		 * @param intensity
		 */
		public Stone(int posX, int posY, int intensity) {
			this.posX = posX;
			this.posY = posY;
			this.intensidad = intensity;
		}

		/**
		 * Constructor without parameters
		 */
		public Stone() {

		}
}
