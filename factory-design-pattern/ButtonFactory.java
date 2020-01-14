import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonFactory {
	
	public ButtonFactory() {
		
	}
	
	public JButton createButton(String label, ActionListener action) {
		JButton button = new JButton(label);
		button.addActionListener(action);

		return button;
	}
	
	public JButton createButton(int x, int y) {
		JButton button = new JButton();
		button.setLocation(x, y);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//action done when button is pressed. 
			}
		});
		return button;
	
	}
	

}
