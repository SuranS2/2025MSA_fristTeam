import kr.or.kosa.common.AirPlane;

class Emp{
  
}
class Dept{ // default class Dept
  int deptno; // 접근자 x default int deptno 같은 클래스 내에서 사용됨!
  public String dname; // 에러는 아니지만 의미가 없음, dept가 default여서 다른 패키지에서 사용불가
  private int count; //설계자의 의도 감추다, 숨기다, 캡슐화
                    // 설계자의 의도 : 클래스 내부에서만 사용
                    // 설계자의 의도 : 직접할당은 막고 간접할당으로 제어 
                    // getter, setter,메소드 사용

  //특수한 함수(기능)
  //getter 함수( 읽기 전용 )
  public int getCount(){
    return count;
  }

  //setter 함수
  public void setCount(int num){
    
    // count = num;// 직접할당이랑 다를게 없음
    if(num<0){
      count = 0;
    }else{
      count = num;
    }
    // this.count = count 가 정석
    
  }
  
}

//연습용
//실무에서는 이렇게 사용하지 않음, default같은 패키지(폴더) 에서 사용가능
class Test{ // default class...
	int i; // default int ...
	void print() { //default void print
		for(int i = 0 ; i  <=  100 ; i++) {
			
		}
	}
}

public class Ex01_Main{
  public static void Main(String[] args){
    //Dept 구체화(메모리 올려서 사용하겠다)
    Dept dept = new Dept();

    dept.deptno = 10;
    dept.dname = "홍길동";
    dept.setCount(-10);
    System.out.println(dept.getCount());// 0 출력

    AirPlane airPlane = new AirPlane();
//    Car car = new Car(); //사용 불가능, 다른 kr.or.kosa.common 패키지의 default 접근자
    
    Test t = new Test();
    t.i = 100; //default여서 접근 가능
    t.print(); //defualt여서 접근 가능
  }
}