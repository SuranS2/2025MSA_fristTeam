public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		//1�� score ���� �� �ְ����� �ּ������� ���ض�
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
		System.out.println("�� ���迡�� ���� �ְ� ���� : "+max);
		System.out.println("�� ���迡�� ���� �ּ� ���� : "+min);
		System.out.println();
		
		//2�� 10���� ���� ���� 1~10������ �ʱ�ȭ ��Ű�� ���
		int[] numbers = new int[10];
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = i+1;
			System.out.printf("%d\t", numbers[i]);
		}
		System.out.println();
		
		//3�� ��� �л��� �⸻��� �������� (5����)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0 ;
		float avg = 0f;
		System.out.println("�� ������ �� : " + jumsu.length);
		for(int i = 0 ; i < jumsu.length ; i++) {
			sum+= jumsu[i];
			avg+= (float)jumsu[i]/5; // => �����ѹ� ��� jumsu.length ��ȿ
		}
		System.out.println("���� ������ �� �� : " + sum);
		System.out.println("���� ������ ���(5����) : " + avg);
	}
}
