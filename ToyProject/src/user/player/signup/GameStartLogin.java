package user.player.signup;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStartLogin extends JFrame {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(800, 500);
	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		Image icon = new ImageIcon("images/gamestart.png").getImage().getScaledInstance(800, 500, 0);
		JLabel label = new JLabel(new ImageIcon(icon));
		label.setSize(800,500);
		label.setLocation(0, 0);
		
		JButton btn1 = new JButton("GameStart");
		btn1.setBounds(360, 290, 120, 120 );
		
		panel.add(btn1);
		panel.add(label);
	
		mf.add(panel);
	    
	    
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		

	}

}
