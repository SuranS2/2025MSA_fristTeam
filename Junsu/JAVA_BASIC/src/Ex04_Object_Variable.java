/*
 Ŭ������ ���赵 ������Ÿ��
 
 �ϳ��� �������� �ڹ� ���Ͽ� �������� Ŭ������ ������ �� ������?
 => �ִ�, ������ 1��.
 
 Ŭ���� �� Ŭ���� �̳�Ŭ���� �� �Ⱦ�(������ ���� �����Ҷ��� ���)
 
 ��Ģ������ ��Ű�� ������� �۾��ؾ���
 SOLID�� S
 SRP(Single Responsibility Principle): ���� å�� ��Ģ
���� ���� ���� Ŭ���� ������ �۾��ϰ� ��
 
 */

class Apt{
	/*
		 ���赵 (������ Ÿ��: ����� ���� Ÿ��)
		 ���赵�� ��üȭ ���� ������ �ǹ̰� ����(���̿� ����)
		 ���� : Apt ���赵�� �Ȱ��� ����Ʈ ������ ����
		 ���赵�� ���� : *���뼺*
		 
	 */
	String doorColor; //default ���� �����ڴ� public�̾ �ٸ� Ŭ�������� ����� �� ����
}

/*
 javac Object_variable.java > Object_variable.class
 java Object_variable
 
 1. JVM > OS > ������ > memory
 2. memory ����(�ڷᱸ��) �Ҵ�
 3. main �Լ� ����
 */


public class Ex04_Object_Variable {
	public static void main(String[] args) {
		Apt apt = new Apt();
		System.out.println(apt.doorColor);
		
	}
}
