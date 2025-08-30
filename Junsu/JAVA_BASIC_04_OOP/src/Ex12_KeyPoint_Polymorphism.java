//전자제품의 공통사항 모든 전자제품은 가격, 제품의 포인트 정보가 있다
//전자제품의 공통사항 모든 전자제품은 가격, 제품의 포인트 정보가 있다
class Product{
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}	
}
// 이하 각 전자제품들의 가격, 정보들 - 구체화, 특징
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	
	@Override
	public String toString(){
		return "KtTv";
	}
}
class Audio extends Product{
	Audio(){
		super(100);
	}
	
	@Override
	public String toString(){
		return "Audio";
	}
}
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	
	@Override
	public String toString(){
		return "NoteBook";
	}
}
//구매자
class Buyer{
	int money;
	int bonuspoint;
	//KtTv , Audio , Notebook
	Buyer(){
		this.money = 2000;
	}
	void productBuy(Product n) { // 상속 관계에서 부모 타입은 자식 객체의 주소를 받을 수 있다.
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다^^" + this.money);
			return; // 함수의 종료 (강제)
		}
		
		//실 구매행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("현재 잔액은 : " + this.money);
		// 부모 객체인 n이 자식 객체의 주소를 가지고 있더라도 재정의된 toString이 출력됨!@
		System.out.println("구매한 물건은 : " + n.toString());
	}
}
public class Ex12_KeyPoint_Polymorphism {

	public static void main(String[] args) {
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook noteBook = new NoteBook();
		
		Buyer buyer = new Buyer();
		
		buyer.productBuy(noteBook);
		buyer.productBuy(kt);
		buyer.productBuy(audio);
	}
}