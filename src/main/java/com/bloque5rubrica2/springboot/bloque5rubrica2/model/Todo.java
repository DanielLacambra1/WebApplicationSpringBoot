package com.bloque5rubrica2.springboot.bloque5rubrica2.model;

import java.util.Date;

public class Todo {
	private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;
    
    public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {
    	id = this.id;
    	user = this.user;
    	desc = this.desc;
    	targetDate = this.targetDate;
    	isDone = this.isDone;
    }
    
    @Override
	public String toString() {
		return "Todo [user=" + user + ", desc=" + desc +  ", targetDate=" + targetDate +  ", isDone=" + isDone + "]";
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
    
    
}
