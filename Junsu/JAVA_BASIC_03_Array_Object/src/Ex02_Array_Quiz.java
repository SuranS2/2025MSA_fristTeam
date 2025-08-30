public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		//1번 score 값을 중 최고점수 최소점수를 구해라
		int[] score = new int[] { 79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		
		for(int i = 1; i < score.length ; i++) {
			if(max < score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				min=score[i];
			}
		}
		System.out.println("이 시험에서 받은 최고 점수 : "+max);
		System.out.println("이 시험에서 받은 최소 점수 : "+min);
		System.out.println();
		
		//2번 10개의 방의 값을 1~10까지로 초기화 시키고 출력
		int[] numbers = new int[10];
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = i+1;
			System.out.printf("%d\t", numbers[i]);
		}
		System.out.println();
		
		//3번 어느 학생의 기말고사 시험점수 (5과목)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0 ;
		float avg = 0f;
		System.out.println("총 과목의 수 : " + jumsu.length);
		for(int i = 0 ; i < jumsu.length ; i++) {
			sum+= jumsu[i];
			avg+= (float)jumsu[i]/5; // => 매직넘버 사용 jumsu.length 유효
		}
		System.out.println("과목 점수의 총 합 : " + sum);
		System.out.println("과목 점수의 평균(5과목) : " + avg);
	}
}
