package newproj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class login {

	private JFrame frame;
	private JTextField p1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 261);
		frame.getContentPane().add(scrollPane);
		
		JLabel tb1 = new JLabel("NAME");
		tb1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tb1.setBounds(107, 92, 46, 14);
		frame.getContentPane().add(tb1);
		
		JLabel p2 = new JLabel("PASSWORD");
		p2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		p2.setBounds(107, 131, 95, 14);
		frame.getContentPane().add(p2);
		
		p1 = new JTextField();
		p1.setBounds(230, 131, 86, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb2.getText();
				String password=p1.getText();
				if(name.equals("krishna") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Welcome krishna");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid user");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(169, 186, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(169, 42, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb2 = new JTextField();
		tb2.setBounds(230, 90, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
	}
}
