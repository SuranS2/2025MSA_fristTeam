/*
 instance variable >> class Car{ private String color;}
 >> �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�.
 >> ���� �ʱⰪ�� �����Ѵٸ� � �ǹ� : �⺻������ � ���� �ʱ�ȭ�ϰڴ�( private String color = "black")
 
 local variable >> class Car { public void move(){ int speed = 0 ; �ݵ�� �ʱ�ȭ } }
 
 >> public static void main(String[] args) { ����� ���� �������� �ʱ�ȭ }
 
 block variable >> class Car { pbulic void move { for(int i =0 ...) {} for(int i = 0)
 
 static variable >> �����ڿ�( heap ������ ��ü�� �����ڿ� )
 1. ��ü ���� ������ memory�� �ö󰡴� �ڿ�(Ŭ����(�޼��� ) ����
 2. ���赵 > ��üȭ (�޸�) �ø��� ����� new
 3. static �ڿ��� new ���̵� �޸𸮿� �ö󰣴�.(�޸𸮿� �ö󰡸� "��� ����")
 
 */
class VariableClass{
	int iv;
	/*
	 1. member field, instance variable
	 2. iv ���� ��밡���ұ�?(�޸𸮿� ���� �ö󰥱�?)
	 2.1 VariableClass V = new VariableClass(); >> heap ��ü ���� >> ��ü �ȿ� iv ����
	 3. ���� : ������(����) �ڷ� ���� ����  
	 3.1 ���� : ��������, ��������, ��ǰ����(class)
	 
	 - �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�
	 -�׷��� �ʱ�ȭ�� �ؼ� ���� �������� �ʴ´�
	 -default ��
	 int > 0 , double > 0.0, char > ���� '\u0000' , boolean false
	 String > null , Car or Emp > null
	 */
	static int cv;
	/*
	 1. class variable(Ŭ���� ����) �Ϲ������� static variable(��ü�� �����ڿ�)
	 2. ���� : ������ ��� �� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�)
	 3. ���� ���
	 3.1 Ŭ���� �̸�.static������ > VariableClass.cv ( new �ϱ� ���� �޸𸮿�...)
	 3.2 VariableClass v = new VariableClass(); > v.cv
	 		VariableClass v2 = new VariableClass(); > v2.cv
	 		>> v.cv == v2.cv (���� �ּ�)
            ***�������� �� ����***
            Hello.java > javac Hello.java > Hello.class
            > java.exe Hello ���� ����
            > JVM > OS > Memory ���� > ����(������ ����) > class Loader System �м�
            >Ŭ���� ����(metadata:����) >> class area(method area)
            �޸𸮿� �ø�(����, � �ڿ�, ����...)
            >�� Ŭ�����ȿ� [static variable] �Ǵ� [static method] �ִٸ�
            > �� �༮�� class area(method area) ������ �Ҵ��մϴ�.
            > �׷��� �Լ��� �̸��� ���࿡ main() �̶�� ������ ��Ģ�� ���� ������(Stack ���� �ڿ� �Ҵ�)
	 */
	
	void method() { //default void method()
		int lv = 0; // local variable(�Լ��ȿ� ����ִ� ��������, ��� �� �ݵ�� �ʱ�ȭ �ʿ�)
      //�����ֱ� �޼���� �Բ�
        
		for(int i = 0; i <= 100; i++) {
			
		}
	}
}

public class Ex05_Variable_Scope {
	
	public int data; // >> main �Լ����� ��� �Ұ���, �ʱ� �޸𸮿� �ö����� ����.

	public static void main(String[] args) {
		Ex05_Variable_Scope ex05 = new Ex05_Variable_Scope();
		System.out.println(ex05.data);
		ex05.main(args);//���� �ڿ��� �θ� �� ����

        VariableClass.cv = 100;
        VariableClass vc = new VariableClass();
        vc.iv = 200;
        vc.method();
        vc.cv = 200; // �����ڿ� cv�� ���� �ٲ���� ��

	}

}
