package clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Watch {
	private String watchSerialNum;	//시계 시리얼 넘버
	private int watchSize;	//시계 직경
	private String ownerName;	//소유자 이름
	
	//부품
	private Display display;
	
	public Watch() {
		this("소유자");
	}
	
	public Watch(String ownerName) {
		this.watchSerialNum = createWatchSerialNum();
		this.watchSize = 28;
		this.ownerName = ownerName;
	}
	
	private String createWatchSerialNum(){
		return UUID.randomUUID().toString().replace("-", "").substring(0,11);
	}
	
	public void printTime() {
		System.out.println(LocalDateTime.now());
	}
		public void printDate() {		
		System.out.println(LocalDate.now());
	}
}
