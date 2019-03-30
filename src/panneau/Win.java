package panneau;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Win extends JFrame{

	public Win() {
		// TODO Auto-generated constructor stub
		super("Panneau de signalisation");
		this.setSize(500,400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel panel=(JPanel)this.getContentPane();
		
		
		
		
		this.setVisible(true);
	}

}
