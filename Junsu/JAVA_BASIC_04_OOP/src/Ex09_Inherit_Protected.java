import kr.or.kosa.Bird;

class Bi extends Bird{
	@Override
	public void moveFast() {
		super.moveFast();
	}
}
class Ostrich extends Bird{
	// Ư¡ (��üȭ, Ư��ȭ)
	void run() {
		System.out.println("�޸���");
	}
	@Override
	public void moveFast() {
		run();
	}
}

public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly();
		bi.moveFast();
		Ostrich rich = new Ostrich();
		rich.moveFast();
	}
}
