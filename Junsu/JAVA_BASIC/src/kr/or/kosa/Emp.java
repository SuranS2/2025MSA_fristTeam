package kr.or.kosa;

public class Emp {
	//main 함수가 없다

	
	//사원은 사원번호와 이름을 가지고 있다(필드)
	public int empno;
	public String ename;
	private int data=0;
	
	public void Info() {
		System.out.println(this.empno+"/"+this.data);
	}
}
