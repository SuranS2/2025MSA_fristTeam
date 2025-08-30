import java.util.Scanner;

// 필수 조건, 햄버거의 정의
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
//피클, 파인애플, 양상추, 토마토 재료들
// 불닭소스, 불고기 소스, 마요네즈, 케챱, 딸기쨈, 초코민트 시럽이 있습니다.
class ChickenHamburger extends Hamburger{
	private Chicken chicken;
	//개별 재료 추가
	private String pineApple;
	private String[] ingredients;
	//추가는 3개 제한!
	public ChickenHamburger(String[] ingredients) {
		super();
		super.burgerName = "치킨햄버거";
		super.price = 1700000;
		this.chicken = new Chicken();
		this. pineApple = "파인애플";
		this.ingredients = ingredients;
//		super(); 순서 문제로 작동 안함 super 맨 위로
	}
}
class BulgogiHamburger extends Hamburger{
	private int price;
	private Fatty fatty;
	private String sauce;
	private String[] ingredients;
	public BulgogiHamburger(String[] ingredients) {
		super();
		super.burgerName = "불고기햄버거";
		super.price = 5700000;
		this.fatty = new Fatty();
		this.sauce = "불고기소스";
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
		super.burgerName = "민트초코바나나햄버거";
		super.price = 9999999;
		this.banana = new Banana();
		this.sauce = "민트초코시럽";
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
		this.sauce = "민트초코시럽";
		this.ingredients = ingredients;
	}
}
//구워야 하는 재료들만 상속받는 클래스
class BakeNeed{
	boolean fried; // 기본 false
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
	//냉장고 상태
	private void fridgeStatus() {
		System.out.print("냉장고 상태 : ");
		for(int i = 0 ; i < storageIndex ; i++) {
			System.out.printf(" [ %s ] ", storage[i].burgerName);
		}
		System.out.println();
	}
	//햄버거 저장
	public void store(Hamburger hamburger) {
		storage[storageIndex++] = hamburger;
		System.out.println(hamburger.toString() + "가 냉장고에 저장되었습니다.");
		fridgeStatus();
	}
	public int sell(String hambugerName) {
		//햄버거 이름 검색
		for(int i = 0 ; i < storageIndex ; i++) {
			if(hambugerName.equals(storage[i].burgerName) ) {
				int price =  storage[i].getPrice();
				storage[i]=null;
				// 전체 공간 빼기
				storageIndex--;
				for(int j = i ; j+1 <storage.length; j++) {
					if(storage[j+1] == null) {
						//판매 금액 반환
						fridgeStatus();
						return price;
					}else {
						storage[j] = storage[j+1];
						storage[j+1]=null;
					}
				}
			}
		}
		// 햄부기 없음...ㅜ
		return -1;
	}
}

public class Ex_HamburgerResrestaurant_Quiz {//햄버거집 관리자, 매니저임
	static int sales;
	public static void checkSales() {
		System.out.println("현재 총 매출은 : " + sales + "원입니다.");
	}
	
	public static Hamburger makeHamburger(){ // 엑스트라  추가 재료, 갯수 및 재료 검증
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(true) {
			choice = 0 ;
			System.out.println("버거 번호 입력 1. 치킨버거, 2. 불고기버거 3. 민트초코바나나버거 4. 스페셜버거");
			choice = sc.nextInt();
			String[] ingredients = null;
			switch(choice) {
				case 1:
					//치킨햄버거 재료초과 체크해봐야함
					//잘 구워졌는지 체크 필요
					return new ChickenHamburger(ingredients);
				case 2:
					//불고기햄버거 재료초과 체크해봐야함
					//잘 구워졌는지 체크 필요
					return new BulgogiHamburger(ingredients);
				case 3:
					//민초바햄버거 재료초과 체크해봐야함
					//잘 구워졌는지 체크 필요
					return new MintChocoBananaHamburger(ingredients);
				case 4:
					System.out.println("스페셜 햄버거 가격 입력");
					int price = Integer.parseInt(sc.nextLine());
					String burgerName = sc.nextLine();
					//스페셜햄버거 재료초과 체크해봐야함
					//만약 인그레디언트에 뭐뭐뭐 있으면 잘 구워졌는지 체크 필요
					return new SpecialHamburger(ingredients, price,burgerName);
				default:
					System.out.println("메뉴 제대로 선택 바람");
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
		sales+=fridge.sell("치킨햄버거");
		sales+=fridge.sell("불고기햄버거");
		sales+=fridge.sell("민트초코바나나햄버거");
		checkSales();
	}
}
