/**
 * Model-View-Controller Group Project
 * Will, Michael, Tristan, David, Austin
 * October 11th, 2019
 * Last Updated: October 22nd, 2019
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class View extends JFrame{

	private JLabel title;
	private JPanel panel;
	private JFrame frame;
	private Model model;
	private ArrayList<JLabel> list;
	private Font font = new Font("TimesRoman",Font.BOLD,75);

	/**
	 * View Constructor
	 * @param model
	 */
	public View(Model model) {
		this.model = model;
		list = new ArrayList<JLabel>();

		frame = new JFrame("Tic Tac Toe");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(3,3,0,0));

		  for(int i = 0; i < 9; i++){
			  	JLabel label = new JLabel();
		     	label.setText("");
		     	label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2,Color.BLACK));
		     	frame.add(label);
		     	list.add(label);
		    }

		frame.pack();
		frame.setSize(400,400);
		frame.setVisible(true);

		//TODO : Make pop-up for the game over scenario showing who won.
	}

	/**
	 * Updates the labels in the grid based on the int array in the model
	 */
	public void updateView() {
        for (int i = 0; i < 9; i++) {
            if(model.getBoard()[i] == 1) {
                list.get(i).setText("O");
                list.get(i).setFont(font);
                list.get(i).setHorizontalAlignment(JLabel.CENTER);
            }else if( model.getBoard()[i] == -1) {
                list.get(i).setText("X");
                list.get(i).setFont(font);
                list.get(i).setHorizontalAlignment(JLabel.CENTER);
            }else {
                list.get(i).setText("");
            }
        }
    }

	/**
	 * Registers the controller as the listener so click data is handled by the controller.
	 * @param listener
	 */
	public void registerListener(Controller listener) {
		frame.addMouseListener(listener);
	}

}
