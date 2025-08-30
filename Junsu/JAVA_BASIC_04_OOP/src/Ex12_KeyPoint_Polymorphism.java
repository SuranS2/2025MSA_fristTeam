//������ǰ�� ������� ��� ������ǰ�� ����, ��ǰ�� ����Ʈ ������ �ִ�
//������ǰ�� ������� ��� ������ǰ�� ����, ��ǰ�� ����Ʈ ������ �ִ�
class Product{
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}	
}
// ���� �� ������ǰ���� ����, ������ - ��üȭ, Ư¡
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
//������
class Buyer{
	int money;
	int bonuspoint;
	//KtTv , Audio , Notebook
	Buyer(){
		this.money = 2000;
	}
	void productBuy(Product n) { // ��� ���迡�� �θ� Ÿ���� �ڽ� ��ü�� �ּҸ� ���� �� �ִ�.
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�^^" + this.money);
			return; // �Լ��� ���� (����)
		}
		
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("���� �ܾ��� : " + this.money);
		// �θ� ��ü�� n�� �ڽ� ��ü�� �ּҸ� ������ �ִ��� �����ǵ� toString�� ��µ�!@
		System.out.println("������ ������ : " + n.toString());
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