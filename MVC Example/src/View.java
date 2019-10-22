import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


//TODO : Javadoc 
public class View extends JFrame{

	private JLabel title;
	private JPanel panel;
	private JFrame frame;
	private Model model;
	private ArrayList<JLabel> list; 
	
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
	
	//Updates the labels in the grid based on the int array in the model
	public void updateView() {
        for (int i = 0; i < 9; i++) {
            if(model.getBoard()[i] == 1) {
                list.get(i).setText("O");
            }else if( model.getBoard()[i] == -1) {
                list.get(i).setText("X");
            }else {
                list.get(i).setText("");
            }
        }
    }
	
	//Registers the controller as the listener so click data is handled by the controller.
	public void registerListener(Controller listener) {
		frame.addMouseListener(listener);
	}

	
	
	
}
