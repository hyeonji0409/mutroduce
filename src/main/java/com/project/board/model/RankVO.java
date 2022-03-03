package com.project.board.model;

import java.util.Date;

public class RankVO {
    private String muscName;
    private String muscStartDate;
    private String muscEndDate;
    private String muscPlace;
    private int hits;
    private String muscPlaceLink;
    private int muscNo;
    
	public int getMuscNo() {
		return muscNo;
	}
	public void setMuscNo(int muscNo) {
		this.muscNo = muscNo;
	}
	public String getMuscPlaceLink() {
		return muscPlaceLink;
	}
	public void setMuscPlaceLink(String muscPlaceLink) {
		this.muscPlaceLink = muscPlaceLink;
	}
	public String getMuscName() {
		return muscName;
	}
	public void setMuscName(String muscName) {
		this.muscName = muscName;
	}
	public String getMuscStartDate() {
		return muscStartDate;
	}
	public void setMuscStartDate(String muscStartDate) {
		this.muscStartDate = muscStartDate;
	}
	public String getMuscEndDate() {
		return muscEndDate;
	}
	public void setMuscEndDate(String muscEndDate) {
		this.muscEndDate = muscEndDate;
	}
	public String getMuscPlace() {
		return muscPlace;
	}
	public void setMuscPlace(String muscPlace) {
		this.muscPlace = muscPlace;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	@Override
	public String toString() {
		return "RankVO [muscName=" + muscName + ", muscStartDate=" + muscStartDate + ", muscEndDate=" + muscEndDate
				+ ", muscPlace=" + muscPlace + ", hits=" + hits + "]";
	}
	
    
}
