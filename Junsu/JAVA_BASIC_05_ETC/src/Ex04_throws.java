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
//		catch(Exception e){ //상위 예외는 위에 있다면 먼저 에러를 다 채감!
//			e.printStackTrace();
//		}
		catch(IOException e) {
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e) {
			
		}
		
		//초보자가 처음 작성하는 에러 코드, 가독성 떨어짐
		try {
			ExClass ex = new ExClass("C:\\temp");
		}catch ( Exception e) {
		}
	}

}
