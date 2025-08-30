package kr.or.kosa;

//클레스의 구성요소
//속성 + 기능
//member field(고유, 상태, 부품) + method(기능,행위) + constructor(생성자 함수)
public class Person {
	//---member field ---
	public String name; //instance variable 객체 변수, 생성되는 객체마다 생성(다른 값을 가질 수 있다)
	public int age; //default value(기본값) > 0
	public boolean power; //default value(기본값) > false
	
	// --- method ---
	
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d 파워는 %s 입니다 \n", name, age, power);
	}
	
}
/*
 1. instance variable 초기화 하지 않아도된다 >> why >> default 값
 초기화 : 변수가 처음으로 값을 할당 받는 것
 
 2. instance variable 초기화 해도 될까요? >> yes >> 필요에 따라 기본값을 설정해 사용이 가능하다, 기본값 => 상수로 설정
 
 3. Today Point : 왜 초기화를 잘 하지 않을까? >> 생성되는 객체마다 다른 나이를 가지고 있지 않을까? => 생성자로.
 
 4. 생성자는 멤버 필드 초기화의 강제성을 주는 것
  
 */
