import java.util.Scanner;

public class Ex11_Statement_Quiz {
	public static void main(String[] args) {
		//�޴��� �����ְ� ������� ������ �ϰ� ����
		// ���ϴ� �޴��� �������� ������ ������ �ٽ� �޴��� ���� �� ��
		//1. ����
		//2. ���
		//3. �ܰ�
		//4. ���� ���� �Ǵ� while Ż��(� ������ ��ġ�ϸ� ���� break)
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int balance = 0;
		while(true) {
			System.out.println("ATM �޴��� �������ּ���");
			System.out.println("1. ����");
			System.out.println("2. ���");
			System.out.println("3. �ܰ�");
			System.out.println("4. ����");
			System.out.printf("\n����� ���� : ");
			choice = sc.nextInt();
			int IOmoney = 0;
			if(choice == 1) {
				//�Ա�
				System.out.printf("���� �Է� : " );
				IOmoney = sc.nextInt();
				balance += IOmoney;
			}else if(choice == 2){
				//���(���밡��)
				System.out.printf("���� �Է� : " );
				IOmoney = sc.nextInt();
				balance -= IOmoney;
			}else if(choice == 3){
				//�ܰ� ���
				System.out.println("�ܱ� : " + balance + "��");
			}else if(choice == 4) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else {
				System.out.println("����� �� ��ư�� �������ּ���. ���� �޴��� ���ư��ϴ�...");
			}	
		}
//		�ܾ� ������ ����(balance)
//		���� ó�� + ����
//		��� ó�� - ����
		//�ܰ� balance ���
		//���� ���α׷��� �� (�Լ��� ���� , ���α׷��� ���� ����)
		//���� ���� ( return(x) , exit(x) �ȵ�)
	}
}
