//
//public class Ex06_String_Method {
//
//	public static void main(String[] args) {
//		String str = "hello";
//		String concatstr = str.concat(" world"); //�� ���� �̾� ���ο� ���ڿ� ����
//		System.out.println(concatstr); // hello world;
//
//		System.out.println(str.contains("ello") ); //CharSequence s = ������ �迭 �� �����ϴ���?
//		String str2 = "a b c d"; // [a][ ][b][ ][c][ ][d]
//		System.out.println(str2.length()); // 7
//
//		String filename ="hello java world";
//		System.out.println(filename.indexOf("e")); //indexOf overloading �� �޼��� ù ��°���� Ž���ؼ� ���� �ε��� Ž�� 1
//		System.out.println(filename.indexOf("java")); //���� �������� ���� �� ����
//		System.out.println(filename.indexOf("kava")); // �迭 �Լ� ���� ���ٸ� -1
//		if(filename.indexOf("wo") != -1) {
//			System.out.println("wo�� �ϳ��� �ִ�");
//		}
//
//		// Ư�� ���忡�� ���� ���ϴ� �ܾ��� ���Կ��θ� Ȯ��
//		//�迭 �Լ� ���� ���ٸ� -1
//
//		System.out.println(filename.lastIndexOf("a")); // �ڿ������� ���� �� �ε��� 0~���� �Ÿ� 9
//
//		String file = "home.jpg";
//		int dotIndex = file.lastIndexOf(".");
//		String filename2 = file.substring(0,dotIndex);
//		String extention = file.substring(dotIndex+1);
//		System.out.println(filename2 + "."  + extention);
//
//		String str4 = "�����, ��Ƽ, �����, �Ķ���, ������";
//		//"�����, ��Ƽ, �����.�Ķ���, ������";   , . �� �����Ϸ��� StringTokenizer Ŭ���� ����ؾ���
//		String[] namearray = str4.split(",");
//		for(String s : namearray){
//			System.out.println(s);
//		}
//		// ���۸�
//		// ��Ƽ
//		// �����
//		// �Ķ���
//		// ������
//		String str5 = "�����.��Ƽ.�����.�Ķ���.������";
//		String[] namearray2 = str5.split(".");
//		for(String s : namearray2){
//			System.out.println(s);
//		}
//		String ip = "192.168.0.0";
//		String [] iparray = ip.split("\\.");
//		for(String s : iparray){
//			System.out.println(s);
//		}
//		string
//		int sum = 0;
//		String[] numarr = {"1", "2", "3", "4"};
//		// �迭�� ���� (1+2+3+4)
//		for(String s : numarr){
//			sum+=Integer.parseInt(s);
//		}
//		System.out.println(sum);
//
//		//2
//		String jumin = "123456-1234567";
//		// �ֹε�Ϲ�ȣ�� �� 1+2+3+4+5+6+1+2+3+4+5+6+7
//		sum = 0;
//		for(String splitBig : jumin.split("-")){
//			for(String splitEach : splitBig.split("") ) {
//				sum+= Integer.parseInt(splitEach );
//			}
//		}
//		System.out.println(sum);
//
//	}
//}