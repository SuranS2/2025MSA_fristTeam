package KingGodOfEmperorMajestiGeneralJaegeon.ex0830_0907;

public class Ex14_Quiz {

	public static void main(String[] args) {
		System.out.println("어떤 함수야");
		System.out.println("100");
		

		Ssytem.out.println("어떤 함수야");
		Ssytem.out.println(100);
	}

}
//println 기능 (문자열, 정수)

class Ssytem{
	public static final Out out;
	static {
		out = new Out();
	}
}

class Out{
	
	static void println(String s) {
		System.out.println(s);
	}
	
	static void println(int i) {
		System.out.println(i);
	}
}