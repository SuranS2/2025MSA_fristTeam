
public class Ex05_Operation {
	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 1;
		
		int b3 = b1 + b2++;
		
		System.out.println(b3);
		System.out.println(b3);
		
		long lo = 100000L;

		float fo = 1.2f;
		
		float  result = lo + fo;//해결
		System.out.println(result);
		
		if(10==10.0f) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if('A' != 65) {
			//같지 않으면
			System.out.println("같지 않다 : true");
		}else {
			//같다면
			System.out.println("같다 : false");
		}
		
		//Today Point
		//연산자 중에서 제어문 역할(조건 , 반복)
		//삼항연산자
		
		int p = 10;
		int k = -10;
		
//		int result5 = 조건식 ? 참 : 거짓;
		int result5 = (p == k)? p : k ;
		System.out.println(result5);
		
		//if문으로 바꿔보기 int result5 = (p == k)? p : k ;
		int result6 = 0;
		if(p==k) {
			result6 = p;
		}else {
			result6 = k;
		}
		System.out.println(result6);
		
		/*
		 진리표(논리연산)
		 0 : 거짓(false)
		 1 : 참 (true)
		 OR 연산 , AND 연산
		 
		 DB쿼리
		 SQL 자연어 ...
		 select * from emp where job='IT' and sal > 3000
		 select * from emp where job='IT' or sal > 3000
		 
		 */
		
		int x =3;
		int y = 5;
		//비트연산 십진수 >> 이진수 바꾸어서 연산 or , and 진리표 기준)
		System.out.println("x |y : OR 연산" + (x|y));
		
		/*
		 256 128 64 32 16 8 4 2 1
		 									0 0 1 1 >> 3
		 									0 1 0 1 >> 5
		 									0 1 1 1 >> 비트 OR연산
		 									> 4+2+1 >> 7
		256 128 64 32 16 8 4 2 1
											0	0	1	1 >> 3
											0 1 0 1 >> 5
											0 0 0 1 >> 비트 AND 연산
											> 1 >> 1
		 */
		//비트 연산 (영상처리, 판독)
		
		int data = 90;
		switch(data) {
			case 100: System.out.println("100입니다");
			case 90: System.out.println("100입니다");
			case 80: System.out.println("100입니다");
			default : System.out.println("일치하는 값이 없어요.");
		}
		//브레이크 없는 스위치 문 case 90~default까지 출력
		switch(data) {
			case 100: System.out.println("100입니다");
				break;
			case 90: System.out.println("100입니다");
				break;
			case 80: System.out.println("100입니다");
				break;
			default : System.out.println("일치하는 값이 없어요.");
		}
		//브레이크로 스위치 탈출 시켜줌
		
		
	}
		
}
