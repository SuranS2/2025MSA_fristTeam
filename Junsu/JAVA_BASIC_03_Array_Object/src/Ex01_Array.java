import java.util.Arrays;

public class Ex01_Array {

	public static void main(String[] args) {
		int s, s2, s3, s4;
		int s5;
		int s6;
		int s7;
		// 같은 타입의 변수 여러개를 선언해서 사용
		
		//배열
		int[] score = new int[5];
		// score 101동 >> 101호, 102호, 103호
		//int 타입을 가지는 방 5개 >> heap >> 연속된 공간 >> 방이름 index(첨자) >> [0][1][2][3][4]
		
		System.out.println(score[0]);
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
//		score[5] = 600; // ArrayIndexOutOfBoundsException
		
		System.out.println(score[3]);
		//Array 방에 있는 모든 값을 한 번에 출력
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("[%d]=%d\t", i , score[i]);
		}
		System.out.println();
		//배열은 객체다
		//사용자 만드는 모든배열은 Object 상속
		for(int i = 0 ; i < score.length ; i++) { // Object.length는 객체 길이를 출력해주는 메소드
			System.out.printf("[%d]=%d\t", i , score[i]);
		}
		//java.utils.Arrays Helper 클래스
		//for문을 몰라도 Arrays 헬퍼 클래스에서 자동으로 변환시켜줌 - 배열 자료형을 String 클래스 변환
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray);
	
	//주말 (버블 , 퀵 정렬 연습)
	//초급 시험(버블정렬) swap
	
	//Today Point(처음 하시는 분 암기)
	//3가지
	int[] arr = new int[5];
	int[] arr2 = new int[] {10,20,30,40,50}; // 초기값을 통해서 배열의 개수를 정의하고 값을 할당
	int[] arr3 = {11 , 22, 33}; //컴파일러가 알아서 new를 붙이고 처리, 값만 주어 초기화
	
	//TIP Javascript const arr = [1,2,3,4,5]; 
	// let arr=[] arr.push(10) , arr.pop() Javascript 배열은 스택구조
	// Javascript는 전부 동적배열임
	
	for(int i = 0 ; i < arr2.length ; i++){
		System.out.println(arr2[i]);
	}
	
	//배열은 객체다
	int[] arr4; //null (주소값) 메모리를 가지고 있지 않아요
	arr4 = new int[] {1,2,3,4,5};
	
	System.out.println(arr4); // arr4의 주소 나옴
	int[] arr5 = arr4; //주소값 할당
	System.out.println(arr4 == arr5);
	
	//배열의 타입은 8 + 1 + 클래스 등등...
	String[] strarr = new String[] {"가", "나", "다", "라"};
	for(int j = 0; j < strarr.length ; j++){
		System.out.println(strarr[j]);
	}
	
	char[] carr = {'A','B'};
	float[] farr = {3.14f,0.12f};
	//Today Point 객체 배열

	//Today Point 객체 배열
	Car[] cars = new Car[3];
	cars[0] = new Car();
	cars[1] = new Car();
	cars[2] = new Car();
	}
}

class Car{
	int door;
}