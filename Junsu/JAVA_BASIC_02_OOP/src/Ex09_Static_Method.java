
public class Ex09_Static_Method {
	void method() {
		System.out.println("나 일반 메소드");
	}
	static void smethod() {
		System.out.println("나 static 메소드");
	}

	public static void main(String[] args) {
		Ex09_Static_Method.smethod();
		Ex09_Static_Method ex09= new Ex09_Static_Method();
		ex09.method();

	}

}
