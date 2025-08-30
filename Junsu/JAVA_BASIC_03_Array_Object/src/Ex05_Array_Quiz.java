import kr.or.kosa.Emp;

public class Ex05_Array_Quiz {

	public static void main(String[] args) {
		/*
		 1. 사원 3명을 만드세요
		 1000, 홍길동
		 2000, 김유신
		 3000, 유관순
		 */
		 Emp[] emp = {new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		 /*
		 2. 개선된 for문으로 사번, 이름 모두 출력
		 */
		 for(Emp worker : emp){
			 worker.empInfoPrint();
		 }
	}
}
