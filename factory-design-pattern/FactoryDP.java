import javax.swing.JButton;

public class FactoryDP {

	public static void main(String[] args) {
		ButtonFactory factory = new ButtonFactory();
		
		JButton a = factory.createButton("button_label");
		JButton b = factory.createButton(12,34);

	}

}
