import java.io.IOException;

import kr.or.kosa.utils.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
//		try {
//			
//		}catch(NullPointerException | IOException e) {
//			e.printStackTrace();
//		}
		try {
			ExClass ex = new ExClass("C:\\temp");
		}
//		catch(Exception e){ //���� ���ܴ� ���� �ִٸ� ���� ������ �� ä��!
//			e.printStackTrace();
//		}
		catch(IOException e) {
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e) {
			
		}
		
		//�ʺ��ڰ� ó�� �ۼ��ϴ� ���� �ڵ�, ������ ������
		try {
			ExClass ex = new ExClass("C:\\temp");
		}catch ( Exception e) {
		}
	}

}
