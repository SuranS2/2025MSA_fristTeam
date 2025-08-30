
public class Ex03_DataType {
	public static void main(String[] args) {
		//int -21~21
		int num = 1000000;
		System.out.println("num : " + num);
		
//		int num2 = 100000000000; //literal 문제, 넣는다 가 아니고 숫자의 문제
//		 The literal 100000000000 of type int is out of range
		int num2 = 10000 ;
		
		
		long num3 =100;
		// 컴파일러가 캐스팅 해줌
		// long num3 = (long)100;
		// 암시적 형변환 - 컴파일러에서 알아서 처리
		// 작은 타입에 큰 타입 넣는 것은 당연하다
		
		// 초보 개발자 주의사항
//		int num4 = 10000000000L; type 미스매치
		long num4 = 100000000L; // 해결방법 1 
		
		//개발자의 의도적인 명시적 형변환(타입 변환, casting)
		int num5 = (int)1000000000000000L;
		// 강제 형 변환 시 데이터의 손실 및 이상하게 나옴, 쓰레기 값 고스트값
		System.out.println("num5 " + num5);
		
//		int num6 = 10000L; // 타입 에러
		int num6 = (int) 10000L; //우연하게 데이터 손실이 없음(타입과 데이터 표현 사이즈가 맞음)
		
		
		//char 범위 0~ 65,535
		//아스키 코드표 ( a 문자 > 65 )
		char ch = '가';
		System.out.println(ch);
		
		ch = 'a';
		ch  ='A';
		
		//char 정수 타입 (문자를 저장하지만 내부적으로 정수값을 가지고 있다)
		int chint = ch;
		System.out.println("ch 문자를 정수 값으로 보면 : " + chint);
		// A 는 65라서 65 출력
		
		char chint2 = 'a';
		System.out.println(chint2);
		
		//int intch2 = (int) chint2; 명시적 형변환
		
		int intch3 = 65;
//		char ch3 = intch3; // type 미스매치, 1바이트짜리를 4바이트로 넣으려고 함
		
		//1 해결방법 (char) 타입 캐스팅
		//2 해결방법 int ch3 = intch3;
		
		String name = "홍길동";
		name = "홍길동 바보";
		String path = "c:\\temp";
		System.out.println(path);
		
		double data4 = 100.6;
		int number = 100;
		int result2 =(int) data4 + number;
		
		System.out.println(result2);
		
		int number2 = 100;
		byte b2 = (byte)number2;
		int b3 = number2;
		
		System.out.println(b3);
	}
}
