package com.mbc.minibanking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JPanel;

public class Staff {

	private JFrame frame;
	private JTextField txtStaff_ID;
	private JTextField textField;
	private JTextField txtPh_No;
	private JTextField txtnrc_no;
	private JTextField txtAdd;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff window = new Staff();
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
	public Staff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 33);
		frame.getContentPane().add(panel);
		
		JLabel lblStaff = new JLabel("Staff");
		lblStaff.setForeground(Color.BLUE);
		lblStaff.setFont(new Font("Zawgyi-One", Font.PLAIN, 15));
		panel.add(lblStaff);
		
		JLabel lblStaff_ID = new JLabel("Staff ID");
		lblStaff_ID.setForeground(Color.BLUE);
		lblStaff_ID.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblStaff_ID.setBounds(10, 56, 46, 14);
		frame.getContentPane().add(lblStaff_ID);
		
		txtStaff_ID = new JTextField();
		txtStaff_ID.setBounds(143, 51, 148, 23);
		frame.getContentPane().add(txtStaff_ID);
		txtStaff_ID.setColumns(10);
		
		JLabel lblStaff_Name = new JLabel("Staff Name");
		lblStaff_Name.setForeground(Color.BLUE);
		lblStaff_Name.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblStaff_Name.setBounds(10, 86, 83, 23);
		frame.getContentPane().add(lblStaff_Name);
		
		textField = new JTextField();
		textField.setBounds(143, 85, 148, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblStaff_Ph = new JLabel("Phone No");
		lblStaff_Ph.setForeground(Color.BLUE);
		lblStaff_Ph.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblStaff_Ph.setBounds(10, 158, 85, 14);
		frame.getContentPane().add(lblStaff_Ph);
		
		JLabel lblNRC_No = new JLabel("NRC No");
		lblNRC_No.setForeground(Color.BLUE);
		lblNRC_No.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNRC_No.setBounds(10, 192, 71, 14);
		frame.getContentPane().add(lblNRC_No);
		
		JLabel lblStaff_Add = new JLabel("Address");
		lblStaff_Add.setForeground(Color.BLUE);
		lblStaff_Add.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblStaff_Add.setBounds(10, 224, 46, 14);
		frame.getContentPane().add(lblStaff_Add);
		
		txtPh_No = new JTextField();
		txtPh_No.setBounds(143, 153, 148, 23);
		frame.getContentPane().add(txtPh_No);
		txtPh_No.setColumns(10);
		
		txtnrc_no = new JTextField();
		txtnrc_no.setBounds(143, 187, 148, 23);
		frame.getContentPane().add(txtnrc_no);
		txtnrc_no.setColumns(10);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(143, 219, 148, 23);
		frame.getContentPane().add(txtAdd);
		txtAdd.setColumns(10);
		
		JButton btnNewSave = new JButton("New");
		btnNewSave.setForeground(Color.BLUE);
		btnNewSave.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnNewSave.setBounds(33, 260, 85, 23);
		frame.getContentPane().add(btnNewSave);
		
		JButton btnEditDel = new JButton("Edit");
		btnEditDel.setForeground(Color.BLUE);
		btnEditDel.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnEditDel.setBounds(150, 260, 89, 23);
		frame.getContentPane().add(btnEditDel);
		
		JButton btnCloseCancel = new JButton("Close");
		btnCloseCancel.setForeground(Color.BLUE);
		btnCloseCancel.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnCloseCancel.setBounds(281, 260, 89, 23);
		frame.getContentPane().add(btnCloseCancel);
		
		JLabel lblLogin_ps = new JLabel("Login Password");
		lblLogin_ps.setForeground(Color.BLUE);
		lblLogin_ps.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblLogin_ps.setBounds(10, 120, 108, 23);
		frame.getContentPane().add(lblLogin_ps);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 119, 148, 23);
		frame.getContentPane().add(passwordField);
	}
}
