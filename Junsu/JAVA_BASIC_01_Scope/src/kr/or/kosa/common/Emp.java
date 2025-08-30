package kr.or.kosa.common;

//��� 1���� ������ ��� �ִ� DTO ��ü, ���ۿ�
//VO Value Object �� ��ü, �����͸� ��� ���� ��ü
//DOMAIN
// �����͸� ���� �� �ִ� Ŭ������ �̸���, �ʵ带 private�� ������
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int sal;
	//�����Ҵ�
	// source => generate Getter, Setter�� �ڵ����� getter setter �������
	 
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
