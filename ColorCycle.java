import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorCycle extends JFrame implements ActionListener {
	JButton Button;
	
	// Constructor for ColorCycle
	public ColorCycle(String title) {
		super(title);
		
		// Creo el bot� i li poso un text
		Button = new JButton("Click me");
		Button.addActionListener(this);
		
		// Afegeixo el bot� al layout
		setLayout(new FlowLayout());
		add(Button);
	}
	
	// Metode
	public void actionPerformed(ActionEvent ev) {	
		// Variable que equival a: getContentPane().getBackground()
		Color getColor = getContentPane().getBackground();
		
		// Miro quin color toca quan l'usuari cliqui al bot�
		if (getColor.equals(Color.red)) {
			getContentPane().setBackground(Color.green);
		} else if (getColor.equals(Color.green)) {
			getContentPane().setBackground(Color.blue);
		} else if (getColor.equals(Color.blue)) {
			getContentPane().setBackground(Color.gray);
		} else if (getColor.equals(Color.gray)) {
			getContentPane().setBackground(Color.red);
		} else {
			getContentPane().setBackground(Color.red);
		} repaint();
	}

	
	// Main
	public static void main(String[] args) {
		ColorCycle demo = new ColorCycle("Click a Button");
		demo.setSize(500, 200);
		demo.setVisible(true);
	}
}
