import java.util.Scanner;

public class Ex08_Operation_Quiz {
	public static void main(String[] args) {
		/*
		간단한 사칙 연산기 (+ , - , * , /)
		입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
		목적 : Integer.parseInt() ,  ** 구글 java equals() 활용  문자열의 비교** 

		화면
		>입력값:숫자
		>입력값(기호): +
		>입력값:숫자 
		>연산결과 :200
		-------------
		>입력값:100
		>입력값(기호): -
		>입력값:100
		>연산결과 :0 

		 */
		//if 조건값이 boolean
		// switch 문은 정수형 byte, short, int) 와 문자(char) , 문자열(String) 조건식 사용 가능 long,boolean 불가
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String arithmetic = sc.nextLine();
		String num2 = sc.nextLine();
		int result = 0;
		int strToNum1 = Integer.parseInt(num1);
		int strToNum2 = Integer.parseInt(num2);
		boolean flag=false;
		switch(arithmetic) {
			case "+":
				result = strToNum1 + strToNum2;
				break;
			case "-":
				result = strToNum1 - strToNum2;
				break;
			case "/":
				result = strToNum1 / strToNum2;
				break;
			case "*":
				result = strToNum1 * strToNum2;
				break;
			default: 
				flag=true;
				System.out.println("오류입니다.");
		}
		if(!flag) {
			System.out.printf("%s %s %s = %d \n",num1,arithmetic,num2,result );
		}
	}

}
