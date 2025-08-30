import java.util.Scanner;

public class Ex11_Statement_Quiz2 {
	public static void main(String[] args) {
		//가위=> 1 , 바위 => 2 , 보 => 3
		int myState = 0;
		int comState = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
		  System.out.println("가위바위보 게임을 시작합니다.");
		  System.out.println("내가 낼 것은?");
		  System.out.println("가위=> 1 , 바위 => 2 , 보 => 3");
		  System.out.println("*아무것도 내지 않거나 이기지 못하면 게임을 끝낼 수 없습니다.");
		  result = 0;
		  myState = sc.nextInt();
		  comState = (int) (3*Math.random()+1);
		  result = myState - comState;
		  System.out.println("나: " + myState + "컴퓨텨: " + comState);
		  if(result==1 || result==-2){
		    System.out.println("당신은 컴퓨터에게 이기셨습니다.");
		    break;
		  }else{
		    System.out.println("이기지 못했습니다. 게임을 다시 시작합니다.");
		  }
		}
	}

}
