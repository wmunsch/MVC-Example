import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame{

	private Model model;
	
	public View(Model model) {
		this.model = model;
		JButton button = new JButton("Press me");
		JPanel panel = new JPanel();
		
		panel.add(button);
		getContentPane().add(BorderLayout.SOUTH, panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		
		setTitle("MVC Example");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button was pressed");
			}
		});
	}
	
	
}
