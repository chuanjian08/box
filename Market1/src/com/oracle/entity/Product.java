package com.oracle.entity;

public class Product {
	private String name;//产品名
	private String address;//产地
	private String price;//价格
	private String imagine;//图片地址
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImagine() {
		return imagine;
	}
	public void setImagine(String imagine) {
		this.imagine = imagine;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", address=" + address + ", price="
				+ price + "]";
	}
	

}
