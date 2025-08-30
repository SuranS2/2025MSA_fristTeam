package kr.or.kosa.common;

//사원 1명의 정보를 담고 있는 DTO 객체, 전송용
//VO Value Object 값 객체, 데이터를 담기 위한 객체
//DOMAIN
// 데이터를 담을 수 있는 클래스의 이름들, 필드를 private로 지정함
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int sal;
	//간접할당
	// source => generate Getter, Setter시 자동으로 getter setter 만들어짐
	 
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
