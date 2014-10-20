package com.example.sina_demo.vo;

import java.io.Serializable;

public class Comment implements Serializable{
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Comment [data=" + data + "]";
	}
	
	
	
}
