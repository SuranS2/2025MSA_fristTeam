public class Ex01_Exception{
	public static void main(String[] args){
		System.out.println("main start");
//		System.out.println(0/0; // java.lang.ArithmeticException: / by zero �ڹٴ� 0 ������ X
//		System.out.println("main end"); ����� ���� ����
		try{
			System.out.println(0/0);
		}catch(Exception e){ // e��� �ϴ� ���������� ���� ��ü�� �ּҰ��� �޴´�(������)
		// ���� �ľǸ� ����(�ڵ带 ��ġ�� ���� �ƴ�)
		//	System.out.pritnln(e.getMessage());
			e.printStackTrace(); //���� ����
		}
		System.out.println("main �Լ� ������� ����");

	}

}