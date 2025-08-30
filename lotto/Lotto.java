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
    public void pickSixRandomNumbers() {
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = (int) (Math.random() * 45 + 1);
        }
    }
	
	public int[] bubbleSort(int[] arr) {
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	
		// 번호 확인
	boolean validDupNum(){
		
		//배열로 새로들어올 숫자를 기존배열에서 중복되는지 확인후 중복되면 true 종복안되면 false 로 반환
		for(int i=0; i<randNums.length;i++){
			for(int j=0; j<randNums.length; j++){
				if(randNums[i] == randNums[j]){ 
					return true;
				}
			}
		} 
		return false;
	}

}
