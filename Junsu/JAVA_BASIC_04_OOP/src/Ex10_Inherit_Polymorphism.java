class Tv2{
	boolean power;
	int ch;
	void power() {
		this.power = ! this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
//�ڸ� ����� �ִ� Tv
class CapTv extends Tv2{
	//Ư��ȭ, ��üȭ
	String text;
	String captionText() {
		return this.text =  "���� �ڸ� ���� ���Դϴ�";
	}
	
}
public class Ex10_Inherit_Polymorphism {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		System.out.println(ct.captionText());
		
		Tv2 tv2 = ct;
		// ��� ���迡�� �θ��� �ּҿ� �ڽ��� �ּҸ� �Ҵ� ����
		//�� �θ�� �ڽ��� �ڿ��� ���� ����
		// �� �����Ǵ� �����ϰ�
		System.out.println(ct.toString());
		System.out.println(tv2.toString());

	}

}
