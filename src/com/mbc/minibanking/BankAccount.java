package com.mbc.minibanking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankAccount {

	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankAccount window = new BankAccount();
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
	public BankAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 33);
		frame.getContentPane().add(panel);
		
		JLabel lblBankAccount = new JLabel("Bank Account ");
		lblBankAccount.setForeground(Color.BLUE);
		lblBankAccount.setFont(new Font("Zawgyi-One", Font.PLAIN, 15));
		panel.add(lblBankAccount);
		
		JLabel lblNewLabel = new JLabel("Bank Account ID");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNewLabel.setBounds(64, 59, 109, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(172, 64, 153, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setForeground(Color.BLUE);
		lblCustomerId.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblCustomerId.setBounds(64, 103, 98, 26);
		frame.getContentPane().add(lblCustomerId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 106, 153, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStaffId = new JLabel("Staff ID");
		lblStaffId.setForeground(Color.BLUE);
		lblStaffId.setBounds(64, 140, 98, 33);
		frame.getContentPane().add(lblStaffId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 146, 153, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.setFont(new Font("Zawgyi-One", Font.PLAIN, 11));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(32, 208, 78, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Zawgyi-One", Font.PLAIN, 11));
		btnNewButton_1.setBounds(120, 208, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Zawgyi-One", Font.PLAIN, 11));
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setBounds(218, 208, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Zawgyi-One", Font.PLAIN, 11));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Master l_master = new Master();
				l_master.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(317, 207, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
