public class Ex01_Exception{
	public static void main(String[] args){
		System.out.println("main start");
//		System.out.println(0/0; // java.lang.ArithmeticException: / by zero 자바는 0 나누기 X
//		System.out.println("main end"); 출력이 되지 않음
		try{
			System.out.println(0/0);
		}catch(Exception e){ // e라고 하는 참조변수가 예외 객체의 주소값을 받는다(다형성)
		// 문자 파악만 가능(코드를 고치는 것은 아님)
		//	System.out.pritnln(e.getMessage());
			e.printStackTrace(); //상세한 정보
		}
		System.out.println("main 함수 여기까지 가요");

	}

}