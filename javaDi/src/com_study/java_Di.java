package com_study;

import java.util.Date;

class Member {
	String name;
	String nickname;
	public Member() {}
}
public class java_Di {

	public static void main(String[] args) {
		getDate(new Date());

	}
	public static void getDate(Date d) {
		/* Date date = new Date(); */ // 강결합
		Date date = d; // 약결합
		System.out.println("날짜 : "+date);
	}
	public static void member1() {
		Member m1 = new Member(); // 강결합
	}
	public static void member2(Member m) {
		Member m2 = m; // 약결합 - 생성된 것을 주입받음
	}

}
