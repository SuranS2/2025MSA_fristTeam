import kr.or.kosa.Person;

class Test{
	int i;
	int j;
	void print() {
		System.out.println(i);
	}
}

public class Ex01_Ref_Type {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "홍길동";
		person.age = 100;
		person.power = true;
		
		person.personPrint();
		
		//결과
		
		System.out.println(person);
		//kr.or.kosa.Person@2a18f23c (왜 컴퓨터마다 같지? => 자바의 룰에 따라 메모리가 자동으로 할당되어서 그럼) 조합된 ...  주소값
		//kr.or.kosa.person + "@" + 16진수값
		System.out.println(person.toString());
		//toString() Object 조상객체
		Person person2 = person; // 주소값 할당, person person2는 동거, 같은 집에 살고있다
		System.out.println(person2);
		if(person==person2) {
			System.out.println("p1 p2는 같은 주소에 있어요");
		}
	}
}
