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
//자막 기능이 있는 Tv
class CapTv extends Tv2{
	//특수화, 구체화
	String text;
	String captionText() {
		return this.text =  "현재 자막 서비스 중입니다";
	}
	
}
public class Ex10_Inherit_Polymorphism {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		System.out.println(ct.captionText());
		
		Tv2 tv2 = ct;
		// 상속 관계에서 부모의 주소에 자식의 주소를 할당 가능
		//단 부모는 자신의 자원만 접근 가능
		// 단 재정의는 제외하고
		System.out.println(ct.toString());
		System.out.println(tv2.toString());

	}

}
