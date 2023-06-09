package com.rubypaper.test;

import java.util.Date;


public class BoardVO {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date date;
	private int cnt;
	
	
	public BoardVO(int no, String title, String writer, String content, Date date, int cnt) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.date = date;
		this.cnt = cnt;
	}

	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}


	public BoardVO() {
		
	}


	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", date="
				+ date + ", cnt=" + cnt + "]";
	}
	
}
