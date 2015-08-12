import javax.swing.*;
import java.awt.*;

public class Mframe extends JFrame {

	public Mframe() {

		super("Math");
		setLookAndFeel();
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
			);
		} catch (Exception exc) {
		
		}
	}

}
