package Checkers;

public class Piece{
		// Class Attributes (GLOBAL)
		//public static enum Color {RED, BLACK};
		private static int numberOPieces = 0;
		
		// Instance Atrributes
		private Color color;
		private int id;
		
		
		public Piece(){
			id=numberOPieces;
			numberOPieces++;
		}
		
		public void set(Color c){
			color = c;
		}
		
		public Color getColor(){
			return color;
		}
		
		
		// public int pieceCount(){
			// return numberOPieces;
		// }
}