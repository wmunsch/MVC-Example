/**
 * Model-View-Controller Group Project
 * Will, Michael, Tristan, David, Austin
 * October 11th, 2019
 * Last Updated: October 22nd, 2019
 */



public class Model {

	//The game board which stores x's and o's
	private int [] board;
	private int current_player = 1; // 1 is 0s, -1 is Xs

	/**
	 * Model Constructor
	 */
	public Model() {
		board = new int[9];
	}

	/**
	 * Gets the board array
	 * @return the board
	 */
	public int[] getBoard() {
		return board;
	}

	/**
	 * Gets the player value
	 * @return the current player
	 */
	public int getPlayer() {
		return current_player;
	}

	/**
	 * Resets the board
	 */
	public void resetBoard() {
		for (int i =0; i < 9;i++) {
			board[i] = 0;
		}
	}

	/**
	 * Sets the board space to the current player's value
	 * @param space
	 */
	public void setSpace(int space) {
		board[space] = current_player;
		//Check for game over

		changePlayer();
	}

	/**
	 * Changes the current player value
	 */
	private void changePlayer() {
		this.current_player = current_player * -1;
	}
	/**
	 * Checks to see if either player has made a winning more in their last turn
	 * Or if the whole board has been filled and the game is a tie
	 */
	public int checkIfGameOver() {
		if (board[0] == 1 && board[3] ==1 && board[6] ==1) return 1;
		else if (board[0] == -1 && board[3] ==-1 && board[6] ==-1) return -1;
		
		else if (board[0]==1 && board[1]==1 && board[2] ==1) return 1;
		else if (board[0]==-1 && board[1]==-1 && board[2] ==-1) return -1;
		
		else if (board[0]==1 && board[4]==1 && board[8] ==1) return 1;
		else if (board[0]==-1 && board[4]==-1 && board[8] ==-1) return -1;
		
		else if (board[6]==1 && board[7]==1 && board[8] ==1) return 1;
		else if (board[6]==-1 && board[7]==-1 && board[8] ==-1) return -1;
		
		else if (board[2]==1 && board[5]==1 && board[8] ==1) return 1;
		else if (board[2]==-1 && board[5]==-1 && board[8] ==-1) return -1;
		
		else if (board[1]==1 && board[4]==1 && board[7] ==1) return 1;
		else if (board[1]==-1 && board[4]==-1 && board[7] ==-1) return -1;
		
		else if (board[3]==1 && board[4]==1 && board[5] ==1) return 1;
		else if (board[3]==-1 && board[4]==-1 && board[5] ==-1) return -1;
		
		else if (board[2]==1 && board[4]==1 && board[6] ==1) return 1;
		else if (board[2]==-1 && board[4]==-1 && board[6] ==-1) return -1;
		
		boolean full = true;
		for (int i = 0; i < 9 ; i ++) {
			if (board[i] == 0) full=false;
		}
		if (full)return 3;
		
		return 0;
	}
}
