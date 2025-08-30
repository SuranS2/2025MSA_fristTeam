package kr.or.kosa;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	// 초기 생성자를 통해 String 좌석정보 
	private Scanner sc = new Scanner(System.in); 
	private String[][] seat;
	//lang.Math의 random보다 util.Random 클래스 사용이 더 편함
	//정수 실수 출력조정 및 바운더리 조정 직관적
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
			System.out.println("영화 예매 시스템");
			System.out.println("*************");
			System.out.println("1.예매하기");
			System.out.println("2.예매조회");
			System.out.println("3.좌석조회");
			System.out.println("4.예매취소");
			System.out.println("5.시스템 종료");
			System.out.println("6.좌석 초기화(관리자 비밀번호 필요)");
			System.out.println("*************");
			choice = sc.nextLine();
			switch(choice){
				case "1":
					System.out.println("예매하고 싶은 좌석을 입력해주세요. 예) 2-3");
					checkEntireSeats();
					System.out.println();
					//입력값을 미리 배열에 들어갈 형태로 전환
					String choiceSeat = sc.nextLine();
					choiceRow = choiceSeat.charAt(0)-65;
					choiceCol =   choiceSeat.charAt(2)-49;
					if(validateSeat(choiceRow,choiceCol)){
						System.out.println("구매 완료");
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
					System.out.println("제대로 된 값을 입력해주세요");
			}
		}
	}
	public void initCinemaSeats(){
		//좌석 초기화 - 생성자
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0; j < seat[i].length ; j++) {
				seat[i][j] = "_"; // 빈 의자 배치
			}
		}
	}
	// --- 티켓 예매 ---
	// 티켓은 중복이 없다는 가정
	public boolean validateSeat(int row, int col){
		//[행][열] 좌석 선택시 예매 가능여부
		if(seat[row][col].equals("_")) {
			System.out.println("예매 가능, 예매 하시겠습니까?");
			System.out.println("네(1), 아니오(2), 초기화면(0) 중 하나를 입력해주세요.");
			return choice(sc.nextLine());
		}else {
			System.out.println("이미 예매 되었습니다");
			return false;
		}
	} 
	public boolean choice(String choice) {
		if(choice.equals("1") ) {
			return true;
		}else if(choice.equals("2") || choice.equals("0")) {
			System.out.println("화면으로 돌아갑니다.");
			return false;
		}else {
			System.out.println("입력오류, 초기 화면으로 돌아갑니다.");
			return false;
		}
	}
	public String buyTicket(){
		//  티켓 만들기
		String ticket = Integer.toString(r.nextInt(9) + 1);  // 1~9
		for(int i = 0 ; i < 7 ; i++){
			ticket += Integer.toString(r.nextInt(10)); // 0 ~ 9 
		}
		return ticket;
	}
	// 바깥에서 성공한 row col 값 가지고 출력
	public void ticketInfo(int row, int col, String ticketNumber){
		System.out.printf("예매한 좌석번호 : [%c-%d]/ 예매번호 : [%s] \n",row+65,col+1,ticketNumber);
	}
	public int[] checkTicketInfo() {
		// 영문자 라인찾기
		System.out.println("예매정보를 입력해주세요.");
		String ticketNumber = sc.nextLine();
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat.length ; j++) {
				if(ticketNumber.equals(seat[i][j])) {
					System.out.printf("고객님이 예매하신 좌석은 [%c-%d] 입니다.\n",i+65,j+1);
					return new int[] {i,j};
				}
			}
		}
		System.out.println("예매 정보가 없습니다.");
		return null;
	}
	//좌석 전체 조회
	public void checkEntireSeats(){
		for(int i = 0; i < seat.length ; i++) {
			for(int j = 0; j < seat[i].length ; j++) {
					System.out.printf("[%s]", seat[i][j].equals("_") ?  ( (char)(i+65) +"-"+ (j+1) )  : "예매");
				}
				System.out.println();
		}
	}
	// 예매취소 * 인수값 통해서 초기화 => 추가 구현 필요 cancelReservation
	public void cancelReservation(){
		int[] ticketSeatInfo = checkTicketInfo();
		if(ticketSeatInfo!=null) {
			System.out.println("예매를 취소하시겠습니까?");
			System.out.println("네(1), 아니오(2), 초기화면(0) 중 하나를 입력해주세요.");
			if(choice(sc.nextLine())) {
				seat[ticketSeatInfo[0]][ticketSeatInfo[1]]="_"; //영문자 행 , 숫자 열 좌석 인덱스 번호
				System.out.println("예매 취소 완료");
			}
		}
	}
	// 시스템 종료 * return or 반복문 초기화 exitSystem
	public boolean exitSystem(){
			System.out.println("시스템을 정말로 종료시키시겠습니까? [Y/N]");
			String answer = sc.nextLine();
			if(answer.equals("Y")){
				System.out.println("시스템 종료.");
				return false;
			}else{
				System.out.println("시스템 종료 취소, 메뉴로 돌아갑니다.");
				return true;
			}
	}
	//예매 종료 (영화 시작)
	//다시 예매 하기 전 좌석 초기화 (관리자 비밀번호 입력 후 진입)
	//좌석 초기화 
	public void resetSeats(){
		System.out.printf("관리자 비밀번호를 입력해주세요 : ");
		if(sc.nextInt()==1234){
			for(int i = 0 ; i < seat.length ; i++) {
				for(int j = 0; j < seat[i].length ; j++) {
					seat[i][j] = "_"; // 빈 의자 배치
				}
			}
		}else{
			System.out.println("관리자 비밀번호 입력 실패");
		}
	}
}