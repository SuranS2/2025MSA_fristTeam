import kr.or.kosa.DoWhileMenu;

public class Ex16_DoWhileMenu {

	public static void main(String[] args) {
		 DoWhileMenu Menu = new DoWhileMenu();
		while(true) {
			switch (Menu.displayMenu()) {
				case 1: Menu.inputRecord();
					break;
				case 2: Menu.deleteRecord();
					break;
				case 3: Menu.sortRecord();	
				    break;
				case 4: System.out.println("���α׷� ����");
				    //return;  >> main �Լ� ����
			    System.exit(0); //���α׷� ����(kill)
			}
		}
	}
}
