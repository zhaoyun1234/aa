package com.example.sina_demo.vo;

import java.io.Serializable;

public class Me implements Serializable{
	private int img;
	private String name;
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	
	public Me(int img, String name) {
		super();
		this.img = img;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Me [img=" + img + ", name=" + name + "]";
	}
	

}
