import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}
class Test3 extends Test2{
	int x = 300; // 멤버필드 숨기기, 부모 무시하기(쓰지 말길)
}
public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		System.out.println(test3.x); // 300
		
		Emp emp = new Emp(7788, "smith");
		System.out.println(emp); // .ToString() 생략
		System.out.println(emp.toString());
	}
}