import javax.swing.JFrame;


// TODO : Javadoc 
public class MainMVC {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		
		view.registerListener(controller);
		
	}

}
