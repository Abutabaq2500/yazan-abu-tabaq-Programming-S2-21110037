package Final_Assignment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import java.awt.ActiveEvent;

public class GetIntoYourAccount_Code {

	public static void main(String[] args) {

		new Signin();

	}

}

class Signin extends JFrame{
	
	static JButton b1 = new JButton("Login");
	static JButton b2 = new JButton("Cancel");
	static JFrame frame3 = new JFrame("Sign in");
	static Font font = new Font("Arial", Font.BOLD, 28);
	static Font font2 = new Font("Arial", Font.BOLD, 15);
	static Font font3 = new Font("Arial", Font.BOLD, 15);
	static JLabel output1 = new JLabel("username");
	static JLabel output2 = new JLabel("password");
	static JLabel output3 = new JLabel("password");
	static JTextField userfield = new JTextField(30);
	static JLabel word = new JLabel();
	static JPasswordField psrdfield = new JPasswordField(30);
	static JLabel psrd = new JLabel();
	static String username = "";
	static String password = "";
	
	public Signin() {
		
		
		
		frame3.setSize(700,600);
		frame3.setLocationRelativeTo(null);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.setFont(font2);
		b1.setBounds(200, 350, 150, 89);
		b2.setFont(font2);
		b2.setBounds(350, 350, 150, 89);
		output1.setText("Enter your username and your password.");
		output2.setText("username:");
		output3.setText("password:");
		
		output1.setFont(font);
		output2.setFont(font3);
		output3.setFont(font3);

		frame3.add(output1, BorderLayout.CENTER);
		output1.setBounds(59, -100, 800, 400);
		output2.setBounds(145, 20, 800, 400);
		output3.setBounds(145, 60, 800, 400);
		
		userfield.setBounds(320, 205, 200, 30);
		psrdfield.setBounds(320, 245, 200, 30);
	
		frame3.add(output1);
		frame3.add(output2);
		frame3.add(output3);
		frame3.add(b1);
		frame3.add(b2);
		frame3.add(word);
		frame3.add(userfield);
		frame3.add(psrd);
		frame3.add(psrdfield);
		frame3.setLayout(null);
		frame3.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				username = userfield.getText();
				password = new String(psrdfield.getPassword());
				if(username.equalsIgnoreCase(CreateNewAccount.new_username) && password.equals(CreateNewAccount.new_password))
				{
					
					JOptionPane.showMessageDialog(null, "logged in!");
					new Loggedin();
					frame3.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "incorrect!");
				}
			
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
					
				new App();
				frame3.dispose();
				
			}
		});
	
	}

}