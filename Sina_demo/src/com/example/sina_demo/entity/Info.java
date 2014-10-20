package com.example.sina_demo.entity;

import java.io.Serializable;
import java.util.List;

public class Info implements Serializable{
	private List<Statuses> statuses;

	public List<Statuses> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<Statuses> statuses) {
		this.statuses = statuses;
	}

	@Override
	public String toString() {
		return "Info [statuses=" + statuses + "]";
	}
	
}
