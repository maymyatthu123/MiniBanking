package com.mbc.minibanking.info;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InfoTransfer implements Serializable{
	
	private String transfer_Id;	
	private String bank_Account_Id;
	private String transfer_Bank_Account_Id;
	private String customer_Id;
	private String staff_Id;
	private double transfer_Amount;
	
	public InfoTransfer(){
		clearProperties();
	}

	private void clearProperties() {	
		transfer_Id = "";
		bank_Account_Id = "";
		transfer_Bank_Account_Id = "";
		customer_Id = "";
		staff_Id = "";
		transfer_Amount = 0.0;
	}

	public String getTransfer_Id() {
		return transfer_Id;
	}

	public void setTransfer_Id(String transfer_Id) {
		this.transfer_Id = transfer_Id;
	}

	public String getBank_Account_Id() {
		return bank_Account_Id;
	}

	public void setBank_Account_Id(String bank_Account_Id) {
		this.bank_Account_Id = bank_Account_Id;
	}

	public String getTransfer_Bank_Account_Id() {
		return transfer_Bank_Account_Id;
	}

	public void setTransfer_Bank_Account_Id(String transfer_Bank_Account_Id) {
		this.transfer_Bank_Account_Id = transfer_Bank_Account_Id;
	}

	public String getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getStaff_Id() {
		return staff_Id;
	}

	public void setStaff_Id(String staff_Id) {
		this.staff_Id = staff_Id;
	}

	public double getTransfer_Amount() {
		return transfer_Amount;
	}

	public void setTransfer_Amount(double transfer_Amount) {
		this.transfer_Amount = transfer_Amount;
	}

}
