class Tv{
	boolean power;
	int ch;
	void power() {
		this.power = !this.power; // 하나의 함수가 2개 기능정도는 할 수 있는 편 >> 토글링
	}
	void chUp(){
		this.ch++;
	}
	void chDown(){
		this.ch--;
	}
}

class Vcr{
	boolean power;
	
	void power(){
		this.power = !this.power;
	}
	void play(){
		System.out.println("재생하기");
	}
	void stop(){
		System.out.println("정지하기");
	}
	void rew(){}
	void ff(){}
}
class TvVcr extends Tv{
//	Vcr vcr = new Vcr(); => 이렇게 쓰는건 자제하자
	Vcr vcr;
	//TV와 VCR을 같이 생성하고 싶다 => 생성자, 통합제품
	TvVcr(){
		this.vcr = new Vcr();
	}
	//외부의 Vcr 제품을 만들어 TV에 붙이기
	TvVcr(Vcr vcr){
		this.vcr = vcr;
	}
}
public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr tvVcr = new TvVcr();
		
		tvVcr.power();
		System.out.println(tvVcr.power);
		
		//비디오 전완
		tvVcr.vcr.power();
		System.out.println(tvVcr.vcr.power);
		
	}
}
