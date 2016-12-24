package com.mbc.minibanking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Deposit {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit window = new Deposit();
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
	public Deposit() {
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
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setForeground(Color.BLUE);
		lblDeposit.setFont(new Font("Zawgyi-One", Font.PLAIN, 15));
		panel.add(lblDeposit);
		
		JLabel lblNewLabel = new JLabel("Deposit ID");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 63, 91, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 59, 188, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Bank Account ID");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 88, 109, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 90, 188, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Customer ID");
		lblNewLabel_2.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(10, 122, 91, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 121, 189, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Staff ID");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 153, 91, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 155, 190, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Deposit Amount");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 186, 91, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 186, 191, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(12, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(118, 228, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBounds(225, 228, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
