package mms.member.ui;

import java.util.Scanner;

import mms.member.controller.MemberController;

public class MemberUI {
	public static void main(String[] args) {
		boolean isStop = false;
		MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);
		String menu = "=====회원관리 프로그램=====\n"
				+ "1. 회원등록\n"
				+ "2.회원목록보기\n"
				+ "3.회원정보수정\n"
				+ "4.회원정보삭제\n"
				+ "5.프로그램종료";
		do {
			System.out.println(menu);
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			if (select == 1) {
				
			}
		} while(!isStop);
	}
}
