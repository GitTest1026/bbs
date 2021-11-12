package mms.member.util;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.vo.Member;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
		Member m = new Member();
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름 : ");
		m.setName(sc.next());
		System.out.println();
		System.out.print("주소 : ");
		m.setAddr(sc.next());
		System.out.println();
		System.out.print("국가 : ");
		m.setNation(sc.next());
		System.out.println();
		System.out.print("이메일 : ");
		m.setEmail(sc.next());
		System.out.println();
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
		return new Member();
	}

	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 성공");
	}

	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + " 회원 정보 추가 실패");
	}

	public void printMemberList(ArrayList<Member> memberList) {
		// size() : 컬렉션에 저장되어 있는 요소의 개수를 리턴하는 메소드
	}

	public String getName(String msgKind, Scanner sc) {
		return null;
	}

	public Member getUpdateMember(Scanner sc, Member oldMember) {
		return null;
	}

	public void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 성공.");
	}

	public void printModifyFailMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 실패.");
	}

	public void printRemoveSuccessMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 성공.");
	}

	public void printRemoveFailMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 실패.");
	}

}
