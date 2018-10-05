package com.example.studentAge.studentAge.domain;

public class messageDomain {
	private long id;
	private String msg;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}

}
