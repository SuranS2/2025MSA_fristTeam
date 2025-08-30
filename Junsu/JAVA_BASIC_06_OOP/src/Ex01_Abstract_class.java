abstract class Abcclass{
		//추상클래스 중 구현된 부분
		int pos;
		void run() {
			pos++;
		}
		//
		abstract void stop(); // 네가 원하는 형태로 상속을 통해서 재정의해라 >> 코드블럭 없으니 네가 넣어.
}
class Child extends Abcclass{
	@Override
	void stop() {
		//구현하는 사람 마음대로
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}
public class Ex01_Abstract_class {

	public static void main(String[] args) {
		Child child = new Child();
		child.run();
		child.run();
		child.stop();
		
		
	}
}
