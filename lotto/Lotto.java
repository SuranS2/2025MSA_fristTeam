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
