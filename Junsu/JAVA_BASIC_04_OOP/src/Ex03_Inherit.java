class Tv{
	boolean power;
	int ch;
	void power() {
		this.power = !this.power; // �ϳ��� �Լ��� 2�� ��������� �� �� �ִ� �� >> ��۸�
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
		System.out.println("����ϱ�");
	}
	void stop(){
		System.out.println("�����ϱ�");
	}
	void rew(){}
	void ff(){}
}
class TvVcr extends Tv{
//	Vcr vcr = new Vcr(); => �̷��� ���°� ��������
	Vcr vcr;
	//TV�� VCR�� ���� �����ϰ� �ʹ� => ������, ������ǰ
	TvVcr(){
		this.vcr = new Vcr();
	}
	//�ܺ��� Vcr ��ǰ�� ����� TV�� ���̱�
	TvVcr(Vcr vcr){
		this.vcr = vcr;
	}
}
public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr tvVcr = new TvVcr();
		
		tvVcr.power();
		System.out.println(tvVcr.power);
		
		//���� ����
		tvVcr.vcr.power();
		System.out.println(tvVcr.vcr.power);
		
	}
}
