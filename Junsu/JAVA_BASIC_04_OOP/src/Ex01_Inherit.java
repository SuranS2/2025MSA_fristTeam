class Car{ 	//class Car extends Object 생략
	// Car 부모는 Object
	// Object 꺼는 내꺼 (상속관계에서)
}
class GrandFather{
	public int gmoney = 5000;
	public GrandFather(){
		System.out.println("GrandFather 생성자");
	}
}
class Father extends GrandFather{
	public int fmoney = 3000;
	public Father(){
		System.out.println("Father 생성자");
	}
}
class Child extends Father{
	public int cmoney = 100;
	public Child(){
		System.out.println("Child 생성자");
	}
}

public class Ex01_Inherit{
	public static void main(String[] args){
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
	}
}