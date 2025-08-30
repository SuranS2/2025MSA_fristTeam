class Pbase{
	int p = 100;
}
class Cbase extends Pbase{
	int c = 200;
}

class Dbase  extends Pbase{
}

public class Ex11_Inherit_Polymorphism {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		Pbase pbase = cbase; 
		//다형성
		//1. 부모는 자신의 자원만 볼 수 있다
		//2. 재정의 자원은 자식 것을 본다
		Dbase dbase = new Dbase();
		pbase = dbase;
		
		//부모 주소를 자식에게 전달 할 수 있을까?
//		Cbase ccc = pbase; // 타입 에러라고 볼 수 있음!
		Cbase ccc = (Cbase)pbase; // 자식타입 다운캐스팅을 통해 우겨넣을 수 있음 => 비추천
	}
}
