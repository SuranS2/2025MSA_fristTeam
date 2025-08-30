package kr.or.kosa;
//요구사항 주석작성 : 클래스 설계 만족, 최소한의 조건
//정보(변수 - 고유정보+상태정보) + 행위 => 설계도라고 할 수 있음 > 데이터 타입

//자동차는 문의 개수를 가지고 있다
//자동차는 색상을 가지고 있다.
public class Car {
	//고유 속성 - member field , instance variable
	private int door; // 캡슐화 되어있는 상태
	private String color;
	//캡슐화 된 자원을 다루는 RW의 특수한 목적의 기능 함수가 필요(method)
	//추상화 - 일반화 
	//setter, getter 사용 가능한데 어노테이션 사용하면 프로그램이 굉장히 추상화 됨(생략)
	public int getDoor() {
		return door;
	}
	// 간접 할당
	public void setDoor(int door) {//파라미터 인자-인수
		this.door = door;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void carInfoPrint() {
		System.out.println(door + color);
	}

}
