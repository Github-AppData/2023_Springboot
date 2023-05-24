package com.rubypaper.dto;

public class BookDTO1 {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private String date;
	
	// 인자로도 넣을 때, 생성자를 사용한다.
	public BookDTO1() {	}

	public BookDTO1(int id, String title, String author, String publisher, String date) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookDTO1 [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", date="
				+ date + "]";
	}
	
	
	

}
