/*
 instance variable >> class Car{ private String color;}
 >> 생성되는 객체마다 다른 값을 가질 수 있다.
 >> 만약 초기값을 설정한다면 어떤 의미 : 기본적으로 어떤 값을 초기화하겠다( private String color = "black")
 
 local variable >> class Car { public void move(){ int speed = 0 ; 반드시 초기화 } }
 
 >> public static void main(String[] args) { 선언된 변수 지역변수 초기화 }
 
 block variable >> class Car { pbulic void move { for(int i =0 ...) {} for(int i = 0)
 
 static variable >> 공유자원( heap 생성된 객체간 공유자원 )
 1. 객체 생성 이전에 memory에 올라가는 자원(클래스(메서드 ) 영역
 2. 설계도 > 구체화 (메모리) 올리는 방법은 new
 3. static 자원은 new 없이도 메모리에 올라간다.(메모리에 올라가면 "사용 가능")
 
 */
class VariableClass{
	int iv;
	/*
	 1. member field, instance variable
	 2. iv 언제 사용가능할까?(메모리에 언제 올라갈까?)
	 2.1 VariableClass V = new VariableClass(); >> heap 객체 생성 >> 객체 안에 iv 생성
	 3. 목적 : 데이터(정보) 자료 담을 목적  
	 3.1 정보 : 고유정보, 상태정보, 부품정보(class)
	 
	 - 생성되는 객체마다 다른 값을 가질 수 있다
	 -그래서 초기화를 해서 값을 강제하지 않는다
	 -default 값
	 int > 0 , double > 0.0, char > 빈문자 '\u0000' , boolean false
	 String > null , Car or Emp > null
	 */
	static int cv;
	/*
	 1. class variable(클래스 변수) 일반적으로 static variable(객체간 공유자원)
	 2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
	 3. 접근 방법
	 3.1 클래스 이름.static변수명 > VariableClass.cv ( new 하기 전에 메모리에...)
	 3.2 VariableClass v = new VariableClass(); > v.cv
	 		VariableClass v2 = new VariableClass(); > v2.cv
	 		>> v.cv == v2.cv (같은 주소)
            ***생성시점 및 과정***
            Hello.java > javac Hello.java > Hello.class
            > java.exe Hello 엔터 실행
            > JVM > OS > Memory 빌림 > 정리(영역을 나눔) > class Loader System 분석
            >클래서 정보(metadata:설명) >> class area(method area)
            메모리에 올림(언제, 어떤 자원, 버전...)
            >그 클래스안에 [static variable] 또는 [static method] 있다면
            > 두 녀석을 class area(method area) 영역에 할당합니다.
            > 그런데 함수의 이름이 만약에 main() 이라면 정해진 규칙에 따라서 실행함(Stack 영역 자원 할당)
	 */
	
	void method() { //default void method()
		int lv = 0; // local variable(함수안에 들어있는 지역변수, 사용 전 반드시 초기화 필요)
      //생명주기 메서드와 함께
        
		for(int i = 0; i <= 100; i++) {
			
		}
	}
}

public class Ex05_Variable_Scope {
	
	public int data; // >> main 함수에서 사용 불가능, 초기 메모리에 올라가있지 않음.

	public static void main(String[] args) {
		Ex05_Variable_Scope ex05 = new Ex05_Variable_Scope();
		System.out.println(ex05.data);
		ex05.main(args);//메인 자원도 부를 수 있음

        VariableClass.cv = 100;
        VariableClass vc = new VariableClass();
        vc.iv = 200;
        vc.method();
        vc.cv = 200; // 공유자원 cv의 값을 바꿔버린 것

	}

}
