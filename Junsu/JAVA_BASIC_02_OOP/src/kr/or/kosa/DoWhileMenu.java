package kr.or.kosa;

import java.util.Scanner;

public class DoWhileMenu {
	Scanner sc = new Scanner(System.in);  // instance variable 선언
	public void inputRecord() {
		System.out.println("성적 데이터 입력");
	}
	public void deleteRecord() {
		System.out.println("성적 데이터 삭제");
	}
	public void sortRecord() {
		System.out.println("성적 데이터 정렬");
	}
	public int displayMenu() {
		System.out.println("************");
		System.out.println("***성적관리***");
		System.out.println("1.학생성적 입력");
		System.out.println();
		System.out.println("2.학생성적 삭제");
		System.out.println();
		System.out.println("3.학생성적 이름순 정렬");
		System.out.println();
		System.out.println("4.프로그램 종료");
		System.out.println();
		int menu = 0;
		try {
			do {
				menu = Integer.parseInt(sc.nextLine());
				if(1<= menu && menu <= 4) {
					break;
				}else {
					//입력값 : 1<= input <= 4 범주 외 조건은 예외처리
					throw new Exception("메뉴 범위가 잘못 되었습니다.");
				}	
			}while(true);
		}catch(Exception e){
			System.out.println("원인 문제 : " + e.getMessage());
			System.out.println("메뉴 선택에 문제 발생");
			System.out.println("1~4까지의 번호를 입력해주세요.");
		}
		return menu;
	}
}
