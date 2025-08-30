/*
void m(int x){
	x�� ��� : 100
	x = 11111;
}

m(100)
call by value
�Լ��� parameter���� ���� ���� or �ּҰ� ����(������) Ref ����

class Car{}

void m2(Car c){ //c parameter Car ��� ��ü�� �ּҰ��� �޴´�
	c.carName = "����" ;
}

Car car = new Car();

m2(car);
car.carName => ����

Call by ref ��� ��
*/

class Data{
	int i;
}

public class Ex10_Method_Call{
	static void scall(Data sdata){
		System.out.println("�Լ� : " + sdata.i); // sdata > 0xabc
		sdata.i = 1111; // => 0xabc.i
	}
	static void vcall(int x) { // �������� �ްڴ�
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : "  + x);
	}
	public static void main(String[] args){
		Data d = new Data(); // d��� ������ : 0xabc ����
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		Ex10_Method_Call.scall(d); // 0xabc����
		System.out.println("d.i : " + d.i);
		
		Ex10_Method_Call.vcall(d.i);
		System.out.println("after d.i : " + d.i); // => 1111
		
		// �Լ����� ���� ����, �ּҰ� ������ ����
	}
}