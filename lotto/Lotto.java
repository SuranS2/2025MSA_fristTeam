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


    // 랜덤 번호 최대 45번 까지 추출
    private void pickSixRandomNumbers() {
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = (int) (Math.random() * 45 + 1);
        }
    }

}
