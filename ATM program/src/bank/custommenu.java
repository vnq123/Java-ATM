package bank;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dialog.ModalityType;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class custommenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					custommenu frame = new custommenu();
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
	public custommenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uD558\uC2DC\uB294 \uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC138\uC694.");
		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 13));
		
		JButton button = new JButton("\uACC4\uC88C \uB4F1\uB85D");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountNew AccountNew = new AccountNew();
				AccountNew.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		button.setBackground(new Color(0, 191, 255));
		
		JButton button_2 = new JButton("\uC815\uBCF4 \uC218\uC815");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				modifylogin login = new modifylogin();
				login.setVisible(true);
				
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		button_2.setBackground(new Color(0, 191, 255));
		
		JButton button_3 = new JButton("\uACC4\uC88C \uC0AD\uC81C");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountDelete delete =new AccountDelete();
				delete.setVisible(true);
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		button_3.setBackground(new Color(0, 191, 255));
		
		JButton exit = new JButton("\uB098\uAC00\uAE30");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == exit)
				{
					dispose();
				}
			}
		});
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("HY�߰��", Font.PLAIN, 14));
		exit.setBackground(new Color(0, 191, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
					.addGap(152))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel)
					.addContainerGap(126, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(exit, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(152, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(exit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(102, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
