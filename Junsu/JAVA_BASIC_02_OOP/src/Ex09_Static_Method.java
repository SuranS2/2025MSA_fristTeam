
public class Ex09_Static_Method {
	void method() {
		System.out.println("�� �Ϲ� �޼ҵ�");
	}
	static void smethod() {
		System.out.println("�� static �޼ҵ�");
	}

	public static void main(String[] args) {
		Ex09_Static_Method.smethod();
		Ex09_Static_Method ex09= new Ex09_Static_Method();
		ex09.method();

	}

}
