package bank;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;

public class Main extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public  Main() {
		
		setTitle("ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton deposit = new JButton(new ImageIcon("D:\\An\\ATM\\img\\1.jpg"));


		deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == deposit)
				{
					deposit frame = new deposit();
					frame.setVisible(true);
				}
			}
		});
		deposit.setBounds(0, 10, 130, 48);
		
		
		JButton withdraw = new JButton(new ImageIcon("img/withdraw.jpg"));


		withdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == withdraw)
				{
					withdraw frame = new withdraw();
					frame.setVisible(true);
				}
					
			}
		});
		withdraw.setBounds(159, 10, 130, 48);
		withdraw.setIcon(new ImageIcon("D:\\An\\ATM\\img\\2.jpg"));
		
		JButton balance = new JButton(new ImageIcon("img/Checkbalance.jpg"));
		balance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Checkbalance check = new Checkbalance();
				check.setVisible(true);
			}
		});
		balance.setBounds(322, 10, 130, 48);
		balance.setIcon(new ImageIcon("D:\\An\\ATM\\img\\7.jpg"));
		
		JButton CreateAccount = new JButton(new ImageIcon("img/Account.jpg"));
		CreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == CreateAccount)
				{
					custommenu frame = new custommenu();
					frame.setVisible(true);
				}
			}
		});
		CreateAccount.setBounds(483, 10, 130, 48);
		CreateAccount.setIcon(new ImageIcon("D:\\An\\ATM\\img\\10.jpg"));
		
		JButton exit = new JButton(new ImageIcon("img/exit.jpg"));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == exit)
					System.exit(0);
			}
		});
		exit.setBounds(639, 10, 130, 48);
		exit.setIcon(new ImageIcon("D:\\An\\ATM\\img\\8.jpg"));
		
		JLabel mainlogo = new JLabel("");
		mainlogo.setBounds(256, 90, 244, 239);
		mainlogo.setIcon(new ImageIcon("D:\\An\\ATM\\img\\ui_signature01.gif"));
		
		JLabel mainlabel = new JLabel("\uC6D0\uD558\uC2DC\uB294 \uBA54\uB274\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694.");
		mainlabel.setBounds(287, 339, 197, 27);
		mainlabel.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		contentPane.setLayout(null);
		contentPane.add(deposit);
		contentPane.add(withdraw);
		contentPane.add(mainlogo);
		contentPane.add(balance);
		contentPane.add(CreateAccount);
		contentPane.add(exit);
		contentPane.add(mainlabel);
		
	}
}
