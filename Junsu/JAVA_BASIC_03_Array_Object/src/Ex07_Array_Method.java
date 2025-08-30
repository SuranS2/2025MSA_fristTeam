//class Human{
//	String name;
//}
//class OverClass{
//	int add(int i, int j) {
//		return i + j;
//	}
//	void add(Human human) { // Human ��ü�� �ּҰ��� �ްڴ� => new �� ������ ��
//		/*
//		 * 1. add(new Hauman())
//		 * 2. Human h = new Human(); add(h);
//		 * �� �� ������ �⺻������ ������ Ȱ���� �� �˾ƾ���
//		 */
//		System.out.println(human.name);
//	}
//	int add(int param) {
//		return param + 100;
//	}
//	//Point
//	int[] add(int[] params) { // �������� params , target => stack�� ������
//		int[] target = new int[params.length]; // target�̶�� �̸����� heap�� ��ü�� �����Ǿ���
//		for(int i = 0; i < target.length ; i++){
//			target[i] = params[i] + 1;
//		}
//		return target; // �迭�� ��ü, ���� �� stack ���� - �� �޸��� target�� ������ �÷��ͷ�
//	}
//
//}
//public class Ex07_Array_Method {
//
//	public static void main(String[] args) {
//		OverClass overclass = new OverClass();
//		int[] source = {10,20,30,40,50};
//		// overclass.add(int[] params); // ��Ʈ �迭�� ��������Ѵ� => ��Ʈ �迭�� �����ؾ߰ڱ���
//		int[] ta = overclass.add(source);
//		for(int value : ta) {
//			System.out.println(value);
//		}
//	}
//}
