public class Ex02_Exception {
	public static void main(String[] args) {
		System.out.println("main start");
		int num = 100;
		int result = 0;
		try {
			for(int i = 0; i < 10 ; i++) {
				result = num / (int)(Math.random() * 10); // 0~9 => 0이 나오면 에러
				System.out.println("result : " + result + " i : " + i);
			}
			System.out.println("main end");
		}catch( Exception e ) { // ArithmeticException e 를 넣어서 에러를 구체적으로 명시해 주는 것이 좋으나, 잘 모르면 Exception으로 캐치
			//문제의 원인을 파악하겠다 ...
			System.out.println("문제 발생 관리자에게 알려주세요");
			System.out.println("원인 " + e.getMessage() );
		}
		System.out.println("main end");
	}
}