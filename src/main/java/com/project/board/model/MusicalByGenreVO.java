package com.project.board.model;

public class MusicalByGenreVO {
	private String memId;
	private String memPw;
	private String memName;
	private String genre;
	
	private String muscNo;
	private String muscName;
	private String muscGenre;
	private String muscImg;
	
	//constructor
	public MusicalByGenreVO(){}
	
	public MusicalByGenreVO(String memId, String memPw, String memName, String genre, String muscNo, String muscName,
			String muscGenre, String muscImg) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.genre = genre;
		this.muscNo = muscNo;
		this.muscName = muscName;
		this.muscGenre = muscGenre;
		this.muscImg = muscImg;
	}

	public String getMemId() {
		return memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public String getMemName() {
		return memName;
	}

	public String getGenre() {
		return genre;
	}

	public String getMuscNo() {
		return muscNo;
	}

	public String getMuscName() {
		return muscName;
	}

	public String getMuscGenre() {
		return muscGenre;
	}

	public String getMuscImg() {
		return muscImg;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setMuscNo(String muscNo) {
		this.muscNo = muscNo;
	}

	public void setMuscName(String muscName) {
		this.muscName = muscName;
	}

	public void setMuscGenre(String muscGenre) {
		this.muscGenre = muscGenre;
	}

	public void setMuscImg(String muscImg) {
		this.muscImg = muscImg;
	}

	@Override
	public String toString() {
		return "MusicalByGenreVO [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + ", genre=" + genre
				+ ", muscNo=" + muscNo + ", muscName=" + muscName + ", muscGenre=" + muscGenre + ", muscImg=" + muscImg
				+ "]";
	}
	
	
}
