package kr.or.kosa;

/*
 노트북은 색상을 가지고 있다 (private) setter getter
 노트북은 생산년도를 가지고 있다 (private) setter getter
 노트북은 마우스를 가지고 있다 ( 마우스는 2개 좌표값을 가지고 있다 ) (x,y)
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
	
//	public Mouse mouse; // 어... 마우스 초기값 null
	// 마우스가 통합되어있는가? 따로 붙어있는가?
	// 따로 붙여서 써야 할 경우는 상기 코드가 맞다!
//	private  Mouse mouse = new Mouse(); //>> notebook.mouse 접근 불가!
	public Mouse mouse = new Mouse();
	
}