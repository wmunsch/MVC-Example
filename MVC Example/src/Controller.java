import java.awt.Point;
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
	public void pickMove(Point p) {

		int index = -1;
	
		//If statements check which space was clicked

		//Top left - left_x = 0, right_x = 135, top_y = 0, bottom_y = 150 
		if (isBetween(p.x, 0, 135) && isBetween(p.y, 0, 150)){
			index = 0;
		}//Top middle - left_x = 136, right_x = 265, top_y = 0, bottom_y = 150
		else if (isBetween(p.x, 136, 265) && isBetween(p.y, 0, 150)){
			index = 1;
		}//Top right - left_x = 266, right_x = 400, top_y = 0, bottom_y = 150
		else if (isBetween(p.x, 266, 400) && isBetween(p.y, 0, 150)) {
			index = 2;
		}//Middle left - left_x = 0, right_x = 135, top_y = 151, bottom_y = 270
		else if (isBetween(p.x, 0, 135) && isBetween(p.y, 151, 270)){
			index = 3;
		}//Middle middle - left_x = 136, right_x = 265, top_y = 151, bottom_y = 270 
		else if (isBetween(p.x, 136, 265) && isBetween(p.y, 151, 270)){
			index = 4;
		}//Middle right - left_x = 266, right_x = 400, top_y = 151, bottom_y = 270
		else if (isBetween(p.x, 266, 400) && isBetween(p.y, 151, 270)) {
			index= 5;
		}//Bottom left - left_x = 0, right_x = 135, top_y = 271, bottom_y = 400
		else if (isBetween(p.x, 0, 135) && isBetween(p.y, 271, 400)) {
			index = 6;
		}//Bottom middle - left_x = 136, right_x = 265, top_y = 271, bottom_y = 400
		else if (isBetween(p.x, 136, 265) && isBetween(p.y, 271, 400)) {
			index = 7;
		}//Bottom right - left_x = 266, right_x = 400, top_y = 271, bottom_y = 400
		else if (isBetween(p.x, 266, 400) && isBetween(p.y, 271, 400)) {
			index = 8;
		}

		//If space is empty, set space based on player
		if (model.getBoard()[index] == 0) {
			model.setSpace(index);
		}
	}
	
	//Helper method checks if target is between two numbers
	private static boolean isBetween(int target, int min, int max){
		return (target >= min) && (target <= max);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Point p = e.getPoint();
		//System.out.println(p);
		pickMove(p);
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
