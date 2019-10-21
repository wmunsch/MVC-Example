import java.awt.Point;

// TODO : Javadoc 
public class Model {
	//The game board which stores x's and o's
	private int[] board; 
	private int current_player = 1; // 1 is 0s, -1 is Xs
	
	public Model() {
		board = new int[9];
	}
	
	public int[] getBoard() {
		return board;
	}
	
	private void resetBoard() {
		for (int i : board) {
			board[i] = 0;
		}
	}
	
	public void validMove(int space) {
		if (board[space] == 0) {
			setSpace(space);
		} //Should we print an error message, or just not touch the board if the space is taken already?
	}
	
	private void setSpace(int space) {
		board[space] = current_player;
		//Check for game over
		
		
		changePlayer();
	}
	
	private void changePlayer() {
		this.current_player = current_player * -1;
	}
}
