import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		//�ݺ��� (while , do~while)
		int i = 10;
		while( i >= 10) {
			//�ݵ�� �������� ���
			
//			--i; // i �� 9���� ���
			System.out.println(i);
			--i; // i �� 10���� ����ϰ� 9�� ����
		}
		//while�� ����ؼ� 1~100���� ��
		int j = 1;
		int sum = 0;
		while( j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		//while(true) {} ���ѷ��� ���� ������ ������ ������ ������ �ٽ� �۵��ϴ� ���α׷� �ۼ��� ���
		
		//�ϱ� ������ �����غ��� 2�ܹۿ� ������ �ʴ´�.
		// p�� 10���� �Ǿ��־ �߰� while���� ��� �Ѿ��
		int k = 2;
		int p= 1;
		while( k <= 9 ) {
			// p = 1; �ʱⰪ�� �ʱ�ȭ�� �ʿ�
			while(p <= 9) {
				System.out.printf("%d*%d=%d\t",k,p,k*p);
				p++;
			}
			System.out.println();
			k++;
		}
	// �ڵ尡 ������ ���� ��Ʊ� ������ �� ������ Ȯ���� ������ ��� for���� ���°� �´� 
		
		// while(true){}
		// for(;;){} for�� ���ѷ���, �ٸ� �� ���� ����
		// do ~ while �ϴ� �ѹ� ���������� ���� ... ���� ���� �Ǵ�
		/*
		 * �޴� ����
		 * 1. ¥��
		 * 2. «��
		 */
		Scanner sc = new Scanner(System.in);
		int inputData=0;
		do {
			System.out.println("���� �Է���(0~9)");
			inputData = Integer.parseInt(sc.nextLine());
		}while(inputData >= 10);
		
		//���ǽ��� true do ���� ��� ����
		//���ǽ��� false ���� Ż��
		System.out.println("����� �Է��� ���ڴ� : " + inputData);
	 
		
		
	}

}
