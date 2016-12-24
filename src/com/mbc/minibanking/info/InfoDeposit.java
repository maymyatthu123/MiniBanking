package com.mbc.minibanking.info;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InfoDeposit implements Serializable{
	
	private String deposit_Id;
	private String bank_Account_Id;
	private String customer_Id;
	private String staff_Id;
	private String deposit_Amount;

	public InfoDeposit(){
		clearProperties();
	}

	private void clearProperties() {	
		deposit_Id = "";
		bank_Account_Id = "";
		customer_Id = "";
		staff_Id = "";
		deposit_Amount = "";
	}

	public String getDeposit_Id() {
		return deposit_Id;
	}

	public void setDeposit_Id(String deposit_Id) {
		this.deposit_Id = deposit_Id;
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

	public String getDeposit_Amount() {
		return deposit_Amount;
	}

	public void setDeposit_Amount(String deposit_Amount) {
		this.deposit_Amount = deposit_Amount;
	}
	
}
