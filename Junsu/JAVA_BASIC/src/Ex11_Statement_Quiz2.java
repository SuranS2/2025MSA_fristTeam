import java.util.Scanner;

public class Ex11_Statement_Quiz2 {
	public static void main(String[] args) {
		//����=> 1 , ���� => 2 , �� => 3
		int myState = 0;
		int comState = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
		  System.out.println("���������� ������ �����մϴ�.");
		  System.out.println("���� �� ����?");
		  System.out.println("����=> 1 , ���� => 2 , �� => 3");
		  System.out.println("*�ƹ��͵� ���� �ʰų� �̱��� ���ϸ� ������ ���� �� �����ϴ�.");
		  result = 0;
		  myState = sc.nextInt();
		  comState = (int) (3*Math.random()+1);
		  result = myState - comState;
		  System.out.println("��: " + myState + "��ǻ��: " + comState);
		  if(result==1 || result==-2){
		    System.out.println("����� ��ǻ�Ϳ��� �̱�̽��ϴ�.");
		    break;
		  }else{
		    System.out.println("�̱��� ���߽��ϴ�. ������ �ٽ� �����մϴ�.");
		  }
		}
	}

}
