import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChargeCalculator extends JFrame{
	private Ship ship;
	private JPanel panel = new JPanel();
	private JButton button = new JButton("Calculate Change");
	private JTextField text = new JTextField("Total charge for all containers");
	
	public ChargeCalculator(Ship aShip) {
		ship = aShip;
		this.setContentPane(panel);
		panel.add(button);
		panel.add(text);
		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		text.setEditable(false);
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setTitle("Calclulate charge");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int totalCharge = ship.calculateTotalCharge();
			text.setText(Integer.toString(ship.calculateTotalCharge()));
			System.out.println(ship.calculateTotalCharge());
			
		}
		
		
		
	}
	
}