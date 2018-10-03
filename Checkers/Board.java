package Checkers;

public class Board{
	private Piece[][] board = new Piece[8][8];
	
	public setPiece(Piece p, int x, int y){
		//error if x or y are > 7
		board[x][y] = p;
	}
	
	public boolean checkOccupied(int x, int y){
		return (board[x][y] != null);
	}
}