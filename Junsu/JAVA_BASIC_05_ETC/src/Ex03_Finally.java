import java.io.IOException;

public class Ex03_Finally {
	static void copyFiles() {
		System.out.println("copy files");
	}
	static void startInstall() {
		System.out.println("install ... ");
	}
	static void fileDelete() {
		System.out.println("file delete...");
	}
	public static void main(String[] args) {
		try {
			copyFiles();
			startInstall();
			
			throw new IOException("Install 도중 문제 발생 ...");
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}finally {
			//강제 실행 블럭
			//정상, 비정상 무조건 실행
			//함수가 가지는 return을 무시하고 무조건 실행
			fileDelete();
		}
	}
}
