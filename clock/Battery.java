package clock;

public class Battery {
	private String SerialNumber;
	private BatteryCell[] cells;
	private int chargingPercent; // 0~100
	public Battery(BatteryCell[] cells){
		this.cells = cells;
	}
	private String initSerial() {
		// 이닛시리얼 공유
		return null;
	}
	public void charging(Battery battery) {
		if(0<= battery.chargingPercent && battery.chargingPercent <=95 ) {
			battery.cells += 5;
			System.out.println("5%충전... 현재 충전량" + battery.cells);
		}
	}
	public void change(Battery battery) {
		this.SerialNumber = battery.SerialNumber;
		this.cells = battery.cells;
		this.chargingPercent = battery.chargingPercent;
	}
}
