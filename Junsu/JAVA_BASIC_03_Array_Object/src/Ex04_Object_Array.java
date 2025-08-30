class Person{
	String name;
	int age;
	/*
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	*/
	
	void print(){
		System.out.println(this.name + " : " + this.age);
	}
}

public class Ex04_Object_Array{
	public static void main(String[] args){
		int[] intarr = new int[10];
		// [0][0][0]...[0][0] rkqt (default)
		boolean[] boolarr = new boolean[5]; // [false][false] ...
		
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 100;
		//Person Ÿ���� ��� 3���� ������
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		//�̻� �ʺ���, ���� ������ �ڷ����� �ݺ��Ǹ� �迭�� ��������!
		
		Person[] persons = new Person[3]; //�迭�� �����ϰ� �� person���� �ʱ�ȭ �� ���� X
		persons[0] = new Person(); // ��ü �迭�� ����� �Ҵ��� �� �� �ؾ���!
		persons[2] = new Person();
		persons[2].name = "������";
		persons[2].age = 100;
		
		// 1. 10���� ��ü �迭 ���� �� �ʱ�ȭ
		Person[] parray = new Person[10];
		for(int i = 0 ; i < parray.length ; i++){
			parray[i] = new Person();
			System.out.println("�ּҰ� : " + parray[i]);
		}
		// 2. int[] arr = new int[]{10,20,30};
		Person[] parray2 = new Person[] { new Person(), new Person()};
		
		// 3. int[] arr = {10,20}
		Person[] parray3 = { new Person(), new Person() };
	}
}