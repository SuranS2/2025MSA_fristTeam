//import kr.or.kosa.Person;
//
//class Test{
//	int i;
//	int j;
//	void print() {
//		System.out.println(i);
//	}
//}
//
//public class Ex01_Ref_Type {
//	public static void main(String[] args) {
//		Person person = new Person();
//		person.name = "ȫ�浿";
//		person.age = 100;
//		person.power = true;
//
//		person.personPrint();
//
//		//���
//
//		System.out.println(person);
//		//kr.or.kosa.Person@2a18f23c (�� ��ǻ�͸��� ����? => �ڹ��� �꿡 ���� �޸𸮰� �ڵ����� �Ҵ�Ǿ �׷�) ���յ� ...  �ּҰ�
//		//kr.or.kosa.person + "@" + 16������
//		System.out.println(person.toString());
//		//toString() Object ����ü
//		Person person2 = person; // �ּҰ� �Ҵ�, person person2�� ����, ���� ���� ����ִ�
//		System.out.println(person2);
//		if(person==person2) {
//			System.out.println("p1 p2�� ���� �ּҿ� �־��");
//		}
//	}
//}
