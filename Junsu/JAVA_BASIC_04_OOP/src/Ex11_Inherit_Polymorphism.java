class Pbase{
	int p = 100;
}
class Cbase extends Pbase{
	int c = 200;
}

class Dbase  extends Pbase{
}

public class Ex11_Inherit_Polymorphism {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		Pbase pbase = cbase; 
		//������
		//1. �θ�� �ڽ��� �ڿ��� �� �� �ִ�
		//2. ������ �ڿ��� �ڽ� ���� ����
		Dbase dbase = new Dbase();
		pbase = dbase;
		
		//�θ� �ּҸ� �ڽĿ��� ���� �� �� ������?
//		Cbase ccc = pbase; // Ÿ�� ������� �� �� ����!
		Cbase ccc = (Cbase)pbase; // �ڽ�Ÿ�� �ٿ�ĳ������ ���� ��ܳ��� �� ���� => ����õ
	}
}
