import kr.or.kosa.common.AirPlane;

class Emp{
  
}
class Dept{ // default class Dept
  int deptno; // ������ x default int deptno ���� Ŭ���� ������ ����!
  public String dname; // ������ �ƴ����� �ǹ̰� ����, dept�� default���� �ٸ� ��Ű������ ���Ұ�
  private int count; //�������� �ǵ� ���ߴ�, �����, ĸ��ȭ
                    // �������� �ǵ� : Ŭ���� ���ο����� ���
                    // �������� �ǵ� : �����Ҵ��� ���� �����Ҵ����� ���� 
                    // getter, setter,�޼ҵ� ���

  //Ư���� �Լ�(���)
  //getter �Լ�( �б� ���� )
  public int getCount(){
    return count;
  }

  //setter �Լ�
  public void setCount(int num){
    
    // count = num;// �����Ҵ��̶� �ٸ��� ����
    if(num<0){
      count = 0;
    }else{
      count = num;
    }
    // this.count = count �� ����
    
  }
  
}

//������
//�ǹ������� �̷��� ������� ����, default���� ��Ű��(����) ���� ��밡��
class Test{ // default class...
	int i; // default int ...
	void print() { //default void print
		for(int i = 0 ; i  <=  100 ; i++) {
			
		}
	}
}

public class Ex01_Main{
  public static void Main(String[] args){
    //Dept ��üȭ(�޸� �÷��� ����ϰڴ�)
    Dept dept = new Dept();

    dept.deptno = 10;
    dept.dname = "ȫ�浿";
    dept.setCount(-10);
    System.out.println(dept.getCount());// 0 ���

    AirPlane airPlane = new AirPlane();
//    Car car = new Car(); //��� �Ұ���, �ٸ� kr.or.kosa.common ��Ű���� default ������
    
    Test t = new Test();
    t.i = 100; //default���� ���� ����
    t.print(); //defualt���� ���� ����
  }
}