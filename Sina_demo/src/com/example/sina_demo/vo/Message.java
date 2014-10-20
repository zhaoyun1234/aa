package com.example.sina_demo.vo;

import java.io.Serializable;

public class Message implements Serializable{
	private int img;
	private String content;
	
	public Message(int img, String content) {
		super();
		this.img = img;
		this.content = content;
	}
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [img=" + img + ", content=" + content + "]";
	}
	

}
