abstract class Abcclass{
		//�߻�Ŭ���� �� ������ �κ�
		int pos;
		void run() {
			pos++;
		}
		//
		abstract void stop(); // �װ� ���ϴ� ���·� ����� ���ؼ� �������ض� >> �ڵ�� ������ �װ� �־�.
}
class Child extends Abcclass{
	@Override
	void stop() {
		//�����ϴ� ��� �������
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
