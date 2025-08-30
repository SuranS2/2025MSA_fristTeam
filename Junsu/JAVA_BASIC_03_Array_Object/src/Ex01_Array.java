//import java.util.Arrays;
//
//public class Ex01_Array {
//
//	public static void main(String[] args) {
//		int s, s2, s3, s4;
//		int s5;
//		int s6;
//		int s7;
//		// ���� Ÿ���� ���� �������� �����ؼ� ���
//
//		//�迭
//		int[] score = new int[5];
//		// score 101�� >> 101ȣ, 102ȣ, 103ȣ
//		//int Ÿ���� ������ �� 5�� >> heap >> ���ӵ� ���� >> ���̸� index(÷��) >> [0][1][2][3][4]
//
//		System.out.println(score[0]);
//		score[0] = 100;
//		score[1] = 200;
//		score[2] = 300;
//		score[3] = 400;
//		score[4] = 500;
////		score[5] = 600; // ArrayIndexOutOfBoundsException
//
//		System.out.println(score[3]);
//		//Array �濡 �ִ� ��� ���� �� ���� ���
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.printf("[%d]=%d\t", i , score[i]);
//		}
//		System.out.println();
//		//�迭�� ��ü��
//		//����� ����� ���迭�� Object ���
//		for(int i = 0 ; i < score.length ; i++) { // Object.length�� ��ü ���̸� ������ִ� �޼ҵ�
//			System.out.printf("[%d]=%d\t", i , score[i]);
//		}
//		//java.utils.Arrays Helper Ŭ����
//		//for���� ���� Arrays ���� Ŭ�������� �ڵ����� ��ȯ������ - �迭 �ڷ����� String Ŭ���� ��ȯ
//		String resultArray = Arrays.toString(score);
//		System.out.println(resultArray);
//
//	//�ָ� (���� , �� ���� ����)
//	//�ʱ� ����(��������) swap
//
//	//Today Point(ó�� �Ͻô� �� �ϱ�)
//	//3����
//	int[] arr = new int[5];
//	int[] arr2 = new int[] {10,20,30,40,50}; // �ʱⰪ�� ���ؼ� �迭�� ������ �����ϰ� ���� �Ҵ�
//	int[] arr3 = {11 , 22, 33}; //�����Ϸ��� �˾Ƽ� new�� ���̰� ó��, ���� �־� �ʱ�ȭ
//
//	//TIP Javascript const arr = [1,2,3,4,5];
//	// let arr=[] arr.push(10) , arr.pop() Javascript �迭�� ���ñ���
//	// Javascript�� ���� �����迭��
//
//	for(int i = 0 ; i < arr2.length ; i++){
//		System.out.println(arr2[i]);
//	}
//
//	//�迭�� ��ü��
//	int[] arr4; //null (�ּҰ�) �޸𸮸� ������ ���� �ʾƿ�
//	arr4 = new int[] {1,2,3,4,5};
//
//	System.out.println(arr4); // arr4�� �ּ� ����
//	int[] arr5 = arr4; //�ּҰ� �Ҵ�
//	System.out.println(arr4 == arr5);
//
//	//�迭�� Ÿ���� 8 + 1 + Ŭ���� ���...
//	String[] strarr = new String[] {"��", "��", "��", "��"};
//	for(int j = 0; j < strarr.length ; j++){
//		System.out.println(strarr[j]);
//	}
//
//	char[] carr = {'A','B'};
//	float[] farr = {3.14f,0.12f};
//	//Today Point ��ü �迭
//
//	//Today Point ��ü �迭
//	Car[] cars = new Car[3];
//	cars[0] = new Car();
//	cars[1] = new Car();
//	cars[2] = new Car();
//	}
//}
//
//class Car{
//	int door;
//}