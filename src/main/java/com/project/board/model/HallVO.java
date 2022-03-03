package com.project.board.model;

public class HallVO {

	private int no;
	private String name;
	private String area;
	private String location;
	private String seat;
	private String details;
	private String con;
	private String cus;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getCus() {
		return cus;
	}
	public void setCus(String cus) {
		this.cus = cus;
	}
	
	@Override
	public String toString() {
		return "HallVO [no=" + no + ", name=" + name + ", area=" + area + ", location=" + location + ", seat=" + seat
				+ ", details=" + details + ", con=" + con + ", cus=" + cus + "]";
	}	
	
}
