package kr.or.kosa;
/*
	Tv ���赵 �䱸��������
	Tv�� ä�� ������ ������ �ִ�   (���� ��� 1 ~ 200 ���� ���� �� �ִ�)  public     �������� ���� �� �־��
	Tv�� �귣�� �̸��� ������ �ִ� (���� ��� ����  , �Ｚ )             public     ���ڿ� ���� ���� �� �־��
	Tv�� ä�� ��ȯ ����� ������ �ִ�(ä���� �� ä�ξ� �̵��� �����ϴ�)
	->ä���� ���� ��Ű�� ����� ������ �ִ�
	->ä���� ���� ��Ű�� ����� ������ �ִ�
	Tv�� ä�������� �귣���̸��� �� ��(���) �ִ� ����� ������ �ִ�
*/
public class Tv {
	public int channel;
	public String brandName="�Ｚ";
	
	public void channelUp() {
//		return ++channel; return channel++; �������� �ϴ� ��ġ�� �ϴ� ����� ����
		//��ġ ��ġ ������ ����Ǵ°� �ٸ� ��Ģ����, �ڷᰪ ���� = �� ����Ǿ����� �۵� 
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void tvInfo() {
		System.out.println("���� ä�� : "+ channel + " ��");
		System.out.println("TV �귣�� : " + brandName);
	}
}
