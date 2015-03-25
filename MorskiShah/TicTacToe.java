package MorskiShah;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel item1;
	JPanel p = new JPanel();
	XOButton[] buttons = new XOButton[9];

	public static void main(String[] args) {
		
		new TicTacToe();
	}
	public TicTacToe(){
		super("Sea Shah");
		setSize(300, 300);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(3, 3));
		
		for (int i = 0; i < 9; i++) {
			buttons[i] = new XOButton();
			p.add(buttons[i]);
		}
		add(p);
		
		setVisible(true);
		if (buttons[0] == buttons[1] && buttons[0] == buttons[2]) {
			setLayout(new FlowLayout());
			item1 = new JLabel("Congatulations You won");
			add(item1);
			return;
		}
		
	}

}
