package com.project.board.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BoardVO {
    private int idx;
    private String memId;
	private String title;
    private String contents;
    private String image;
    private String hits;
    private String type;
    private String keyword;
    
    public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date writedate;
    
    public Date getWritedate() {
		return writedate;
	}

	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}

	public String getHits() {
		return hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public BoardVO() {
    // TODO Auto-generated constructor stub
    }
    
    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    
    public BoardVO(int idx, String title, String contents, String image, String hits, Date writedate, String memId) {
        super();
        this.idx = idx;
        this.title = title;
        this.contents = contents;
        this.image = image;
        this.hits= hits;
        this.writedate= writedate;
        this.memId= memId;
    }

	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", memId=" + memId + ", title=" + title + ", contents=" + contents + ", image="
				+ image + ", hits=" + hits + ", type=" + type + ", keyword=" + keyword + ", writedate=" + writedate
				+ "]";
	}
    
    

}