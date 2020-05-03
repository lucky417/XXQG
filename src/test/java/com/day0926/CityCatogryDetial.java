package com.day0926;

public class CityCatogryDetial {
	String cartgory;
	String city;
	int count;
	int price;
	public String getCartgory() {
		return cartgory;
	}
	public void setCartgory(String cartgory) {
		this.cartgory = cartgory;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public CityCatogryDetial(String cartgory, String city, int count, int price) {
		super();
		this.cartgory = cartgory;
		this.city = city;
		this.count = count;
		this.price = price;
	}
	public CityCatogryDetial() {
		// TODO Auto-generated constructor stub
	}

}
