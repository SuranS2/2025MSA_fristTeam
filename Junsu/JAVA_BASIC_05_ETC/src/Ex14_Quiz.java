class Ssystem{
	static final Out out; // 초기화가 되어있지 않아서 NullPointException 나옴
}
class Out{
	void println(String s) {
		System.out.println(s);
	}
	void println(int i) {
		System.out.println(i);
	}
}
public class Ex14_Quiz {
	public static void main(String[] args) {
		System.out.println("어떤 함수야");
		System.out.println(100);
		Ssystem.out.println(123);
	}
}
