class Car{
	String carName = "포니";
	
	public Car(){
		System.out.println("나는 기본 생성자 함수");
		carName="포르쉐 911";
	}
}

class School{
	String schoolName = "강남";
	//default 생성자 생략(컴파일러가 자동 생성하는 구나) public School() { }
}

class Car2{
	String carName;
}
class Car3{
	String carName;
	public Car3(){ //default constructor method
		carName = "포니"; //carName 초기화
	}
}
class Car4{
	String carName;
	public Car4() { //default
		carName="기본포니";
	}
	public Car4(String name){ // 생성자 overloading
		carName = name;
	}
	// Car4 사용하는 개발자에게 선택권 부여 (default, overloading)
}
class Car5{
	String carName;
	// 만약 개발자가 생성자 overloading을 1개라도 한다면
	// default constructor 생성 X
	public Car5(String name){ 
		carName = name;
	}
}

public class Ex12_Constructor{
	public void main(String args[]){
		Car car = new Car(); //default 함수 호출
		System.out.println(car.carName);
	}
}