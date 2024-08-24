package com.crimson.entity;

public class Book {
	
	private int bookid;
	private String bookname;
	private String author;
	private String category;
	private int yearofpublish;
	private double price;
	public Book() {
		super();
	}
	public Book(int bookid, String bookname, String author, String category, int yearofpublish, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.category = category;
		this.yearofpublish = yearofpublish;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getYearofpublish() {
		return yearofpublish;
	}
	public void setYearofpublish(int yearofpublish) {
		this.yearofpublish = yearofpublish;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", category=" + category
				+ ", yearofpublish=" + yearofpublish + ", price=" + price + "]";
	}
	
	

}
