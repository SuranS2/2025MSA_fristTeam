/*
 클래스는 설계도 데이터타입
 
 하나의 물리적인 자바 파일에 여러개의 클래스를 생성할 수 있을까?
 => 있다, 메인은 1개.
 
 클래스 안 클래스 이너클래스 잘 안씀(연습과 문법 이해할때만 사용)
 
 원칙적으론 패키지 기반으로 작업해야함
 SOLID중 S
 SRP(Single Responsibility Principle): 단일 책임 원칙
으로 인해 단일 클래스 단위로 작업하게 됨
 
 */

class Apt{
	/*
		 설계도 (데이터 타입: 사용자 정의 타입)
		 설계도는 구체화 되지 않으면 의미가 없다(종이와 같다)
		 목적 : Apt 설계도로 똑같은 아파트 무한히 생산
		 설계도의 목적 : *재사용성*
		 
	 */
	String doorColor; //default 접근 제어자는 public이어서 다른 클래스에서 사용할 수 있음
}

/*
 javac Object_variable.java > Object_variable.class
 java Object_variable
 
 1. JVM > OS > 빌려줘 > memory
 2. memory 정리(자료구조) 할당
 3. main 함수 실행
 */


public class Ex04_Object_Variable {
	public static void main(String[] args) {
		Apt apt = new Apt();
		System.out.println(apt.doorColor);
		
	}
}
