import java.util.Scanner;

public class Ex11_Statement_Quiz {
	public static void main(String[] args) {
		//메뉴를 보여주고 사용자의 선택을 하게 만듦
		// 원하는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여 줄 것
		//1. 예금
		//2. 출금
		//3. 잔고
		//4. 종료 조건 판단 while 탈출(어떤 조건이 일치하면 강제 break)
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int balance = 0;
		while(true) {
			System.out.println("ATM 메뉴를 선택해주세요");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔고");
			System.out.println("4. 종료");
			System.out.printf("\n당신의 선택 : ");
			choice = sc.nextInt();
			int IOmoney = 0;
			if(choice == 1) {
				//입금
				System.out.printf("예금 입력 : " );
				IOmoney = sc.nextInt();
				balance += IOmoney;
			}else if(choice == 2){
				//출금(마통가능)
				System.out.printf("예금 입력 : " );
				IOmoney = sc.nextInt();
				balance -= IOmoney;
			}else if(choice == 3){
				//잔고 출력
				System.out.println("잔금 : " + balance + "원");
			}else if(choice == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else {
				System.out.println("제대로 된 버튼을 선택해주세요. 선택 메뉴로 돌아갑니다...");
			}	
		}
//		잔액 변수를 생성(balance)
//		예금 처리 + 누적
//		출금 처리 - 누적
		//잔고 balance 출력
		//종료 프로그램의 끝 (함수의 종료 , 프로그램의 강제 종료)
		//논리적 종료 ( return(x) , exit(x) 안됨)
	}
}
