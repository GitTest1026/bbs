package mms.member.ui;

import java.util.Scanner;

import mms.member.controller.MemberController;

public class MemberUI {
	public static void main(String[] args) {
		boolean isStop = false;
		MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);
		String menu = "=====ȸ������ ���α׷�=====\n"
				+ "1. ȸ�����\n"
				+ "2.ȸ����Ϻ���\n"
				+ "3.ȸ����������\n"
				+ "4.ȸ����������\n"
				+ "5.���α׷�����";
		do {
			System.out.println(menu);
			System.out.print("�޴� ��ȣ : ");
			int select = sc.nextInt();
			if (select == 1) {
				
			}
		} while(!isStop);
	}
}