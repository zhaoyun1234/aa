package com.example.sina_demo.entity;

import java.io.Serializable;
import java.util.List;

public class Statuses implements Serializable{
	private String created_at,id,mid,idstr,text,source,source_type,favorited;
	private String truncated,in_reply_to_status_id,in_reply_to_user_id,in_reply_to_screen_name;
	private List<Pic_urls> pic_urls;
	
	private String thumbnail_pic,bmiddle_pic,original_pic,geo;
	private User user;
	
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getIdstr() {
		return idstr;
	}
	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getFavorited() {
		return favorited;
	}
	public void setFavorited(String favorited) {
		this.favorited = favorited;
	}
	public String getTruncated() {
		return truncated;
	}
	public void setTruncated(String truncated) {
		this.truncated = truncated;
	}
	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}
	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}
	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}
	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}
	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}
	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}
	public List<Pic_urls> getPic_urls() {
		return pic_urls;
	}
	public void setPic_urls(List<Pic_urls> pic_urls) {
		this.pic_urls = pic_urls;
	}
	@Override
	public String toString() {
		return "Statuses [created_at=" + created_at + ", id=" + id + ", mid="
				+ mid + ", idstr=" + idstr + ", text=" + text + ", source="
				+ source + ", source_type=" + source_type + ", favorited="
				+ favorited + ", truncated=" + truncated
				+ ", in_reply_to_status_id=" + in_reply_to_status_id
				+ ", in_reply_to_user_id=" + in_reply_to_user_id
				+ ", in_reply_to_screen_name=" + in_reply_to_screen_name
				+ ", pic_urls=" + pic_urls + "]";
	}
	
	
	
}
