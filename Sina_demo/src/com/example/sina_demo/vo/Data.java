package com.example.sina_demo.vo;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable{
	private String liveUrl;
	private String liveTitle,liveImage,tjShow;
	private List<News> bigImg;
	private List<Hot> hot;
	public String getLiveUrl() {
		return liveUrl;
	}
	public void setLiveUrl(String liveUrl) {
		this.liveUrl = liveUrl;
	}
	public String getLiveTitle() {
		return liveTitle;
	}
	public void setLiveTitle(String liveTitle) {
		this.liveTitle = liveTitle;
	}
	public String getLiveImage() {
		return liveImage;
	}
	public void setLiveImage(String liveImage) {
		this.liveImage = liveImage;
	}
	public String getTjShow() {
		return tjShow;
	}
	public void setTjShow(String tjShow) {
		this.tjShow = tjShow;
	}
	public List<News> getBigImg() {
		return bigImg;
	}
	public void setBigImg(List<News> bigImg) {
		this.bigImg = bigImg;
	}
	public List<Hot> getHot() {
		return hot;
	}
	public void setHot(List<Hot> hot) {
		this.hot = hot;
	}
	@Override
	public String toString() {
		return "Data [liveUrl=" + liveUrl + ", liveTitle=" + liveTitle
				+ ", liveImage=" + liveImage + ", tjShow=" + tjShow
				+ ", bigImg=" + bigImg + ", hot=" + hot + "]";
	}
	
	
}
