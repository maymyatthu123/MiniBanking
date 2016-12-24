package com.mbc.minibanking;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Master {

	public JFrame frame = new JFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Master window = new Master();
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
	public Master() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMaster = new JMenu("Master");
		mnMaster.setForeground(Color.BLUE);
		menuBar.add(mnMaster);
		
		JMenuItem mntmStaff = new JMenuItem("Staff");
		mntmStaff.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				Staff l_staff = new Staff();
				l_staff.main(null);
			}
		});
		mntmStaff.setForeground(Color.BLUE);
		mnMaster.add(mntmStaff);
		
		JMenuItem mntmCustomer = new JMenuItem("Customer");
		mntmCustomer.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				Customer l_customer = new Customer();
				l_customer.main(null);
			}
		});
		mntmCustomer.setForeground(Color.BLUE);
		mnMaster.add(mntmCustomer);
		
		JMenu mnTransaction = new JMenu("Transaction");
		mnTransaction.setForeground(Color.BLUE);
		menuBar.add(mnTransaction);
		
		JMenuItem mntmCreateBankAccount = new JMenuItem("Create Bank Account");
		mntmCreateBankAccount.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				BankAccount l_bankAccount = new BankAccount();
				l_bankAccount.main(null);
			}
		});
		mntmCreateBankAccount.setForeground(Color.BLUE);
		mnTransaction.add(mntmCreateBankAccount);
		
		JMenuItem mntmDeposit = new JMenuItem("Deposit");
		mntmDeposit.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				Deposit l_deposit = new Deposit();
				l_deposit.main(null);
			}
		});
		mntmDeposit.setForeground(Color.BLUE);
		mnTransaction.add(mntmDeposit);
		
		JMenuItem mntmWithdraw = new JMenuItem("Withdraw");
		mntmWithdraw.setForeground(Color.BLUE);
		mnTransaction.add(mntmWithdraw);
		
		JMenuItem mntmTransfer = new JMenuItem("Transfer");
		mntmTransfer.setForeground(Color.BLUE);
		mnTransaction.add(mntmTransfer);
	}

}
