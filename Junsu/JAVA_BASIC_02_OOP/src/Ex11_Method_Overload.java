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
//	int add(String str) {return 100;} // ��� �Ұ� �Ķ���� �� �Ű� �� ��
	String add(int i , String s) {//�Ķ������ ������ �ٸ��� ������
		return "hello" + s;
	}
	String add(String s, int i ) { //�Ķ������ ������ �ٸ��� ������
		return "hello" + s;
	}
	//Today Point
	void add(Human human) { //����Ÿ�Ե� overloading�� �Ķ���ͷ� Ȱ�� ����
		human.age = 100; 
		human.name = "ȫ�浿"; 
	}
	void add(Human h, Human h2) {
		System.out.println("h : " + h + " h2 : " + h2);
	}
}
public class Ex11_Method_Overload {

	public static void main(String[] args) {
		OverT overt = new OverT();
		System.out.println(overt.add("A"));
		System.out.println(overt.add('A')); // 165 => integer�� �ν��ؼ� �����
		
//		overt.add(10.1f); �Ұ���
		//1. �ʱ�, ����Ÿ�� ������ ����־� ref ����
		Human human = new Human();
		overt.add(human);
		
		//2. �ʱ�, �ٷ� ��ü �����Ͽ� ref ����
		overt.add(new Human());
		
		overt.add(new Human(), new Human());
		overt.add(human, new Human());
	}

}
