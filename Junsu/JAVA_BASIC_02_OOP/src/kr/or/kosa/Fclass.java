package kr.or.kosa;

public class Fclass {
	public int data; //default
	//�Լ��� ������(������) : 70% public
	//�Լ� 30% private : �����Լ� ( Ŭ���� [����]���� �ٸ� �Լ��� �����ִ� �Լ� helper �Լ�)
	
	public void m() { //void = return parameter(x);
		//��ɱ���
		System.out.println("�Ϲ��Լ� : void , parameter(x)");
	}
	public void m2(int i) {
		System.out.println("�Ϲ� �Լ� : void , parameter(0)");
		System.out.println("parameter �� Ȱ�� : " + i);
	}
	public int m3() { //������ return Ű����
		return 100;
	}
	public int m4(int data) {
		return 100 + data;
	}
	//��������� ���� �⺻���� 4���� �Լ�����
	//Ȯ��
	
	public int sum(int i, int j, int k) { //return type, parameter(0)
		return i+j+k;
	}
	private int subSum(int i) {//��ü���� ���� �Ұ�(Ŭ���� ���� ...)
		return i+100;
	}
	public void callSubsum() {
		int result = subSum(100);
		System.out.println("result : "+ result);
	}
	public int opSum(int data) {
		int result = subSum(data);
		//����
		if(result > 0) {
			return 1;
		}else {
			return -1;
		}
	}
	/*
	 *�Լ��� �����ϴµ� ���� Ÿ���� parameter 2���� �޾Ƽ� �� �߿� ū ���� �����ϴ� �Լ��� ���弼��
	 ex)max(10,5) return 10;
	 */
	 public int max(int a, int b) {
		 //60�� ����?
		 if(a>b) {
			 return a;
		 }else {
			 return b;
		 }
	}
	 public int max2(int a, int b) {
		 //90�� ����? , max�� �Լ����� �� Ȱ���� ����
		 int max = (a>b) ? a : b;
		 return max;
	}
	 public int max3(int a, int b) {
		 // ���� ������ �ڵ�
		 // ������ ��(if�� else�θ� �ִ� ��� ���� ����)
		 return (a>b) ? a : b;
	}
}
