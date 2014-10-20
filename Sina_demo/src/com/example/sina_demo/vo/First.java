package com.example.sina_demo.vo;

import java.io.Serializable;

public class First implements Serializable{
	private String img,name,from;

	public First(String img, String name, String from) {
		super();
		this.img = img;
		this.name = name;
		this.from = from;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return "First [img=" + img + ", name=" + name + ", from=" + from + "]";
	}
	
}
