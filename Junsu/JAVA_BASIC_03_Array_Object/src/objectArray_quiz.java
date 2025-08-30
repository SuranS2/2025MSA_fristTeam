import java.lang.Math;

class objectArray_quiz{
	public static void main(String[] args){
		int[] randNumbers = new int[6]; // 초기값 0
		int insertNumber;
		boolean duplication=true; // 중복값 있다면 true, 없다면 false, 초기값은 항상 있다고 가정
		for(int i = 0 ; i < randNumbers.length ; i++){
			// 컬렉션 get Index 가지고 올 수 있음
			// 정적배열은 index를 가지고 올 방법이 없어서 이런 식으로 접근하기 어려움
			insertNumber = 0;
			duplication = true;

			while(duplication) {
//				randNumbers[i++] = (int)Math.random()*45 + 1 ;// 1만 출력됨 => Math.random int 전환= 0~0 *45 + 1
				insertNumber = (int)(Math.random()*45 + 1); // 1.0 < randNum < 45.999... 까지;
				for(int checkNumber : randNumbers) {
					if(checkNumber == insertNumber) {
						duplication=true;
						break;
					}
					if(checkNumber == 0) {
						randNumbers[i] = insertNumber;
						duplication= false;
						break;
					}
				}
			}
		}
		for(int eachRandNum : randNumbers){
			System.out.println(eachRandNum);
		}

	}
}

//정렬 추가