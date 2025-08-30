/*
 static member field : ��ü�� ���� �ڿ�
 static method : ��ü�� ���� �޼ҵ�
 
 1. ���赵
 1.1 static �ڿ� ( ����, �Լ�) 
 - ��ü ���� ���� ����ض�
 - ���ϰ� ������ ���
 - ** ���� ����ϴϱ�  : System.out (Static Final printStream ��ü�� public �ڿ���)
 - �ڿ��� ���� ����� �� ���� : new ���� ���� ���ٰ�
 - ���ø����̼��� ���� ������ �ڿ��� ��������
 static�� class method area�� �ö󰡱� ������ �������÷��Ͱ� ���������� ����
 */

class StaticClass{
	int iv;
	static int cv;
	static void print() {
		// instance variable ���� �Ұ�
		System.out.println("static method");
	}
	void printIv() {
		// �Ϲ� �Լ�, StaticClass�� new�� ���� heap �޸𸮿� �ö����� ��� ����
		// cv�� ������ �� ����
		cv = 100; // ������ static �ö󰡰� �� �� �ö� ��Ȳ
	}
	// ���踦 �� �𸣰����� �������� ���Ķ� static�� static , �Ϲ� �Լ��� �Ϲ� �Լ�
}
//static �ڿ��� �Ϲ� �ڿ��� �������踦 �˾ƾ��Ѵ�

public class Ex08_Static_Method {
	public static void main(String[] args) {
		StaticClass.print();
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv); // 100
	}
}
