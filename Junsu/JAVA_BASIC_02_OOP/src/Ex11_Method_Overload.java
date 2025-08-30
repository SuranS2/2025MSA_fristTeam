class Human{
	String name;
	int age;
}
class OverT{
	int add(int i) {
		return 100 + i;
	}
	int add(int i , int j) {
		return i + j;
	}
	String add(String str) {
		return "hello"+str;
	}
//	int add(String str) {return 100;} // 사용 불가 파라미터 값 신경 쓸 것
	String add(int i , String s) {//파라미터의 순서가 다름을 인정함
		return "hello" + s;
	}
	String add(String s, int i ) { //파라미터의 순서가 다름을 인정함
		return "hello" + s;
	}
	//Today Point
	void add(Human human) { //참조타입도 overloading의 파라미터로 활용 가능
		human.age = 100; 
		human.name = "홍길동"; 
	}
	void add(Human h, Human h2) {
		System.out.println("h : " + h + " h2 : " + h2);
	}
}
public class Ex11_Method_Overload {

	public static void main(String[] args) {
		OverT overt = new OverT();
		System.out.println(overt.add("A"));
		System.out.println(overt.add('A')); // 165 => integer로 인식해서 적용됨
		
//		overt.add(10.1f); 불가능
		//1. 초급, 참조타입 변수에 집어넣어 ref 전달
		Human human = new Human();
		overt.add(human);
		
		//2. 초급, 바로 객체 생성하여 ref 전달
		overt.add(new Human());
		
		overt.add(new Human(), new Human());
		overt.add(human, new Human());
	}

}
