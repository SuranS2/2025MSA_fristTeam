package lotto;

public class Lotto {
	private int[] randNums; //로또 번호
	
	Lotto(){
		randNums = new int[6];
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

}
