package Checkers;

public class Piece{
		// Class Attributes (GLOBAL)
		enum COLOR {RED, BLACK};
		private static int numberOPieces = 0;
		
		// Instance Atrributes
		private COLOR color;
		private int id;
		
		
		public Piece(){
			id=numberOPieces;
			numberOPieces++;
		}
		
		public void set (Color c){
			color = c;
		}
		
		// public int pieceCount(){
			// return numberOPieces;
		// }
}