import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * The controller handles all input.
 * In this case, it takes the coordinates from a mouse click,
 * decides which square was clicked and sends this to the model. 
 *
 */
public class Controller implements MouseListener{
	
	private Model model;
	private View view;
	
	public Controller(Model model,  View view) {
		this.model = model;
		this.view = view;
	}
	
	//Tells the model what move was picked.
	public void pickMove() {
		// TODO : Decide which square was selected based on the coordinates, check if valid, then send to the model.
	}
	
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getPoint());
		pickMove();
		view.updateView();
	}
	
	//Unused required methods for the MouseListener interface
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	
	

}
