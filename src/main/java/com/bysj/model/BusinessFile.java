package com.bysj.model;

import com.bysj.bean.Business;

public class BusinessFile {
	private Integer id;
	private String Gname;
	private double Gprice;
	private String Gcategory;
	private Integer Gumber;
	private Business Business;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGname() {
		return Gname;
	}

	public void setGname(String gname) {
		Gname = gname;
	}

	public double getGprice() {
		return Gprice;
	}

	public void setGprice(double gprice) {
		Gprice = gprice;
	}

	public String getGcategory() {
		return Gcategory;
	}

	public void setGcategory(String gcategory) {
		Gcategory = gcategory;
	}

	public Integer getGumber() {
		return Gumber;
	}

	public void setGumber(Integer gumber) {
		Gumber = gumber;
	}

	public Business getBusiness() {
		return Business;
	}

	public void setBusiness(Business business) {
		Business = business;
	}

}
