package kr.or.kosa;

/*
 ��Ʈ���� ������ ������ �ִ� (private) setter getter
 ��Ʈ���� ����⵵�� ������ �ִ� (private) setter getter
 ��Ʈ���� ���콺�� ������ �ִ� ( ���콺�� 2�� ��ǥ���� ������ �ִ� ) (x,y)
  */

public class NoteBook {
	private String color;
	private int yearOfManufacture;
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		if(yearOfManufacture < 0) {
			this.yearOfManufacture = 1999;
		}else {
			this.yearOfManufacture =yearOfManufacture;
		}
	}
	public int setYearOfManufacture() {
		return yearOfManufacture;
	}
	
//	public Mouse mouse; // ��... ���콺 �ʱⰪ null
	// ���콺�� ���յǾ��ִ°�? ���� �پ��ִ°�?
	// ���� �ٿ��� ��� �� ���� ��� �ڵ尡 �´�!
//	private  Mouse mouse = new Mouse(); //>> notebook.mouse ���� �Ұ�!
	public Mouse mouse = new Mouse();
	
}