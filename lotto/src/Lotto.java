package lotto.src;

import java.util.Random;

public class Lotto {
	private int[] randNums; //로또 번호
	
	Lotto(){
		randNums = new int[] {1,2,3,4,5,6};
	}
	// 번호 출력
	void printRandNum() {
		System.out.printf("[ ");
		for(int randNum : randNums) {
			System.out.printf("%d ",randNum);
		}
		System.out.println("]");
	}
	// 번호 확인
	void valiNum(int[] randNums){
		for(int i=0; i<randNums.length;i++){
			for(int j=0; j<i; j++){
				if(randNums[i] == randNums[j]){
					i--;
					break;
				}
			}
		}
	}
	public void promotionDrawing(){
		Random rd = new Random();
		int bonusNum = rd.nextInt(45)+1;
		int[] luckyNumber = {3,7,10};
		System.out.println("보너스 추첨 진행");
		System.out.println(" 3 : 로봇청소기 \n 7 : 황금 5돈 \n 10 : 최신식 스마트 TV \n  보너스 넘버 " + bonusNum + " : 1억");
		// 3 7 10 보너스넘버 포함
		
		for(int num : randNums){
			if(luckyNumber[0] == num){
				System.out.println("로청 상품 당첨!");
			}else if(luckyNumber[1] == num){
				 	System.out.println("황금 5돈 상품 당첨");
			}else if(luckyNumber[2] == num) {
					System.out.print("최신식 스마트 TV 상품 당첨");
			}else if(bonusNum == num){
				// 보너스넘버는 3 7 10 제외 => lucky넘버 배열 받아서 진행
					System.out.println("1억 상품 당첨");
			}
		}
	}
}
