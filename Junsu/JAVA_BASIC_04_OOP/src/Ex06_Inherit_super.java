//import kr.or.kosa.Apt;
//
//class Base{
//	String basename;
//	Base(){
//		System.out.println("�θ��� �⺻ ������");
//
//	}
//	Base(String basename){
//		this.basename = basename;
//		System.out.println("basename: " + basename);
//	}
//	void method(){
//		System.out.println("�θ� method");
//	}
//}
//
//class Derived extends Base{
//	String dname;
//	Derived(){
//		System.out.println("�ڽ� Ŭ���� �⺻ ������");
//	}
//	Derived(String dname){
//
//		super(dname); // �θ��� �����ڸ� ȣ���ϴ� super()
//		this.dname = dname;
//		System.out.println("dname : " + this.dname);
//	}
//	@Override
//	void method(){
//		System.out.println("�θ� method�� �������Ͽ���");
//	}
//	void parantMethod(){
//		super.method(); // �θ� �ڿ��� ����
//	}
//}
//
//
//public class Ex06_Inherit_super {
//
//	public static void main(String[] args) {
////		Derived d = new Derived();
//		Derived d = new Derived("ȫ�浿");
//		d.method(); // �ڽ��� �޼��尡 ȣ���
//		d.parantMethod();
//
//		Apt apt = new Apt();
//		apt.setDoor(1000);
//		System.out.println(apt.getDoor());
//	}
//}