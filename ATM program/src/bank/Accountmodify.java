package bank;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Accountmodify extends JFrame {

	private JPanel contentPane;
	JTextField name1;
	JTextField Account1;
JTextField Rnum1;
	JTextField phone1;
	JTextField address;
	JTextField password;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accountmodify frame = new Accountmodify();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Accountmodify() {
		DTO dto = new DTO();
		Connection conn = null;                                       
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACE0\uAC1D \uC815\uBCF4");
		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		lblNewLabel.setBounds(188, 22, 61, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984      :");
		lblNewLabel_1.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(70, 80, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uACC4\uC88C\uBC88\uD638      :");
		label.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		label.setBounds(46, 115, 77, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC8FC\uBBFC\uBC88\uD638      :");
		label_1.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		label_1.setBounds(46, 152, 77, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638      :");
		label_2.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		label_2.setBounds(46, 186, 77, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uC8FC\uC18C      :");
		label_3.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		label_3.setBounds(70, 218, 57, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uBE44\uBC00\uBC88\uD638      :");
		label_4.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		label_4.setBounds(46, 256, 77, 15);
		contentPane.add(label_4);
		
		name1 = new JTextField();
		name1.setHorizontalAlignment(SwingConstants.LEFT);
		name1.setFont(new Font("Gulim", Font.PLAIN, 12));
		name1.setBounds(142, 77, 79, 21);
		contentPane.add(name1);
		name1.setColumns(10);
		
		



		
		JButton Accountmodify = new JButton("\uC218\uC815");
		Accountmodify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Accountmodify)
				{
					try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/movie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
							PreparedStatement pstmt = null;
							String sql = "update bank SET  name = ? , Account = ? , Rnum = ? , phone = ?, address =? ,password =? WHERE  Account  = '"+Account1.getText()+"'";
							pstmt = con.prepareStatement(sql);
							pstmt.setString(1, name1.getText());
							pstmt.setString(2, Account1.getText());
							pstmt.setString(3, Rnum1.getText());
							pstmt.setString(4, phone1.getText());
							pstmt.setString(5, address.getText());
							pstmt.setString(6, password.getText());
							
							
							
							
					        pstmt.executeUpdate();
					        
					    	JOptionPane.showMessageDialog(null, "수정 되었습니다.");
					    	dispose();
							} catch (Exception e1) {

							// TODO Auto-generated catch block

							e1.printStackTrace();
					}
					
				}
				}
			});
		Accountmodify.setForeground(Color.WHITE);
		Accountmodify.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		Accountmodify.setBackground(new Color(0, 191, 255));
		Accountmodify.setBounds(98, 300, 99, 38);
		contentPane.add(Accountmodify);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		button.setBounds(262, 299, 99, 38);
		button.setBackground(new Color(0, 191, 255));
		contentPane.add(button);
		
		Account1 = new JTextField();
		Account1.setEnabled(false);
		Account1.setHorizontalAlignment(SwingConstants.LEFT);
		Account1.setFont(new Font("����", Font.PLAIN, 12));
		Account1.setColumns(10);
		Account1.setBounds(142, 113, 219, 21);
		contentPane.add(Account1);
		
		Rnum1 = new JTextField();
		Rnum1.setHorizontalAlignment(SwingConstants.LEFT);
		Rnum1.setFont(new Font("����", Font.PLAIN, 12));
		Rnum1.setColumns(10);
		Rnum1.setBounds(142, 150, 219, 21);
		contentPane.add(Rnum1);
		
		phone1 = new JTextField();
		phone1.setHorizontalAlignment(SwingConstants.LEFT);
		phone1.setFont(new Font("����", Font.PLAIN, 12));
		phone1.setColumns(10);
		phone1.setBounds(142, 186, 219, 21);
		contentPane.add(phone1);
		
		address = new JTextField();
		address.setHorizontalAlignment(SwingConstants.LEFT);
		address.setFont(new Font("����", Font.PLAIN, 12));
		address.setColumns(10);
		address.setBounds(142, 218, 219, 21);
		contentPane.add(address);
		
		password = new JTextField();
		password.setFont(new Font("����", Font.PLAIN, 12));
		password.setColumns(10);
		password.setBounds(142, 252, 79, 21);
		password.setDocument((new JTextFieldLimit(4)));
		contentPane.add(password);
	}
}
