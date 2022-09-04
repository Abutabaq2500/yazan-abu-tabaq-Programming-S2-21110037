package Final_Assignment;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeToApp_Code {
	
	public static void main(String[] args)
	{
		App obj = new App();
	}
}

class App extends JFrame{
	
	
	static JButton b1 = new JButton("Create new account");
	static JButton b2 = new JButton("Sign in");
	static JButton b3 = new JButton("Exit");
	static JFrame frame = new JFrame("App");
	static Font font = new Font("Arial", Font.BOLD, 30);
	static Font font2 = new Font("Arial", Font.BOLD, 15);
	static JLabel output1 = new JLabel();
	static JLabel output2 = new JLabel();
	
	
	public App()
	{
		
		frame.setSize(700,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.setFont(font2);
		b1.setBounds(200, 400, 300, 89);
		b2.setFont(font2);
		b2.setBounds(200, 300, 150, 89);
		b3.setFont(font2);
		b3.setBounds(350, 300, 150, 89);
		output1.setText("Welcome to the App!");
		output2.setText("Press any button to continue.");
		
		output1.setFont(font);
		output2.setFont(font);
		
		output1.setBounds(199, -100, 800, 400);
		output2.setBounds(145, -30, 800, 400);
		
		frame.add(output1);
		frame.add(output2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				new CreateNewAccount();
				frame.dispose();
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				
				new Signin();
				frame.dispose();
				
			}
		});
		
		b3.addActionListener((event) -> System.exit(0));
		
	}
	
}
