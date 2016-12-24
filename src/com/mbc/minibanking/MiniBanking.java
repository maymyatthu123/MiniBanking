package com.mbc.minibanking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class MiniBanking {

	private JFrame frame ;
	private JTextField textField = new JTextField();
	private JPasswordField passwordField = new JPasswordField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniBanking window = new MiniBanking();
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
	public MiniBanking() {
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
		panel.setBounds(0, 0, 434, 31);
		frame.getContentPane().add(panel);
		
		JLabel lblMinibankingSystem = new JLabel("Mini-Banking System");
		lblMinibankingSystem.setBackground(Color.LIGHT_GRAY);
		lblMinibankingSystem.setFont(new Font("Zawgyi-One", Font.PLAIN, 16));
		lblMinibankingSystem.setForeground(Color.BLUE);
		panel.add(lblMinibankingSystem);
		
		final JLabel lblUsername = new JLabel("Staff ID");
		lblUsername.setForeground(Color.BLUE);
		lblUsername.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblUsername.setBounds(85, 65, 72, 23);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(158, 65, 151, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblPassword.setBounds(85, 112, 72, 23);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLUE);
		btnLogin.setBounds(178, 169, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 112, 151, 20);
		frame.getContentPane().add(passwordField);
		
		btnLogin.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().equals("") && !passwordField.getText().equals("")){
					if(textField.getText().equals("ccc") && passwordField.getText().equals("ccc")){
						Master l_master = new Master();
						l_master.frame.setVisible(true);
						frame.dispose();
					}
				}
			}
		});
	}
}
