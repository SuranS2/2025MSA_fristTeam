
public class Ex15_Singleton {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton S3 = Singleton.getInstance();
		
		System.out.println(s == s2);
		System.out.println(s == s2);
	}
}
