import java.lang.Math;

class objectArray_quiz{
	public static void main(String[] args){
		int[] randNumbers = new int[6]; // �ʱⰪ 0
		int insertNumber;
		boolean duplication=true; // �ߺ��� �ִٸ� true, ���ٸ� false, �ʱⰪ�� �׻� �ִٰ� ����
		for(int i = 0 ; i < randNumbers.length ; i++){
			// �÷��� get Index ������ �� �� ����
			// �����迭�� index�� ������ �� ����� ��� �̷� ������ �����ϱ� �����
			insertNumber = 0;
			duplication = true;

			while(duplication) {
//				randNumbers[i++] = (int)Math.random()*45 + 1 ;// 1�� ��µ� => Math.random int ��ȯ= 0~0 *45 + 1
				insertNumber = (int)(Math.random()*45 + 1); // 1.0 < randNum < 45.999... ����;
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

//���� �߰�