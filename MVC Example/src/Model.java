/**
 * Model-View-Controller Group Project
 * Will, Michael, Tristan, David, Austin
 * October 11th, 2019
 * Last Updated: October 22nd, 2019
 */

import java.awt.Point;


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
	private void resetBoard() {
		for (int i : board) {
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
}
