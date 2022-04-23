package com.javaex.ex01;

public class Member {
	//필드
	public String name;
	public String id;
	public int point;
	
	//생성자
	public Member() {}
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
		point = 0;
	}
	public Member(String name, String id, int point) {
		this(name, id);
		this.point = point;
	}
	
	//get set 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	
	//일반 메소드
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + ")" + ", " + point + "점");
	}
}
