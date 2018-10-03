import Checkers.*;
import java.util.Scanner;

public class Play{
	public static void main(String[] args){
			// Get out our board and pieces
			Board board = new Board();
			Piece r1 = new Piece();
			Piece b1 = new Piece();
			
			// Setup board and pieces
			r1.set(Piece.Color.RED);
			b1.set(Piece.Color.BLACK);
			board.setPiece(b1,0,0);
			board.setPiece(r1,7,7);
			
			// Check some stuff on the board
			System.out.println("Location 2, 2 is occupied: " + board.checkOccupied (2,2));
			System.out.println("Location 7, 7 is occupied: " + board.checkOccupied (7,7));
			
	}
}