class Car{
	String carName = "����";
	
	public Car(){
		System.out.println("���� �⺻ ������ �Լ�");
		carName="������ 911";
	}
}

class School{
	String schoolName = "����";
	//default ������ ����(�����Ϸ��� �ڵ� �����ϴ� ����) public School() { }
}

class Car2{
	String carName;
}
class Car3{
	String carName;
	public Car3(){ //default constructor method
		carName = "����"; //carName �ʱ�ȭ
	}
}
class Car4{
	String carName;
	public Car4() { //default
		carName="�⺻����";
	}
	public Car4(String name){ // ������ overloading
		carName = name;
	}
	// Car4 ����ϴ� �����ڿ��� ���ñ� �ο� (default, overloading)
}
class Car5{
	String carName;
	// ���� �����ڰ� ������ overloading�� 1���� �Ѵٸ�
	// default constructor ���� X
	public Car5(String name){ 
		carName = name;
	}
}

public class Ex12_Constructor{
	public void main(String args[]){
		Car car = new Car(); //default �Լ� ȣ��
		System.out.println(car.carName);
	}
}