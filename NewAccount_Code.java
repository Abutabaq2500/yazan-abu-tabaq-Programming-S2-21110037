package Final_Assignment;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class NewAccount_Code{
	
	public static void main(String[] args) {
		
		new CreateNewAccount();
		
	}
}
class CreateNewAccount extends JFrame{

	
		static JButton b5 = new JButton("Login");
		static JButton b6 = new JButton("Cancel");
		static JFrame frame2 = new JFrame("Create new account");
		static Font font = new Font("Arial", Font.BOLD, 28);
		static Font font2 = new Font("Arial", Font.BOLD, 15);
		static Font font3 = new Font("Arial", Font.BOLD, 15);
		static JLabel output1 = new JLabel();
		static JLabel output2 = new JLabel();
		static JLabel output3 = new JLabel();
		static JTextField userfield = new JTextField(30);
		static JLabel word = new JLabel();
		static JPasswordField psrdfield = new JPasswordField(30);
		static JLabel psrd = new JLabel();
		static String new_username = "";
		static String new_password = "";
		
		public CreateNewAccount() {
			
			frame2.setSize(700,600);
			frame2.setLocationRelativeTo(null);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			b5.setFont(font2);
			b5.setBounds(200, 350, 150, 89);
			b6.setFont(font2);
			b6.setBounds(350, 350, 150, 89);
			output1.setText("Create you username and your password.");
			output2.setText("username:");
			output3.setText("password:");
			output1.setFont(font);
			output2.setFont(font3);
			output3.setFont(font3);
			frame2.add(output1, BorderLayout.CENTER);
			output1.setBounds(59, -100, 800, 400);
			output2.setBounds(145, 20, 800, 400);
			output3.setBounds(145, 60, 800, 400);
			
			
			userfield.setBounds(320, 205, 200, 30);
			psrdfield.setBounds(320, 245, 200, 30);
		
			frame2.add(output1);
			frame2.add(output2);
			frame2.add(output3);
			frame2.add(b5);
			frame2.add(b6);
			frame2.add(word);
			frame2.add(userfield);
			frame2.add(psrd);
			frame2.add(psrdfield);
		
			frame2.setLayout(null);
			frame2.setVisible(true);
			
			b5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e)
				{
					new_username = userfield.getText();
					new_password = new String(psrdfield.getPassword());
					
					JOptionPane.showMessageDialog(null, "Your account has been created!");
					new App();
					frame2.dispose();

				}
			});
			
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						
					new App();
					frame2.dispose();
					
					
				}
			});
		
		}
	
	}