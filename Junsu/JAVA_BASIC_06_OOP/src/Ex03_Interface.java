interface Ia{
	public static final int AGE = 100;
	public static final String GENDER = "남";
	public abstract String print();
	public abstract void message(String str);	
}
interface Ib{
	int AGE = 100;
	String GENDER = "남";
	String print();
	void message(String str);	
}
interface Ic{
}

class Test2 implements Ib{
	@Override
	public String print(){
		return null;
	}
	@Override
	public void message(String str){
	}
}

public class Ex03_Interface{
	public static void main(String[] args){
		Test2 t2 = new Test2();
		Ib ib = t2; // 부모타입 (Ib) 참조변수는 자식 객체의 주소값을 가질 수 있다.
		
		//재정의된 메서드는 t2 구현된 함수 호출
	}
}