package bank;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class modifylogin extends JFrame {
	private JTextField Account1;
	private JTextField password;
	private JTextField Account2;
	private JTextField Account3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modifylogin frame = new modifylogin();
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
	public modifylogin() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 333);
		DTO dto = new DTO();
	
	
		JLabel lblNewLabel = new JLabel("\uACC4\uC88C\uBC88\uD638\uC640 \uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		lblNewLabel.setBounds(136, 53, 211, 15);
		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638 : ");
		lblNewLabel_1.setBounds(73, 105, 61, 15);
		lblNewLabel_1.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638 : ");
		label.setBounds(74, 134, 65, 24);
		label.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		
		Account1 = new JTextField();
		Account1.setBounds(146, 102, 76, 21);
		Account1.setColumns(10);
		
		Account1.setDocument((new JTextFieldLimit(6)));
		
		password = new JPasswordField();
		password.setBounds(146, 136, 83, 21);
		password.setColumns(10);
		password.setDocument((new JTextFieldLimit(4)));
		JLabel lblNewLabel_2 = new JLabel("( \uB124\uC790\uB9AC \uC22B\uC790 \uC785\uB825 )");
		lblNewLabel_2.setBounds(240, 140, 112, 15);
		lblNewLabel_2.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(114, 236, 106, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/movie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
						Statement stmt = con.createStatement();
						String Accountall  = Account1.getText() + Account2.getText() + Account3.getText(); 
						String sql = "Select * from bank_account where Account ='"+Accountall+"' and password = '"+password.getText()+"' ";
						ResultSet rs  = stmt.executeQuery(sql);
						if(rs.next()){
							PreparedStatement pstmt =null;
							ResultSet rs2 = null;
							String sql2 = "select * from bank";
							pstmt = con.prepareStatement(sql2);
							rs2 = pstmt.executeQuery();
							Accountmodify Am = new Accountmodify();
							Am.setVisible(true);
							
							while(rs2.next())
							{
								String name = rs2.getString("name");
								String Account = rs2.getString(2);
								String Rnum = rs2.getString(3);
								String phone = rs2.getString(4);
								String address =rs2.getString(5);
								String password = rs2.getString(6);
								
								
								Am.name1.setText(name);
								Am.Account1.setText(Account);
								Am.Rnum1.setText(Rnum);
								Am.phone1.setText(phone);
								Am.address.setText(address);
								Am.password.setText(password);
								
								
							}
							
						
							
						}else{
							JOptionPane.showMessageDialog(null, "계좌 , 패스워드를 확인해주세요.");
						con.close();
						}
				}catch(Exception e){System.out.print(e);}
		
				
			}
		});
		btnNewButton.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		
		JButton Cancel = new JButton("\uCDE8\uC18C");
		Cancel.setBounds(270, 236, 106, 35);
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Cancel)
				{
					dispose();
				}
			}
		});
		Cancel.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		Cancel.setForeground(new Color(255, 255, 255));
		Cancel.setBackground(new Color(0, 191, 255));
		
		Account2 = new JTextField();
		Account2.setBounds(240, 101, 74, 21);
		Account2.setColumns(10);
		Account2.setDocument((new JTextFieldLimit(5)));
		
		Account3 = new JTextField();
		Account3.setBounds(332, 101, 74, 21);
		Account3.setColumns(10);
		Account3.setDocument((new JTextFieldLimit(5)));
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(227, 104, 6, 15);
		
		JLabel label_2 = new JLabel("-");
		label_2.setBounds(320, 104, 6, 15);
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(label);
		getContentPane().add(Account1);
		getContentPane().add(password);
		getContentPane().add(btnNewButton);
		getContentPane().add(label_1);
		getContentPane().add(Account2);
		getContentPane().add(label_2);
		getContentPane().add(Account3);
		getContentPane().add(Cancel);
		getContentPane().add(lblNewLabel_2);
		getContentPane().add(lblNewLabel);
	}
}
