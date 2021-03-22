package com.zensar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="products")

public class Products {

	@Id
	int p_id;
	String p_name;
	String p_shortdescription;
	String p_fulldescription;
	String p_mainimage;
	int p_instock;
	float p_listprice;
	float p_discountprice;
	int p_categoryid;
	String p_categoryname;
	String p_brandname;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_shortdescription() {
		return p_shortdescription;
	}
	public void setP_shortdescription(String p_shortdescription) {
		this.p_shortdescription = p_shortdescription;
	}
	public String getP_fulldescription() {
		return p_fulldescription;
	}
	public void setP_fulldescription(String p_fulldescription) {
		this.p_fulldescription = p_fulldescription;
	}
	public String getP_mainimage() {
		return p_mainimage;
	}
	public void setP_mainimage(String p_mainimage) {
		this.p_mainimage = p_mainimage;
	}
	public int getP_instock() {
		return p_instock;
	}
	public void setP_instock(int p_instock) {
		this.p_instock = p_instock;
	}
	public float getP_listprice() {
		return p_listprice;
	}
	public void setP_listprice(float p_listprice) {
		this.p_listprice = p_listprice;
	}
	public float getP_discountprice() {
		return p_discountprice;
	}
	public void setP_discountprice(float p_discountprice) {
		this.p_discountprice = p_discountprice;
	}
	public int getP_categoryid() {
		return p_categoryid;
	}
	public void setP_categoryid(int p_categoryid) {
		this.p_categoryid = p_categoryid;
	}
	public String getP_categoryname() {
		return p_categoryname;
	}
	public void setP_categoryname(String p_categoryname) {
		this.p_categoryname = p_categoryname;
	}
	public String getP_brandname() {
		return p_brandname;
	}
	public void setP_brandname(String p_brandname) {
		this.p_brandname = p_brandname;
	}
	
	public Products() {
		
	}
	public Products(int p_id, String p_name, String p_shortdescription, String p_fulldescription, String p_mainimage,
			int p_instock, float p_listprice, float p_discountprice, int p_categoryid, String p_categoryname,
			String p_brandname) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_shortdescription = p_shortdescription;
		this.p_fulldescription = p_fulldescription;
		this.p_mainimage = p_mainimage;
		this.p_instock = p_instock;
		this.p_listprice = p_listprice;
		this.p_discountprice = p_discountprice;
		this.p_categoryid = p_categoryid;
		this.p_categoryname = p_categoryname;
		this.p_brandname = p_brandname;
	}
	@Override
	public String toString() {
		return "products [p_id=" + p_id + ", p_name=" + p_name + ", p_shortdescription=" + p_shortdescription
				+ ", p_fulldescription=" + p_fulldescription + ", p_mainimage=" + p_mainimage + ", p_instock="
				+ p_instock + ", p_listprice=" + p_listprice + ", p_discountprice=" + p_discountprice
				+ ", p_categoryid=" + p_categoryid + ", p_categoryname=" + p_categoryname + ", p_brandname="
				+ p_brandname + "]";
	}
	
	
	
}
