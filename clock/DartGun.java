package clock;

public class DartGun {
	// 마취침 개수 (0~999)
	private int needleCnt;
	// 남은 마취약 약 mg
	private int remainingAnesthetic;
	
	DartGun(){
		this.needleCnt=0;
		this.remainingAnesthetic=0;
	}
	
	public void shootNeedle() {
		if(needleCnt !=0 ) {
			needleCnt--;
			System.out.println("마취침 발사");
		}else {
			System.out.println("마취침 개수 부족");
		}
	}
	
	public void setNeedel(int needleCnt) {
		int sum = this.needleCnt + needleCnt;
		
	}
	
	public void setRemainingAnesthetic(int remainingAnesthetic) {
		
	}
}
