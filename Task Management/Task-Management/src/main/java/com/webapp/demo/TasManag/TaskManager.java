package com.webapp.demo.TasManag;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TaskManager {
	
	@Id
	private String tid;
	private String tHolderName;
	private String tDate;
	private String tName;
	private String tStatus;
	public String getTaskid() {
		return tid;
	}
	public void setTaskid(String tid) {
		this.tid = tid;
	}
	public String getTaskHolderName() {
		return tHolderName;
	}
	public void setTaskHolderName(String tHolderName) {
		this.tHolderName = tHolderName;
	}
	public String getTaskDate() {
		return tDate;
	}
	public void setTaskDate(String tDate) {
		this.tDate = tDate;
	}
	public String getTaskName() {
		return tName;
	}
	public void setTaskName(String tName) {
		this.tName = tName;
	}
	public String getTaskStatus() {
		return tStatus;
	}
	public void setTaskStatus(String tStatus) {
		this.tStatus = tStatus;
	}
	
}