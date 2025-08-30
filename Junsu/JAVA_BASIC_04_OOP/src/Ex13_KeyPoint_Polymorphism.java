//전자제품의 공통사항 모든 전자제품은 가격, 제품의 포인트 정보가 있다
class Product2{
	int price;
	int bonuspoint;
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}	
}
// 이하 각 전자제품들의 가격, 정보들 - 구체화, 특징
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
		// 구매 지원금
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
				System.out.println("넣을 공간이 없어용");
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
			// 부모 객체가 자식 객체의 주소를 가지고 있더라도 재정의된 toString이 출력됨!@
			products+= item.toString();
			sumBonusPoint += item.bonuspoint;
		}
		if(this.money < sum){
			System.out.println("고객님 잔액이 부족합니다^^" + this.money);
			return; 
		}
		//실 구매행위
		this.money -= sum;
		this.bonuspoint += sumBonusPoint;
		System.out.println("현재 잔액은 : " + this.money);
		System.out.println("구매한 물건은 : " + products);
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
