import java.util.Scanner;

public class Ex08_Operation_Quiz {
	public static void main(String[] args) {
		/*
		������ ��Ģ ����� (+ , - , * , /)
		�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
		���� : Integer.parseInt() ,  ** ���� java equals() Ȱ��  ���ڿ��� ��** 

		ȭ��
		>�Է°�:����
		>�Է°�(��ȣ): +
		>�Է°�:���� 
		>������ :200
		-------------
		>�Է°�:100
		>�Է°�(��ȣ): -
		>�Է°�:100
		>������ :0 

		 */
		//if ���ǰ��� boolean
		// switch ���� ������ byte, short, int) �� ����(char) , ���ڿ�(String) ���ǽ� ��� ���� long,boolean �Ұ�
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String arithmetic = sc.nextLine();
		String num2 = sc.nextLine();
		int result = 0;
		int strToNum1 = Integer.parseInt(num1);
		int strToNum2 = Integer.parseInt(num2);
		boolean flag=false;
		switch(arithmetic) {
			case "+":
				result = strToNum1 + strToNum2;
				break;
			case "-":
				result = strToNum1 - strToNum2;
				break;
			case "/":
				result = strToNum1 / strToNum2;
				break;
			case "*":
				result = strToNum1 * strToNum2;
				break;
			default: 
				flag=true;
				System.out.println("�����Դϴ�.");
		}
		if(!flag) {
			System.out.printf("%s %s %s = %d \n",num1,arithmetic,num2,result );
		}
	}

}
