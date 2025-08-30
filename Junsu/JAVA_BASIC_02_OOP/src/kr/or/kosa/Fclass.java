package kr.or.kosa;

public class Fclass {
	public int data; //default
	//함수의 접근자(수정자) : 70% public
	//함수 30% private : 공통함수 ( 클래스 [내부]에서 다른 함수를 동와주는 함수 helper 함수)
	
	public void m() { //void = return parameter(x);
		//기능구현
		System.out.println("일반함수 : void , parameter(x)");
	}
	public void m2(int i) {
		System.out.println("일반 함수 : void , parameter(0)");
		System.out.println("parameter 값 활용 : " + i);
	}
	public int m3() { //강제로 return 키워드
		return 100;
	}
	public int m4(int data) {
		return 100 + data;
	}
	//여기까지가 가장 기본적인 4가지 함수형태
	//확장
	
	public int sum(int i, int j, int k) { //return type, parameter(0)
		return i+j+k;
	}
	private int subSum(int i) {//객체에서 접근 불가(클래스 내부 ...)
		return i+100;
	}
	public void callSubsum() {
		int result = subSum(100);
		System.out.println("result : "+ result);
	}
	public int opSum(int data) {
		int result = subSum(data);
		//제어
		if(result > 0) {
			return 1;
		}else {
			return -1;
		}
	}
	/*
	 *함수를 생성하는데 정수 타입의 parameter 2개를 받아서 둘 중에 큰 값을 리턴하는 함수를 만드세요
	 ex)max(10,5) return 10;
	 */
	 public int max(int a, int b) {
		 //60점 정도?
		 if(a>b) {
			 return a;
		 }else {
			 return b;
		 }
	}
	 public int max2(int a, int b) {
		 //90점 정도? , max를 함수에서 더 활용을 안함
		 int max = (a>b) ? a : b;
		 return max;
	}
	 public int max3(int a, int b) {
		 // 가장 심플한 코드
		 // 간단한 논리(if랑 else로만 있는 경우 쓰면 좋음)
		 return (a>b) ? a : b;
	}
}
