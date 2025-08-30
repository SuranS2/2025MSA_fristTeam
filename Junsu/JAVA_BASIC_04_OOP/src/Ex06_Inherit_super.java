import kr.or.kosa.Apt;

class Base{
	String basename;
	Base(){
		System.out.println("부모의 기본 생성자");
	
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename: " + basename);
	}
	void method(){
		System.out.println("부모 method");
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("자식 클래스 기본 생성자");
	}
	Derived(String dname){
	
		super(dname); // 부모의 생성자를 호출하는 super()
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	@Override
	void method(){
		System.out.println("부모 method를 재정의하였음");
	}
	void parantMethod(){
		super.method(); // 부모 자원에 접근
	}
}


public class Ex06_Inherit_super {

	public static void main(String[] args) {
//		Derived d = new Derived();
		Derived d = new Derived("홍길동");
		d.method(); // 자식의 메서드가 호출됨
		d.parantMethod();
		
		Apt apt = new Apt();
		apt.setDoor(1000);
		System.out.println(apt.getDoor());
	}
}