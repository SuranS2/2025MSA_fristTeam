
public class Ex05_mini_assignment {

	public static void main(String[] args) {
		// 100 ~ 1000 까지 값(int)(Math.random()*1000)+1
		int drawingPoint = (int)(Math.random()*1000)+1;
		String giveAway1000 = "TV";
		String giveAway900 = "NoteBook";
		String giveAway800 = "냉장고";
		String giveAway700 = "한우세트";
		String giveAway600 = "휴지";
		String defualtGiveAway = "칫솔";
		System.out.println("당신의 점수 : "+drawingPoint);
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
				System.out.printf("%s 당첨", giveAway600);
				break;
			default:
				System.out.printf("%s 당첨\n", defualtGiveAway);
		}
		/*
		kuyngGyun lim
		오전 10:44
		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
			       
			       프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요
				   우리는 백화점 경품 시스템을 만들려고 한다
			 	   경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
			       경품 추첨시 1000 점수가 나오면
			       경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
			       경품 추첨시 900 점수가 나오면
			       경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
			       경품 추첨시 800 점수가 나오면
			       경품으로  냉장고 , 한우세트 , 휴지
			       경품 추첨시 700 점수가 나오면
			       경품으로  한우세트 , 휴지
			       경품 추첨시 600 점수가 나오면
			       경품으로  휴지
			       그외 점수는 100 ~ 500 까지는 칫솔 
			       경품시스템의 점수 범위는 100 ~ 1000 점까지 한정
		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
			       
			       프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요
		*/

	}

}
