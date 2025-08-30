/*
 static member field : 객체간 공유 자원
 static method : 객체간 공유 메소드
 
 1. 설계도
 1.1 static 자원 ( 변수, 함수) 
 - 객체 생성 없이 사용해라
 - 편하게 빠르게 써라
 - ** 많이 사용하니까  : System.out (Static Final printStream 객체의 public 자원들)
 - 자원을 많이 사용할 것 같아 : new 없이 쓰게 해줄게
 - 어플리케이션이 죽을 때까지 자원이 남아있음
 static은 class method area에 올라가기 때문에 가비지컬렉터가 정리해주질 않음
 */

class StaticClass{
	int iv;
	static int cv;
	static void print() {
		// instance variable 관리 불가
		System.out.println("static method");
	}
	void printIv() {
		// 일반 함수, StaticClass가 new를 통해 heap 메모리에 올라갔을때 사용 가능
		// cv를 컨택할 수 있음
		cv = 100; // 순서상 static 올라가고 난 후 올라간 상황
	}
	// 설계를 잘 모르겠으면 끼리끼리 뭉쳐라 static은 static , 일반 함수는 일반 함수
}
//static 자원과 일반 자원의 공생관계를 알아야한다

public class Ex08_Static_Method {
	public static void main(String[] args) {
		StaticClass.print();
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv); // 100
	}
}
