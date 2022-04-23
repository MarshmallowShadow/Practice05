package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m01 = new Member("정우성", "jws", 50000);
		Member m02 = new Member("유제석", "yjs");
		Member m03 = new Member();
		
		m02.setPoint(40000);
		m03.setName("이효리");
		m03.setId("lhr");
		m03.setPoint(30000);
		
		m01.showInfo();
		m02.showInfo();
		m03.showInfo();
	}

}
