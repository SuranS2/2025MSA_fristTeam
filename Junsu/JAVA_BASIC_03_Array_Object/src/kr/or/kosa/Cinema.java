package kr.or.kosa;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	// �ʱ� �����ڸ� ���� String �¼����� 
	private Scanner sc = new Scanner(System.in); 
	private String[][] seat;
	//lang.Math�� random���� util.Random Ŭ���� ����� �� ����
	//���� �Ǽ� ������� �� �ٿ���� ���� ������
	private Random r = new Random(); 
	private int adminPassword = 1234;
	private int choiceRow;
	private int choiceCol;
	
	public Cinema(int row, int col){
		this.seat = new String[row][col];
		initCinemaSeats();
		cinemaMenuChoice();
	}
	
	private String choice;
	private String ticketNum;
	
	private boolean programStatus = true;
	public void cinemaMenuChoice(){
		while(programStatus){
			choice = "";
			choiceRow = 0;
			choiceCol = 0;
			System.out.println("*************");
			System.out.println("��ȭ ���� �ý���");
			System.out.println("*************");
			System.out.println("1.�����ϱ�");
			System.out.println("2.������ȸ");
			System.out.println("3.�¼���ȸ");
			System.out.println("4.�������");
			System.out.println("5.�ý��� ����");
			System.out.println("6.�¼� �ʱ�ȭ(������ ��й�ȣ �ʿ�)");
			System.out.println("*************");
			choice = sc.nextLine();
			switch(choice){
				case "1":
					System.out.println("�����ϰ� ���� �¼��� �Է����ּ���. ��) 2-3");
					checkEntireSeats();
					System.out.println();
					//�Է°��� �̸� �迭�� �� ���·� ��ȯ
					String choiceSeat = sc.nextLine();
					choiceRow = choiceSeat.charAt(0)-65;
					choiceCol =   choiceSeat.charAt(2)-49;
					if(validateSeat(choiceRow,choiceCol)){
						System.out.println("���� �Ϸ�");
						ticketNum = buyTicket();
						seat[choiceRow][choiceCol] = ticketNum;
						ticketInfo(choiceRow , choiceCol, ticketNum);
						ticketNum="";
					}
					break;
				case "2":
					checkTicketInfo();
					break;
				case "3":
					checkEntireSeats();
					break;
				case "4":
					cancelReservation();
					break;
				case "5":
					programStatus = exitSystem();
					break;
				case "6":
					resetSeats();
					break;
				default:
					System.out.println("����� �� ���� �Է����ּ���");
			}
		}
	}
	public void initCinemaSeats(){
		//�¼� �ʱ�ȭ - ������
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0; j < seat[i].length ; j++) {
				seat[i][j] = "_"; // �� ���� ��ġ
			}
		}
	}
	// --- Ƽ�� ���� ---
	// Ƽ���� �ߺ��� ���ٴ� ����
	public boolean validateSeat(int row, int col){
		//[��][��] �¼� ���ý� ���� ���ɿ���
		if(seat[row][col].equals("_")) {
			System.out.println("���� ����, ���� �Ͻðڽ��ϱ�?");
			System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0) �� �ϳ��� �Է����ּ���.");
			return choice(sc.nextLine());
		}else {
			System.out.println("�̹� ���� �Ǿ����ϴ�");
			return false;
		}
	} 
	public boolean choice(String choice) {
		if(choice.equals("1") ) {
			return true;
		}else if(choice.equals("2") || choice.equals("0")) {
			System.out.println("ȭ������ ���ư��ϴ�.");
			return false;
		}else {
			System.out.println("�Է¿���, �ʱ� ȭ������ ���ư��ϴ�.");
			return false;
		}
	}
	public String buyTicket(){
		//  Ƽ�� �����
		String ticket = Integer.toString(r.nextInt(9) + 1);  // 1~9
		for(int i = 0 ; i < 7 ; i++){
			ticket += Integer.toString(r.nextInt(10)); // 0 ~ 9 
		}
		return ticket;
	}
	// �ٱ����� ������ row col �� ������ ���
	public void ticketInfo(int row, int col, String ticketNumber){
		System.out.printf("������ �¼���ȣ : [%c-%d]/ ���Ź�ȣ : [%s] \n",row+65,col+1,ticketNumber);
	}
	public int[] checkTicketInfo() {
		// ������ ����ã��
		System.out.println("���������� �Է����ּ���.");
		String ticketNumber = sc.nextLine();
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat.length ; j++) {
				if(ticketNumber.equals(seat[i][j])) {
					System.out.printf("������ �����Ͻ� �¼��� [%c-%d] �Դϴ�.\n",i+65,j+1);
					return new int[] {i,j};
				}
			}
		}
		System.out.println("���� ������ �����ϴ�.");
		return null;
	}
	//�¼� ��ü ��ȸ
	public void checkEntireSeats(){
		for(int i = 0; i < seat.length ; i++) {
			for(int j = 0; j < seat[i].length ; j++) {
					System.out.printf("[%s]", seat[i][j].equals("_") ?  ( (char)(i+65) +"-"+ (j+1) )  : "����");
				}
				System.out.println();
		}
	}
	// ������� * �μ��� ���ؼ� �ʱ�ȭ => �߰� ���� �ʿ� cancelReservation
	public void cancelReservation(){
		int[] ticketSeatInfo = checkTicketInfo();
		if(ticketSeatInfo!=null) {
			System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
			System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0) �� �ϳ��� �Է����ּ���.");
			if(choice(sc.nextLine())) {
				seat[ticketSeatInfo[0]][ticketSeatInfo[1]]="_"; //������ �� , ���� �� �¼� �ε��� ��ȣ
				System.out.println("���� ��� �Ϸ�");
			}
		}
	}
	// �ý��� ���� * return or �ݺ��� �ʱ�ȭ exitSystem
	public boolean exitSystem(){
			System.out.println("�ý����� ������ �����Ű�ðڽ��ϱ�? [Y/N]");
			String answer = sc.nextLine();
			if(answer.equals("Y")){
				System.out.println("�ý��� ����.");
				return false;
			}else{
				System.out.println("�ý��� ���� ���, �޴��� ���ư��ϴ�.");
				return true;
			}
	}
	//���� ���� (��ȭ ����)
	//�ٽ� ���� �ϱ� �� �¼� �ʱ�ȭ (������ ��й�ȣ �Է� �� ����)
	//�¼� �ʱ�ȭ 
	public void resetSeats(){
		System.out.printf("������ ��й�ȣ�� �Է����ּ��� : ");
		if(sc.nextInt()==1234){
			for(int i = 0 ; i < seat.length ; i++) {
				for(int j = 0; j < seat[i].length ; j++) {
					seat[i][j] = "_"; // �� ���� ��ġ
				}
			}
		}else{
			System.out.println("������ ��й�ȣ �Է� ����");
		}
	}
}