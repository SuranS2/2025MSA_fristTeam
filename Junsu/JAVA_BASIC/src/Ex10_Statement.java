import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		//반복문 (while , do~while)
		int i = 10;
		while( i >= 10) {
			//반드시 증가감을 명시
			
//			--i; // i 는 9부터 출력
			System.out.println(i);
			--i; // i 는 10으로 출력하고 9로 변경
		}
		//while문 사용해서 1~100까지 합
		int j = 1;
		int sum = 0;
		while( j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		//while(true) {} 무한루프 종료 조건이 들어오기 전까지 무한정 다시 작동하는 프로그램 작성시 사용
		
		//하기 구문은 실행해보면 2단밖에 나오지 않는다.
		// p가 10으로 되어있어서 중간 while문이 계속 넘어간다
		int k = 2;
		int p= 1;
		while( k <= 9 ) {
			// p = 1; 초기값의 초기화가 필요
			while(p <= 9) {
				System.out.printf("%d*%d=%d\t",k,p,k*p);
				p++;
			}
			System.out.println();
			k++;
		}
	// 코드가 더럽고 보기 어렵기 때문에 증 가감이 확실한 구문의 경우 for문을 쓰는게 맞다 
		
		// while(true){}
		// for(;;){} for문 무한루프, 다만 잘 쓰진 않음
		// do ~ while 일단 한번 강제적으로 실행 ... 조건 보고 판단
		/*
		 * 메뉴 선택
		 * 1. 짜장
		 * 2. 짬뽕
		 */
		Scanner sc = new Scanner(System.in);
		int inputData=0;
		do {
			System.out.println("숫자 입력해(0~9)");
			inputData = Integer.parseInt(sc.nextLine());
		}while(inputData >= 10);
		
		//조건식이 true do 문을 계속 실행
		//조건식이 false 문을 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputData);
	 
		
		
	}

}
