/*
class Shape{ // �θ�
	�׸���
	����
}

class Dot { // ��ǰ , member field
	��ǥ��
}
*/

class Shape{
	String color = "gold";
	void draw(){
		System.out.println("������ �׸���");
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
// default ������ 3 ������ 
	public Triangle(){
//		this({ new Point(1,1),new Point(3,3),new Point(5,1) });  // ���� �Ѥ�;; �迭���� �ְ� �ۼ�
		this(new Point[]{ new Point(1,1),new Point(3,3),new Point(5,1) });
	}
	public Triangle(Point[] points){
		//Point[3] points �ȵ�. �ּҰ��� �޾ƾ��� range���� ���� �� ����.
		this.points = points;
	}
	public void triangleInfo(){
		for(Point point : points){
			System.out.println("�ﰢ�� ����Ʈ x: " + point.x + "\t����Ʈ y: " + point.y);
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
