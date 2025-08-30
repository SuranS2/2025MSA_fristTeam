import java.util.Scanner;

public class Ex07_printf_format {

	public static void main(String[] args) {
		// java System.out.println();
		//c# Console.WriteLine();
		//js document.write();
		System.out.println("A");// 출력하고 줄바꿈
		System.out.println(); // 엔터 줄바꿈
		System.out.println("B");
		
		int num = 1000;
		System.out.println(num);
		System.out.println("num 값은 " + num + " 입니다");
		//형식(format)
		System.out.printf("num 값은 %d 입니다." , num); // 내부적으로 개행하지 않는다.
		System.out.println(); 
		
		//나는 printf 하면서 개행하고 싶다
		System.out.printf("num 값은 [%d] 입니다 또 [%d] 도 있어요 \n", num , 12345);
		
		//cmd 모드 입력값 받기
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		System.out.println("value 입력값 : " + value);

	}

}
