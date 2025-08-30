package kr.or.kosa;

public class Bird{
	//공통기능
		public void fly(){
			System.out.println("flying");
		}
		//날아다니니까 빠르지
//		public void moveFast(){
//			fly();
//		}
		
		protected void moveFast(){ // 상속해서 재정의해서 사용해
		}
		/*
		설계자 고민
		새는 빠르다
		fly 
		새: 타조 (달리기)
		*/
		
	}