package kr.or.kosa;
//�䱸���� �ּ��ۼ� : Ŭ���� ���� ����, �ּ����� ����
//����(���� - ��������+��������) + ���� => ���赵��� �� �� ���� > ������ Ÿ��

//�ڵ����� ���� ������ ������ �ִ�
//�ڵ����� ������ ������ �ִ�.
public class Car {
	//���� �Ӽ� - member field , instance variable
	private int door; // ĸ��ȭ �Ǿ��ִ� ����
	private String color;
	//ĸ��ȭ �� �ڿ��� �ٷ�� RW�� Ư���� ������ ��� �Լ��� �ʿ�(method)
	//�߻�ȭ - �Ϲ�ȭ 
	//setter, getter ��� �����ѵ� ������̼� ����ϸ� ���α׷��� ������ �߻�ȭ ��(����)
	public int getDoor() {
		return door;
	}
	// ���� �Ҵ�
	public void setDoor(int door) {//�Ķ���� ����-�μ�
		this.door = door;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void carInfoPrint() {
		System.out.println(door + color);
	}

}
