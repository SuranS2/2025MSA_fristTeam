package kr.or.kosa;

//Ŭ������ �������
//�Ӽ� + ���
//member field(����, ����, ��ǰ) + method(���,����) + constructor(������ �Լ�)
public class Person {
	//---member field ---
	public String name; //instance variable ��ü ����, �����Ǵ� ��ü���� ����(�ٸ� ���� ���� �� �ִ�)
	public int age; //default value(�⺻��) > 0
	public boolean power; //default value(�⺻��) > false
	
	// --- method ---
	
	public void personPrint() {
		System.out.printf("�̸��� %s ���̴� %d �Ŀ��� %s �Դϴ� \n", name, age, power);
	}
	
}
/*
 1. instance variable �ʱ�ȭ ���� �ʾƵ��ȴ� >> why >> default ��
 �ʱ�ȭ : ������ ó������ ���� �Ҵ� �޴� ��
 
 2. instance variable �ʱ�ȭ �ص� �ɱ��? >> yes >> �ʿ信 ���� �⺻���� ������ ����� �����ϴ�, �⺻�� => ����� ����
 
 3. Today Point : �� �ʱ�ȭ�� �� ���� ������? >> �����Ǵ� ��ü���� �ٸ� ���̸� ������ ���� ������? => �����ڷ�.
 
 4. �����ڴ� ��� �ʵ� �ʱ�ȭ�� �������� �ִ� ��
  
 */
