package kr.or.kosa;

import java.util.Scanner;

public class DoWhileMenu {
	Scanner sc = new Scanner(System.in);  // instance variable ����
	public void inputRecord() {
		System.out.println("���� ������ �Է�");
	}
	public void deleteRecord() {
		System.out.println("���� ������ ����");
	}
	public void sortRecord() {
		System.out.println("���� ������ ����");
	}
	public int displayMenu() {
		System.out.println("************");
		System.out.println("***��������***");
		System.out.println("1.�л����� �Է�");
		System.out.println();
		System.out.println("2.�л����� ����");
		System.out.println();
		System.out.println("3.�л����� �̸��� ����");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();
		int menu = 0;
		try {
			do {
				menu = Integer.parseInt(sc.nextLine());
				if(1<= menu && menu <= 4) {
					break;
				}else {
					//�Է°� : 1<= input <= 4 ���� �� ������ ����ó��
					throw new Exception("�޴� ������ �߸� �Ǿ����ϴ�.");
				}	
			}while(true);
		}catch(Exception e){
			System.out.println("���� ���� : " + e.getMessage());
			System.out.println("�޴� ���ÿ� ���� �߻�");
			System.out.println("1~4������ ��ȣ�� �Է����ּ���.");
		}
		return menu;
	}
}
