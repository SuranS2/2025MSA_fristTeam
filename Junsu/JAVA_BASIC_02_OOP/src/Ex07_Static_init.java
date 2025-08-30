/*
 static 초기화
 1. static variable : 객체마다 같은 값을 공유할 거야
 2. instance variable : 생성되는 객체마다 다른 값을 가지고 가곘다
 두 자원은 default 값(초기화 할 필요 없다)
 */

class Test2{
	static int cv = 10 ; // 초기화
	static int cv2; // default 0
	
	int iv = 9;
	
	//static 초기화 블럭 static {}
	static {
		//실행되는 시점 : static int cv = 10; static int cv2; 메모리에 올라간 직후 자동 호출(실행) ㅡ 주로 사용됨
		//메소드를 넣을 수 있으나 "초기화"가 목적이기 때문에 메소드로 사용되지 않음
		//** 조작된 표현이 가능 **
		cv2 = cv + 2222;
		// 생성자는 객체가 생성되었을 때 초기화 가능, static은 객체 생성 전부터 사용가능
		// iv = 11; //오류 , iv는 객체 생성 전까지 작업이 되지 않음
	}
	//일반 자원 (초기화) : 일반자원의 초기화 블럭 {} -> 차라리 생성자 쓰지... (인기없는 기능)
	//실행 시점 : 객체가 생성되었을 때 -> heap 영역 생성 -> member field 올라감 -> 자동으로 초기화 블럭 실행
	//일반 초기화 블럭은 static 자원 접근가능
	{
		System.out.println(" 초기화 블럭이 실행 ");
		if(iv < 10) {
			iv = 10000;
			System.out.println("iv = " + iv);
		}
	}
}
public class Ex07_Static_init {

	public static void main(String[] args) {
		System.out.println(Test2.cv);
		System.out.println(Test2.cv2);
		//초기화(일반)
		Test2 test = new Test2();
		System.out.println(Test2.cv);
		System.out.println(Test2.cv2);
	}

}
