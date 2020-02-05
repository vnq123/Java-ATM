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
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class AccountNew extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField Account1;
	private JTextField Account2;
	private JTextField Account3;
	private JTextField Rnum1;
	private JTextField Rnum2;
	private JTextField phone1;
	private JTextField phone2;
	private JTextField address;
	private JTextField password;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountNew frame = new AccountNew();
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
	public AccountNew() {
		DTO dto = new DTO();
		Connection conn = null;                                       
		PreparedStatement pstmt = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACE0\uAC1D \uC815\uBCF4");
		lblNewLabel.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		lblNewLabel.setBounds(188, 22, 61, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984      :");
		lblNewLabel_1.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(70, 80, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uACC4\uC88C\uBC88\uD638      :");
		label.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		label.setBounds(46, 115, 77, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC8FC\uBBFC\uBC88\uD638      :");
		label_1.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		label_1.setBounds(46, 152, 77, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC804\uD654\uBC88\uD638      :");
		label_2.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		label_2.setBounds(46, 186, 77, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uC8FC\uC18C      :");
		label_3.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		label_3.setBounds(70, 218, 57, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uBE44\uBC00\uBC88\uD638      :");
		label_4.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		label_4.setBounds(46, 256, 77, 15);
		contentPane.add(label_4);
		
		name = new JTextField();
		name.setFont(new Font("Gulim", Font.PLAIN, 12));
		name.setBounds(142, 77, 79, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		



		
		JButton AccountNew = new JButton("\uD655\uC778");
		AccountNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == AccountNew)
				{
				
					dto.setname(name.getText());
					dto.setAccount(Account1.getText() + Account2.getText() + Account3.getText());
					dto.setRnum(Rnum1.getText() + Rnum2.getText());
					dto.setphone(phone1.getText() + phone2.getText());
					dto.setaddress(address.getText());
					dto.setPassword(password.getText());
					JOptionPane.showMessageDialog(null, "계좌 등록이 완료되었습니다.");
					dispose();

					
					try {

						insertDAO.create(dto);  //

						} catch (Exception e1) {

						// TODO Auto-generated catch block

						e1.printStackTrace();
				}
				
			}
			}
		});
		AccountNew.setForeground(Color.WHITE);
		AccountNew.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		AccountNew.setBackground(new Color(0, 191, 255));
		AccountNew.setBounds(98, 300, 99, 38);
		contentPane.add(AccountNew);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		button.setBounds(262, 299, 99, 38);
		button.setBackground(new Color(0, 191, 255));
		contentPane.add(button);
		
		Account1 = new JTextField();
		Account1.setFont(new Font("����", Font.PLAIN, 12));
		Account1.setColumns(10);
		Account1.setBounds(142, 113, 79, 21);
		contentPane.add(Account1);
		
		JLabel label_5 = new JLabel("-");
		label_5.setBounds(227, 116, 11, 15);
		contentPane.add(label_5);
		
		Account2 = new JTextField();
		Account2.setFont(new Font("����", Font.PLAIN, 12));
		Account2.setColumns(10);
		Account2.setBounds(237, 113, 79, 21);
		contentPane.add(Account2);
		
		JLabel label_6 = new JLabel("-");
		label_6.setBounds(322, 116, 11, 15);
		contentPane.add(label_6);
		
		Account3 = new JTextField();
		Account3.setFont(new Font("����", Font.PLAIN, 12));
		Account3.setColumns(10);
		Account3.setBounds(333, 113, 79, 21);
		contentPane.add(Account3);
		
		Rnum1 = new JTextField();
		Rnum1.setFont(new Font("����", Font.PLAIN, 12));
		Rnum1.setColumns(10);
		Rnum1.setBounds(142, 150, 79, 21);
		contentPane.add(Rnum1);
		
		JLabel label_7 = new JLabel("-");
		label_7.setBounds(226, 153, 11, 15);
		contentPane.add(label_7);
		
		Rnum2 = new JTextField();
		Rnum2.setFont(new Font("����", Font.PLAIN, 12));
		Rnum2.setColumns(10);
		Rnum2.setBounds(237, 151, 79, 21);
		contentPane.add(Rnum2);
		
		phone1 = new JTextField();
		phone1.setFont(new Font("����", Font.PLAIN, 12));
		phone1.setColumns(10);
		phone1.setBounds(142, 186, 79, 21);
		contentPane.add(phone1);
		
		JLabel label_8 = new JLabel("-");
		label_8.setBounds(226, 189, 11, 15);
		contentPane.add(label_8);
		
		phone2 = new JTextField();
		phone2.setFont(new Font("����", Font.PLAIN, 12));
		phone2.setColumns(10);
		phone2.setBounds(237, 186, 79, 21);
		contentPane.add(phone2);
		
		address = new JTextField();
		address.setFont(new Font("����", Font.PLAIN, 12));
		address.setColumns(10);
		address.setBounds(142, 218, 276, 21);
		contentPane.add(address);
		
		password = new JTextField();
		password.setFont(new Font("����", Font.PLAIN, 12));
		password.setColumns(10);
		password.setBounds(142, 252, 79, 21);
		password.setDocument((new JTextFieldLimit(4)));
		contentPane.add(password);
	}
}
