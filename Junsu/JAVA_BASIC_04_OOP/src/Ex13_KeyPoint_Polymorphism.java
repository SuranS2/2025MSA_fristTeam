//������ǰ�� ������� ��� ������ǰ�� ����, ��ǰ�� ����Ʈ ������ �ִ�
class Product2{
	int price;
	int bonuspoint;
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}	
}
// ���� �� ������ǰ���� ����, ������ - ��üȭ, Ư¡
class Audio2 extends Product{
	Audio2(){
		super(100);
	}
	@Override
	public String toString(){
		return "Audio";
	}
}
class NoteBook2 extends Product{
	NoteBook2(){
		super(150);
	}
	@Override
	public String toString(){
		return "NoteBook";
	}
}
class Buyer2{
	int money;
	int bonuspoint;
	Product[] cart;
	Buyer2(){
		// ���� ������
		this(150000);
	}
	Buyer2(int money){
		cart = new Product[10];
		this.money = money;
	}
	void productBuy(Product item) {
		int i = 0;
		for(Product space : cart) {
			if(i >= cart.length) {
				System.out.println("���� ������ �����");
				break;
			}
			if(space== null) {
				System.out.println(item.toString());
				cart[i] = item;
				return;
			}
			i++;
		}
	}
	void summary() {
		int sum = 0;
		int sumBonusPoint = 0 ;
		String products = "";
		for(Product item : this.cart) {
			if(item == null) {
				break;
			}
			System.out.println(item.toString());
			sum+= item.price;
			// �θ� ��ü�� �ڽ� ��ü�� �ּҸ� ������ �ִ��� �����ǵ� toString�� ��µ�!@
			products+= item.toString();
			sumBonusPoint += item.bonuspoint;
		}
		if(this.money < sum){
			System.out.println("���� �ܾ��� �����մϴ�^^" + this.money);
			return; 
		}
		//�� ��������
		this.money -= sum;
		this.bonuspoint += sumBonusPoint;
		System.out.println("���� �ܾ��� : " + this.money);
		System.out.println("������ ������ : " + products);
	}
}

public class Ex13_KeyPoint_Polymorphism {

	public static void main(String[] args) {
		Audio2 audio = new Audio2();
		NoteBook2 noteBook = new NoteBook2();
		
		Buyer2 buyer = new Buyer2();
		buyer.productBuy(noteBook);
		buyer.productBuy(audio);
		buyer.summary();
		
	}
}
