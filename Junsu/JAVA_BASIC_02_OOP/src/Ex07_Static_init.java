///*
// static �ʱ�ȭ
// 1. static variable : ��ü���� ���� ���� ������ �ž�
// 2. instance variable : �����Ǵ� ��ü���� �ٸ� ���� ������ ���ٴ�
// �� �ڿ��� default ��(�ʱ�ȭ �� �ʿ� ����)
// */
//
//class Test2{
//	static int cv = 10 ; // �ʱ�ȭ
//	static int cv2; // default 0
//
//	int iv = 9;
//
//	//static �ʱ�ȭ �� static {}
//	static {
//		//����Ǵ� ���� : static int cv = 10; static int cv2; �޸𸮿� �ö� ���� �ڵ� ȣ��(����) �� �ַ� ����
//		//�޼ҵ带 ���� �� ������ "�ʱ�ȭ"�� �����̱� ������ �޼ҵ�� ������ ����
//		//** ���۵� ǥ���� ���� **
//		cv2 = cv + 2222;
//		// �����ڴ� ��ü�� �����Ǿ��� �� �ʱ�ȭ ����, static�� ��ü ���� ������ ��밡��
//		// iv = 11; //���� , iv�� ��ü ���� ������ �۾��� ���� ����
//	}
//	//�Ϲ� �ڿ� (�ʱ�ȭ) : �Ϲ��ڿ��� �ʱ�ȭ �� {} -> ���� ������ ����... (�α���� ���)
//	//���� ���� : ��ü�� �����Ǿ��� �� -> heap ���� ���� -> member field �ö� -> �ڵ����� �ʱ�ȭ �� ����
//	//�Ϲ� �ʱ�ȭ ���� static �ڿ� ���ٰ���
//	{
//		System.out.println(" �ʱ�ȭ ���� ���� ");
//		if(iv < 10) {
//			iv = 10000;
//			System.out.println("iv = " + iv);
//		}
//	}
//}
//public class Ex07_Static_init {
//
//	public static void main(String[] args) {
//		System.out.println(Test2.cv);
//		System.out.println(Test2.cv2);
//		//�ʱ�ȭ(�Ϲ�)
//		Test2 test = new Test2();
//		System.out.println(Test2.cv);
//		System.out.println(Test2.cv2);
//	}
//
//}
