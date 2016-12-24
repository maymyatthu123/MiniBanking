package com.mbc.minibanking.info;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InfoStaff implements Serializable{

	private String staff_Id;
	private String staff_Name;
	private String phone_Number;
	private String nrc_Number;
	private String address;
	private String staff_Level;
	
	public InfoStaff(){
		clearProperties();
	}

	private void clearProperties() {
		staff_Id = "";
		staff_Name = "";
		phone_Number = "";
		nrc_Number = "";
		address = "";
		staff_Level = "";
	}

	public String getStaff_Id() {
		return staff_Id;
	}

	public void setStaff_Id(String staff_Id) {
		this.staff_Id = staff_Id;
	}

	public String getStaff_Name() {
		return staff_Name;
	}

	public void setStaff_Name(String staff_Name) {
		this.staff_Name = staff_Name;
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

	public String getStaff_Level() {
		return staff_Level;
	}

	public void setStaff_Level(String staff_Level) {
		this.staff_Level = staff_Level;
	}
	
}
