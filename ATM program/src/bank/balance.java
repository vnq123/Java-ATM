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
import javax.swing.SwingConstants;

public class balance extends JFrame {
	public static JTextField balance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					balance frame = new balance();
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
	public balance() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 271);
		DTO dto = new DTO();
	
		JLabel lblNewLabel = new JLabel("\uC794\uC561 \uC870\uD68C \uB0B4\uC5ED");
		lblNewLabel.setBounds(153, 41, 106, 21);
		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("\uB0A8\uC740 \uC794\uC561 : ");
		lblNewLabel_1.setBounds(51, 93, 74, 15);
		lblNewLabel_1.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		
		balance = new JTextField();
		balance.setHorizontalAlignment(SwingConstants.RIGHT);
		balance.setBounds(122, 90, 179, 21);
		balance.setColumns(10);
		
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(151, 136, 106, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
		}
		});
		btnNewButton.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(balance);
		getContentPane().add(btnNewButton);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uC6D0");
		label.setFont(new Font("HY�߰��", Font.PLAIN, 12));
		label.setBounds(315, 92, 74, 15);
		getContentPane().add(label);
	}
}
