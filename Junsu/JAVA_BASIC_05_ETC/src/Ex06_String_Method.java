
public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world"); //두 개를 이어 새로운 문자열 생성
		System.out.println(concatstr); // hello world;
		
		System.out.println(str.contains("ello") ); //CharSequence s = 문자의 배열 을 포함하는지? 
		String str2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
		System.out.println(str2.length()); // 7
		
		String filename ="hello java world";
		System.out.println(filename.indexOf("e")); //indexOf overloading 된 메서드 첫 번째부터 탐색해서 문자 인덱스 탐색 1
		System.out.println(filename.indexOf("java")); //문자 시퀀스도 받을 수 있음 
		System.out.println(filename.indexOf("kava")); // 배열 함수 값이 없다면 -1
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo가 하나라도 있다");
		}
		
		// 특정 문장에서 내가 원하는 단어의 포함여부를 확인
		//배열 함수 값이 없다면 -1
		
		System.out.println(filename.lastIndexOf("a")); // 뒤에서부터 만난 것 인덱스 0~부터 거리 9
		
		String file = "home.jpg";
		int dotIndex = file.lastIndexOf(".");
		String filename2 = file.substring(0,dotIndex);
		String extention = file.substring(dotIndex+1);
		System.out.println(filename2 + "."  + extention);
		
		String str4 = "슈펴맨, 팬티, 노랑색, 파란색, 빨간색";
		//"슈펴맨, 팬티, 노랑색.파란색, 빨간색";   , . 로 구분하려면 StringTokenizer 클래스 사용해야함
		String[] namearray = str4.split(",");
		for(String s : namearray){
			System.out.println(s);
		}
		// 슈퍼맨
		// 팬티
		// 노랑색
		// 파란색
		// 빨간색
		String str5 = "슈펴맨.팬티.노랑색.파란색.빨간색";
		String[] namearray2 = str5.split(".");
		for(String s : namearray2){
			System.out.println(s);
		}
		String ip = "192.168.0.0";
		String [] iparray = ip.split("\\.");
		for(String s : iparray){
			System.out.println(s);
		}
		string
		int sum = 0;
		String[] numarr = {"1", "2", "3", "4"};
		// 배열의 총합 (1+2+3+4)
		for(String s : numarr){
			sum+=Integer.parseInt(s);
		}
		System.out.println(sum);

		//2
		String jumin = "123456-1234567";
		// 주민등록번호의 합 1+2+3+4+5+6+1+2+3+4+5+6+7
		sum = 0;
		for(String splitBig : jumin.split("-")){
			for(String splitEach : splitBig.split("") ) {
				sum+= Integer.parseInt(splitEach );
			}
		}
		System.out.println(sum);
		
	}
}