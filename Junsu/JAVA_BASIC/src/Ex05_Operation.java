
public class Ex05_Operation {
	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 1;
		
		int b3 = b1 + b2++;
		
		System.out.println(b3);
		System.out.println(b3);
		
		long lo = 100000L;

		float fo = 1.2f;
		
		float  result = lo + fo;//�ذ�
		System.out.println(result);
		
		if(10==10.0f) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if('A' != 65) {
			//���� ������
			System.out.println("���� �ʴ� : true");
		}else {
			//���ٸ�
			System.out.println("���� : false");
		}
		
		//Today Point
		//������ �߿��� ��� ����(���� , �ݺ�)
		//���׿�����
		
		int p = 10;
		int k = -10;
		
//		int result5 = ���ǽ� ? �� : ����;
		int result5 = (p == k)? p : k ;
		System.out.println(result5);
		
		//if������ �ٲ㺸�� int result5 = (p == k)? p : k ;
		int result6 = 0;
		if(p==k) {
			result6 = p;
		}else {
			result6 = k;
		}
		System.out.println(result6);
		
		/*
		 ����ǥ(������)
		 0 : ����(false)
		 1 : �� (true)
		 OR ���� , AND ����
		 
		 DB����
		 SQL �ڿ��� ...
		 select * from emp where job='IT' and sal > 3000
		 select * from emp where job='IT' or sal > 3000
		 
		 */
		
		int x =3;
		int y = 5;
		//��Ʈ���� ������ >> ������ �ٲپ ���� or , and ����ǥ ����)
		System.out.println("x |y : OR ����" + (x|y));
		
		/*
		 256 128 64 32 16 8 4 2 1
		 									0 0 1 1 >> 3
		 									0 1 0 1 >> 5
		 									0 1 1 1 >> ��Ʈ OR����
		 									> 4+2+1 >> 7
		256 128 64 32 16 8 4 2 1
											0	0	1	1 >> 3
											0 1 0 1 >> 5
											0 0 0 1 >> ��Ʈ AND ����
											> 1 >> 1
		 */
		//��Ʈ ���� (����ó��, �ǵ�)
		
		int data = 90;
		switch(data) {
			case 100: System.out.println("100�Դϴ�");
			case 90: System.out.println("100�Դϴ�");
			case 80: System.out.println("100�Դϴ�");
			default : System.out.println("��ġ�ϴ� ���� �����.");
		}
		//�극��ũ ���� ����ġ �� case 90~default���� ���
		switch(data) {
			case 100: System.out.println("100�Դϴ�");
				break;
			case 90: System.out.println("100�Դϴ�");
				break;
			case 80: System.out.println("100�Դϴ�");
				break;
			default : System.out.println("��ġ�ϴ� ���� �����.");
		}
		//�극��ũ�� ����ġ Ż�� ������
		
		
	}
		
}
