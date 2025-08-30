package kr.or.kosa;

public class AirPlane {
		private static int amountPlane;
		private String planeName;
		private int planeNum;
		public void makePlane(String planeName, int planeNum) {
			this.planeName = planeName;
			this.planeNum = planeNum;
			amountPlane++;		
		}
		public void printInfo() {
			System.out.println(planeName + planeNum);
		}
		public void printAmountPlane() {
			System.out.println(amountPlane);
		}

}