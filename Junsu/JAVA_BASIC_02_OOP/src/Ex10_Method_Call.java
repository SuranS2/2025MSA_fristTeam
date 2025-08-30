/*
void m(int x){
	x값 출력 : 100
	x = 11111;
}

m(100)
call by value
함수의 parameter에다 값을 전달 or 주소값 전달(참조값) Ref 전달

class Car{}

void m2(Car c){ //c parameter Car 라는 객체의 주소값을 받는다
	c.carName = "포드" ;
}

Car car = new Car();

m2(car);
car.carName => 포드

Call by ref 라고 함
*/

class Data{
	int i;
}

public class Ex10_Method_Call{
	static void scall(Data sdata){
		System.out.println("함수 : " + sdata.i); // sdata > 0xabc
		sdata.i = 1111; // => 0xabc.i
	}
	static void vcall(int x) { // 정수값을 받겠다
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : "  + x);
	}
	public static void main(String[] args){
		Data d = new Data(); // d라는 변수는 : 0xabc 번지
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		Ex10_Method_Call.scall(d); // 0xabc번지
		System.out.println("d.i : " + d.i);
		
		Ex10_Method_Call.vcall(d.i);
		System.out.println("after d.i : " + d.i); // => 1111
		
		// 함수에서 값을 전달, 주소값 전달의 차이
	}
}