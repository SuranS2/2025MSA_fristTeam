package kr.or.kosa;

//마우스는 (x,y) 한 점을 표현
//x,y 캡슐화
//write 구현(setter 구현)
//함수를 통해서 x,y 출력되게
public class Mouse {
	int x,y;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}