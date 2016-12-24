package com.mbc.minibanking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.mbc.minibanking.bl.MgrCustomer;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Customer {

	private JFrame frame;
	private JTextField txtCus_Name;
	private JTextField txtPh_No;
	private JTextField txtnrc_no;
	private JTextField txtAdd;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer window = new Customer();
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
	public Customer() {
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
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setForeground(Color.BLUE);
		lblCustomer.setFont(new Font("Zawgyi-One", Font.PLAIN, 15));
		panel.add(lblCustomer);
		
		JLabel lblCus_ID = new JLabel("Customer ID");
		lblCus_ID.setForeground(Color.BLUE);
		lblCus_ID.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblCus_ID.setBounds(10, 51, 71, 14);
		frame.getContentPane().add(lblCus_ID);
		
		JLabel lblCus_Name = new JLabel("Customer Name");
		lblCus_Name.setForeground(Color.BLUE);
		lblCus_Name.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblCus_Name.setBounds(10, 82, 105, 14);
		frame.getContentPane().add(lblCus_Name);
		
		JLabel lblCus_Ph = new JLabel("Phone No");
		lblCus_Ph.setForeground(Color.BLUE);
		lblCus_Ph.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblCus_Ph.setBounds(10, 113, 85, 14);
		frame.getContentPane().add(lblCus_Ph);
		
		JLabel lblNRC_No = new JLabel("NRC No");
		lblNRC_No.setForeground(Color.BLUE);
		lblNRC_No.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblNRC_No.setBounds(10, 144, 71, 14);
		frame.getContentPane().add(lblNRC_No);
		
		JLabel lblCus_Add = new JLabel("Address");
		lblCus_Add.setForeground(Color.BLUE);
		lblCus_Add.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		lblCus_Add.setBounds(10, 174, 46, 14);
		frame.getContentPane().add(lblCus_Add);
		
		txtCus_Name = new JTextField();
		txtCus_Name.setBounds(136, 79, 148, 23);
		frame.getContentPane().add(txtCus_Name);
		txtCus_Name.setColumns(10);
		
		txtPh_No = new JTextField();
		txtPh_No.setBounds(136, 110, 148, 23);
		frame.getContentPane().add(txtPh_No);
		txtPh_No.setColumns(10);
		
		txtnrc_no = new JTextField();
		txtnrc_no.setBounds(136, 141, 148, 23);
		frame.getContentPane().add(txtnrc_no);
		txtnrc_no.setColumns(10);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(136, 171, 148, 23);
		frame.getContentPane().add(txtAdd);
		txtAdd.setColumns(10);
		
		JButton btnNewSave = new JButton("New");
		btnNewSave.setForeground(Color.BLUE);
		btnNewSave.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnNewSave.setBounds(10, 228, 85, 23);
		frame.getContentPane().add(btnNewSave);
		
		JButton btnEditDel = new JButton("Edit");
		btnEditDel.setForeground(Color.BLUE);
		btnEditDel.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnEditDel.setBounds(204, 228, 89, 23);
		frame.getContentPane().add(btnEditDel);
		
		JButton btnCloseCancel = new JButton("Close");
		btnCloseCancel.setForeground(Color.BLUE);
		btnCloseCancel.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnCloseCancel.setBounds(309, 228, 89, 23);
		frame.getContentPane().add(btnCloseCancel);
		
		textField = new JTextField();
		textField.setBounds(136, 48, 148, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MgrCustomer l_mgr = new MgrCustomer();
				try {
					l_mgr.customer();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setForeground(Color.BLUE);
		btnSave.setFont(new Font("Zawgyi-One", Font.PLAIN, 12));
		btnSave.setBounds(105, 227, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
