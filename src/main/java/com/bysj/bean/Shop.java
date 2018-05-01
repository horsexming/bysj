package com.bysj.bean;

public class Shop {
	private Integer id;
	private String Sname;
	private double Sprice;
	private String Spicture;
	private String Suser;
	private String Saddress;

	public String getSaddress() {
		return Saddress;
	}

	public void setSaddress(String saddress) {
		Saddress = saddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public double getSprice() {
		return Sprice;
	}

	public void setSprice(double sprice) {
		Sprice = sprice;
	}

	public String getSpicture() {
		return Spicture;
	}

	public void setSpicture(String spicture) {
		Spicture = spicture;
	}

	public String getSuser() {
		return Suser;
	}

	public void setSuser(String suser) {
		Suser = suser;
	}

	

}
