import java.awt.Point;

// TODO : Javadoc 
public class Model {
	//The game board which stores x's and o's
	private int [] board; 
	private int current_player = 1; // 1 is 0s, -1 is Xs
	
	public Model() {
		board = new int[9];
	}
	
	public int[] getBoard() {
		return board;
	}

	public int getPlayer() {
		return current_player;
	}
	
	private void resetBoard() {
		for (int i : board) {
			board[i] = 0;
		}
	}
	
	public void setSpace(int space) {
		board[space] = current_player;
		//Check for game over
		
		changePlayer();
	}
	
	private void changePlayer() {
		this.current_player = current_player * -1;
	}
}
