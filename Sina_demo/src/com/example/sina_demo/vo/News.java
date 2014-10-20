package com.example.sina_demo.vo;

import java.io.Serializable;

public class News implements Serializable{
	private String title,brief,phoneImg,padImg,itemType,itemID,detailUrl,order;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getPhoneImg() {
		return phoneImg;
	}

	public void setPhoneImg(String phoneImg) {
		this.phoneImg = phoneImg;
	}

	public String getPadImg() {
		return padImg;
	}

	public void setPadImg(String padImg) {
		this.padImg = padImg;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", brief=" + brief + ", phoneImg="
				+ phoneImg + ", padImg=" + padImg + ", itemType=" + itemType
				+ ", itemID=" + itemID + ", detailUrl=" + detailUrl
				+ ", order=" + order + "]";
	}
	
}
