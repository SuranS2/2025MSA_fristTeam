
public class Ex05_mini_assignment {

	public static void main(String[] args) {
		// 100 ~ 1000 ���� ��(int)(Math.random()*1000)+1
		int drawingPoint = (int)(Math.random()*1000)+1;
		String giveAway1000 = "TV";
		String giveAway900 = "NoteBook";
		String giveAway800 = "�����";
		String giveAway700 = "�ѿ켼Ʈ";
		String giveAway600 = "����";
		String defualtGiveAway = "ĩ��";
		System.out.println("����� ���� : "+drawingPoint);
		switch(drawingPoint/100){
			case 10:
				System.out.printf("%s ,", giveAway1000);
			case 9:
				System.out.printf("%s ,", giveAway900);
			case 8:
				System.out.printf("%s ,", giveAway800);
			case 7:
				System.out.printf("%s  ,", giveAway700);
			case 6:
				System.out.printf("%s ��÷", giveAway600);
				break;
			default:
				System.out.printf("%s ��÷\n", defualtGiveAway);
		}
		/*
		kuyngGyun lim
		���� 10:44
		����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�.
			       
			       ���α׷��� �ѹ� �����ϸ� �� �� �������� ������ �� �������� ���ؼ� ��ǰ�� ����ϸ� �ǿ�
				   �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
			 	   ��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
			       ��ǰ ��÷�� 1000 ������ ������
			       ��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
			       ��ǰ ��÷�� 900 ������ ������
			       ��ǰ����  NoteBook , ����� , �ѿ켼Ʈ , ����
			       ��ǰ ��÷�� 800 ������ ������
			       ��ǰ����  ����� , �ѿ켼Ʈ , ����
			       ��ǰ ��÷�� 700 ������ ������
			       ��ǰ����  �ѿ켼Ʈ , ����
			       ��ǰ ��÷�� 600 ������ ������
			       ��ǰ����  ����
			       �׿� ������ 100 ~ 500 ������ ĩ�� 
			       ��ǰ�ý����� ���� ������ 100 ~ 1000 ������ ����
		����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�.
			       
			       ���α׷��� �ѹ� �����ϸ� �� �� �������� ������ �� �������� ���ؼ� ��ǰ�� ����ϸ� �ǿ�
		*/

	}

}
