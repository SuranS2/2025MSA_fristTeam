import kr.or.kosa.Emp;

public class Ex05_Array_Quiz {

	public static void main(String[] args) {
		/*
		 1. ��� 3���� ���弼��
		 1000, ȫ�浿
		 2000, ������
		 3000, ������
		 */
		 Emp[] emp = {new Emp(1000,"ȫ�浿"),new Emp(2000,"������"),new Emp(3000,"������")};
		 /*
		 2. ������ for������ ���, �̸� ��� ���
		 */
		 for(Emp worker : emp){
			 worker.empInfoPrint();
		 }
	}
}
