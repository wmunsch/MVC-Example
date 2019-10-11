import javax.swing.JFrame;

public class MainMVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model,view);
		
		//view.registerListener(controller);
		
		//view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//view.setSize(400,300);
		//view.setVisible(true);

	}

}
