package com.javaex.ex10;

public class Book {
    //필드
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	
	//생성자
    public Book(){}
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
    
    //get set 메소드
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setBookNo(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	//일반 메소드
    public void rent() {
    	if(stateCode == 0) {
    		System.out.println("이 책은 이미 대여중입니다.");
    	} else {
    		stateCode = 0;
    		System.out.println(title + "(이)가 대여 됐습니다.");
    	}
    }
    
    public void print() {
    	String state;
    	if(stateCode == 0) {
    		state = "대여중";
    	} else {
    		state = "재고있음";
    	}
    	System.out.println(bookNo + ". 책 재목:" + title + ", 작가:" + author + "대여 유무:" + state);
    }
    
}
