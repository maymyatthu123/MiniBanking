package com.mbc.minibanking.info;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InfoCustomer implements Serializable{

	private String customer_Id;
	private String customer_Name;
	private String phone_Number;
	private String nrc_Number;
	private String address;
	
	public InfoCustomer(){
		clearProperties();
	}

	private void clearProperties() {
		customer_Id = "";
		customer_Name = "";
		phone_Number = "";
		nrc_Number = "";
		address = "";
	}

	public String getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getNrc_Number() {
		return nrc_Number;
	}

	public void setNrc_Number(String nrc_Number) {
		this.nrc_Number = nrc_Number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
