interface Ia{
	public static final int AGE = 100;
	public static final String GENDER = "��";
	public abstract String print();
	public abstract void message(String str);	
}
interface Ib{
	int AGE = 100;
	String GENDER = "��";
	String print();
	void message(String str);	
}
interface Ic{
}

class Test2 implements Ib{
	@Override
	public String print(){
		return null;
	}
	@Override
	public void message(String str){
	}
}

public class Ex03_Interface{
	public static void main(String[] args){
		Test2 t2 = new Test2();
		Ib ib = t2; // �θ�Ÿ�� (Ib) ���������� �ڽ� ��ü�� �ּҰ��� ���� �� �ִ�.
		
		//�����ǵ� �޼���� t2 ������ �Լ� ȣ��
	}
}