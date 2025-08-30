import kr.or.kosa.Car;
import kr.or.kosa.Emp;
// 패키지 혹은 네임스페이스라고 부름

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//모든 클래스는 메모리에 올라가야 사용가능
		//현실 아파트 설계도 ( 종이) 구체화 > 땅 집을 짓는 것 > 주소 건물
		
		int i= 10;
		Emp e = new Emp();
		e.empno =7788;
		e.ename = "홍길동";
		e.Info();
		//메모리에 할당
		Car bmwCar = new Car();
		//스트링 클래스라서 null, boolean false, int는 0
		bmwCar.carInfoPrint();
		
		bmwCar.setDoor(2);
		bmwCar.setColor("RED");
		bmwCar.carInfoPrint();
	}

}
