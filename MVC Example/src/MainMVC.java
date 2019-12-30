/**
 * Model-View-Controller Group Project
 * Will, Michael, Tristan, David, Austin
 * October 11th, 2019
 * Last Updated: October 22nd, 2019
 */




// TODO : Javadoc
public class MainMVC {

	/**
	 * Runs the main program.
	 * @param args
	 */
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);

		view.registerListener(controller);

	}

}
