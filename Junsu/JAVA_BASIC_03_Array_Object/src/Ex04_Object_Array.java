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
		p.name = "홍길동";
		p.age = 100;
		//Person 타입의 사람 3명을 만들어라
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		//이상 초보자, 같은 형태의 자료형이 반복되면 배열을 선언하자!
		
		Person[] persons = new Person[3]; //배열만 선언하고 각 person마다 초기화 및 생성 X
		persons[0] = new Person(); // 객체 배열은 선언과 할당을 두 번 해야함!
		persons[2] = new Person();
		persons[2].name = "김유신";
		persons[2].age = 100;
		
		// 1. 10개의 객체 배열 생성 후 초기화
		Person[] parray = new Person[10];
		for(int i = 0 ; i < parray.length ; i++){
			parray[i] = new Person();
			System.out.println("주소값 : " + parray[i]);
		}
		// 2. int[] arr = new int[]{10,20,30};
		Person[] parray2 = new Person[] { new Person(), new Person()};
		
		// 3. int[] arr = {10,20}
		Person[] parray3 = { new Person(), new Person() };
	}
}