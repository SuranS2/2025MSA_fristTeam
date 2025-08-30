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
			
			throw new IOException("Install ���� ���� �߻� ...");
		}catch(Exception e) {
			System.out.println("���� �߻� : " + e.getMessage());
		}finally {
			//���� ���� ��
			//����, ������ ������ ����
			//�Լ��� ������ return�� �����ϰ� ������ ����
			fileDelete();
		}
	}
}
