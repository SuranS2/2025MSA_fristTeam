
import java.util.Scanner;

//����� �ڵ�

public class Ex07_String_Total_Quiz {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String jumin;
		do {
			System.out.println("�ֹε�Ϲ�ȣ �Է�, �� : 6�ڸ� , �� : 7�ڸ�");
			System.out.print("�Է°� : ");
			jumin = sc.nextLine();
		}while(juminValueValidate(jumin) || juminDisplay(jumin)); 
		genderDisplay(jumin);
	}
	static boolean juminDisplay(String jumin) {
      return !jumin.matches("\\d{6}-\\d{7}");
  }
	static boolean juminValueValidate(String jumin) {
		int num= jumin.charAt(7)-'0';
		return !(num>=1 && num<=4);
	}
	static void genderDisplay(String jumin){
	int juminGenderNum = jumin.charAt(7)-'0';
	//3�� ���� ���� ���
		if(juminGenderNum%2==1) {
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}
}