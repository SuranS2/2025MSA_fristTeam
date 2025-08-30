
import java.util.Scanner;

//제출용 코드

public class Ex07_String_Total_Quiz {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String jumin;
		do {
			System.out.println("주민등록번호 입력, 앞 : 6자리 , 뒷 : 7자리");
			System.out.print("입력값 : ");
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
	//3번 남자 여자 출력
		if(juminGenderNum%2==1) {
			System.out.println("남자");
		}else{
			System.out.println("여자");
		}
	}
}