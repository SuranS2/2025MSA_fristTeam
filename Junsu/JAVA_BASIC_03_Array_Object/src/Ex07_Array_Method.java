class Human{
	String name;
}
class OverClass{
	int add(int i, int j) {
		return i + j;
	}
	void add(Human human) { // Human 객체의 주소값을 받겠다 => new 로 생성된 것
		/*
		 * 1. add(new Hauman())
		 * 2. Human h = new Human(); add(h);
		 * 이 두 가지는 기본적으로 무조간 활용할 줄 알아야함
		 */
		System.out.println(human.name);
	}
	int add(int param) {
		return param + 100;
	}
	//Point
	int[] add(int[] params) { // 지역변수 params , target => stack에 생성됨
		int[] target = new int[params.length]; // target이라는 이름으로 heap에 객체가 생성되었음
		for(int i = 0; i < target.length ; i++){
			target[i] = params[i] + 1;
		}
		return target; // 배열은 객체, 리턴 후 stack 제거 - 힙 메모리의 target은 가비지 컬렉터로
	}
	
}
public class Ex07_Array_Method {

	public static void main(String[] args) {
		OverClass overclass = new OverClass();
		int[] source = {10,20,30,40,50};
		// overclass.add(int[] params); // 인트 배열을 던져줘야한다 => 인트 배열을 생성해야겠구나
		int[] ta = overclass.add(source);
		for(int value : ta) {
			System.out.println(value);
		}	
	}
}
