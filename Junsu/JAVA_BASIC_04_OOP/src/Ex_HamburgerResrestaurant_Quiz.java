import java.util.Scanner;

// �ʼ� ����, �ܹ����� ����
class Hamburger{
	String burgerName;
	int price;
	boolean topBread;
	boolean bottomBread;
	Hamburger(){
		this(true,true);
	}
	Hamburger(boolean topBread, boolean bottomBread){
		this.topBread = topBread;
		this.bottomBread = bottomBread;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return burgerName;
	}
}
//��Ŭ, ���ξ���, �����, �丶�� ����
// �Ҵ߼ҽ�, �Ұ�� �ҽ�, �������, �ɪy, ����´, ���ڹ�Ʈ �÷��� �ֽ��ϴ�.
class ChickenHamburger extends Hamburger{
	private Chicken chicken;
	//���� ��� �߰�
	private String pineApple;
	private String[] ingredients;
	//�߰��� 3�� ����!
	public ChickenHamburger(String[] ingredients) {
		super();
		super.burgerName = "ġŲ�ܹ���";
		super.price = 1700000;
		this.chicken = new Chicken();
		this. pineApple = "���ξ���";
		this.ingredients = ingredients;
//		super(); ���� ������ �۵� ���� super �� ����
	}
}
class BulgogiHamburger extends Hamburger{
	private int price;
	private Fatty fatty;
	private String sauce;
	private String[] ingredients;
	public BulgogiHamburger(String[] ingredients) {
		super();
		super.burgerName = "�Ұ���ܹ���";
		super.price = 5700000;
		this.fatty = new Fatty();
		this.sauce = "�Ұ��ҽ�";
		this.ingredients = ingredients;
	}
}
class MintChocoBananaHamburger extends Hamburger{
	private int price;
	private Banana banana;
	private String sauce;
	private String[] ingredients; 
	public MintChocoBananaHamburger(String[] ingredients) {
		super();
		super.burgerName = "��Ʈ���ڹٳ����ܹ���";
		super.price = 9999999;
		this.banana = new Banana();
		this.sauce = "��Ʈ���ڽ÷�";
		this.ingredients = ingredients;
	}
}
class SpecialHamburger extends Hamburger{
	private int price;
	private Banana banana;
	private String sauce;
	private String[] ingredients; 
	public SpecialHamburger(String[] ingredients, int price,String burgerName) {
		super();
		super.burgerName = burgerName;
		super.price = price;
		this.banana = new Banana();
		this.sauce = "��Ʈ���ڽ÷�";
		this.ingredients = ingredients;
	}
}
//������ �ϴ� ���鸸 ��ӹ޴� Ŭ����
class BakeNeed{
	boolean fried; // �⺻ false
	protected void bake() {
		this.fried = true;
	}
}
class Fatty extends BakeNeed{
	Fatty(){
		super.bake();
	}
}
class Banana extends BakeNeed{
	Banana(){
		super.bake();
	}
}
class Chicken extends BakeNeed{
	Chicken() {
		super.bake();
	}
}
class Fridge{
	private Hamburger[] storage;
	private int storageIndex;
	Fridge(){
		this(10);
	}
	Fridge(int size){
		storageIndex = 0;
		this.storage = new Hamburger[20];
	}
	//����� ����
	private void fridgeStatus() {
		System.out.print("����� ���� : ");
		for(int i = 0 ; i < storageIndex ; i++) {
			System.out.printf(" [ %s ] ", storage[i].burgerName);
		}
		System.out.println();
	}
	//�ܹ��� ����
	public void store(Hamburger hamburger) {
		storage[storageIndex++] = hamburger;
		System.out.println(hamburger.toString() + "�� ����� ����Ǿ����ϴ�.");
		fridgeStatus();
	}
	public int sell(String hambugerName) {
		//�ܹ��� �̸� �˻�
		for(int i = 0 ; i < storageIndex ; i++) {
			if(hambugerName.equals(storage[i].burgerName) ) {
				int price =  storage[i].getPrice();
				storage[i]=null;
				// ��ü ���� ����
				storageIndex--;
				for(int j = i ; j+1 <storage.length; j++) {
					if(storage[j+1] == null) {
						//�Ǹ� �ݾ� ��ȯ
						fridgeStatus();
						return price;
					}else {
						storage[j] = storage[j+1];
						storage[j+1]=null;
					}
				}
			}
		}
		// �ܺα� ����...��
		return -1;
	}
}

public class Ex_HamburgerResrestaurant_Quiz {//�ܹ����� ������, �Ŵ�����
	static int sales;
	public static void checkSales() {
		System.out.println("���� �� ������ : " + sales + "���Դϴ�.");
	}
	
	public static Hamburger makeHamburger(){ // ����Ʈ��  �߰� ���, ���� �� ��� ����
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(true) {
			choice = 0 ;
			System.out.println("���� ��ȣ �Է� 1. ġŲ����, 2. �Ұ����� 3. ��Ʈ���ڹٳ������� 4. ����ȹ���");
			choice = sc.nextInt();
			String[] ingredients = null;
			switch(choice) {
				case 1:
					//ġŲ�ܹ��� ����ʰ� üũ�غ�����
					//�� ���������� üũ �ʿ�
					return new ChickenHamburger(ingredients);
				case 2:
					//�Ұ���ܹ��� ����ʰ� üũ�غ�����
					//�� ���������� üũ �ʿ�
					return new BulgogiHamburger(ingredients);
				case 3:
					//���ʹ��ܹ��� ����ʰ� üũ�غ�����
					//�� ���������� üũ �ʿ�
					return new MintChocoBananaHamburger(ingredients);
				case 4:
					System.out.println("����� �ܹ��� ���� �Է�");
					int price = Integer.parseInt(sc.nextLine());
					String burgerName = sc.nextLine();
					//������ܹ��� ����ʰ� üũ�غ�����
					//���� �α׷����Ʈ�� ������ ������ �� ���������� üũ �ʿ�
					return new SpecialHamburger(ingredients, price,burgerName);
				default:
					System.out.println("�޴� ����� ���� �ٶ�");
			}
		}
	}
	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		fridge.store(makeHamburger());
		fridge.store(makeHamburger());
		fridge.store(makeHamburger());
		fridge.store(makeHamburger());
		fridge.store(makeHamburger());
		fridge.store(makeHamburger());
		fridge.store(makeHamburger());
		sales+=fridge.sell("ġŲ�ܹ���");
		sales+=fridge.sell("�Ұ���ܹ���");
		sales+=fridge.sell("��Ʈ���ڹٳ����ܹ���");
		checkSales();
	}
}
