import java.util.Scanner;

public class Ex07_printf_format {

	public static void main(String[] args) {
		// java System.out.println();
		//c# Console.WriteLine();
		//js document.write();
		System.out.println("A");// ����ϰ� �ٹٲ�
		System.out.println(); // ���� �ٹٲ�
		System.out.println("B");
		
		int num = 1000;
		System.out.println(num);
		System.out.println("num ���� " + num + " �Դϴ�");
		//����(format)
		System.out.printf("num ���� %d �Դϴ�." , num); // ���������� �������� �ʴ´�.
		System.out.println(); 
		
		//���� printf �ϸ鼭 �����ϰ� �ʹ�
		System.out.printf("num ���� [%d] �Դϴ� �� [%d] �� �־�� \n", num , 12345);
		
		//cmd ��� �Է°� �ޱ�
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		System.out.println("value �Է°� : " + value);

	}

}
