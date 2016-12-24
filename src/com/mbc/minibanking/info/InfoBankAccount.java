package com.mbc.minibanking.info;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InfoBankAccount implements Serializable{

	private String bank_Account_Id;
	private String customer_Id;
	private String staff_Id;
	
	public InfoBankAccount(){
		clearProperties();
	}

	private void clearProperties() {		
		bank_Account_Id = "";
		customer_Id = "";
		staff_Id = "";
	}

	public String getBank_Account_Id() {
		return bank_Account_Id;
	}

	public void setBank_Account_Id(String bank_Account_Id) {
		this.bank_Account_Id = bank_Account_Id;
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

}
