/*
class Shape{ // 부모
	그리다
	색상
}

class Dot { // 부품 , member field
	좌표값
}
*/

class Shape{
	String color = "gold";
	void draw(){
		System.out.println("도형을 그리다");
	}
}

class Point{
	int x;
	int y;
	Point(){
		// this.x = 1;
		// this.y = 2;
		this(1,2);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Triangle extends Shape{
//	private Point[] points = new Point[3];
	private Point[] points;
// default 정해진 3 점으로 
	public Triangle(){
//		this({ new Point(1,1),new Point(3,3),new Point(5,1) });  // 에잉 ㅡㅡ;; 배열형태 넣고 작성
		this(new Point[]{ new Point(1,1),new Point(3,3),new Point(5,1) });
	}
	public Triangle(Point[] points){
		//Point[3] points 안됨. 주소값을 받아야지 range까진 받을 수 없다.
		this.points = points;
	}
	public void triangleInfo(){
		for(Point point : points){
			System.out.println("삼각형 포인트 x: " + point.x + "\t포인트 y: " + point.y);
		}
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.triangleInfo();
		Triangle customTri = new Triangle(new Point[]{new Point(3,3),new Point(6,6),new Point(2,2)} );
		customTri.triangleInfo();
	}
}
