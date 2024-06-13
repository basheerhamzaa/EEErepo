package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class newogin {

	private JFrame frame;
	private JTextField tb2;
	private JPasswordField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newogin window = new newogin();
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
	public newogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(219, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(106, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb2 = new JTextField();
		tb2.setBounds(254, 79, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(106, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb3 = new JPasswordField();
		tb3.setBounds(254, 155, 86, 20);
		frame.getContentPane().add(tb3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb2.getText();
				String pwd=tb3.getText();
				try {
					java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
			         PreparedStatement stn=con.prepareStatement
			    		("select name,pwd from users where name=? and pwd=?");
			    stn.setString(1, name);
			    stn.setString(2, pwd);
			    ResultSet rs=stn.executeQuery();
			    if(rs.next())
			    {
			    	JOptionPane.showMessageDialog(btnNewButton, "valid user");
			    }
			    else
			    {
			    	JOptionPane.showMessageDialog(btnNewButton, "invaliduser");
			    }
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(251, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
