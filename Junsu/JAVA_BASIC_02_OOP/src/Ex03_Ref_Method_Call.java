import kr.or.kosa.Tv;

public class Ex03_Ref_Method_Call {

	public static void main(String[] args) {
		//Tv �� �븦 ���弼��
		//�޸𸮿� �ø����� >> heap
		
		Tv lgTv = new Tv();
		lgTv.brandName = "LG";
		lgTv.tvInfo();
		
		lgTv.channelUp();
		lgTv.channelUp();
		lgTv.channelUp();
		lgTv.channelUp();
		
		lgTv.tvInfo();
		
		Tv samsungTv = new Tv();
		samsungTv.brandName = "samsung";
		samsungTv.tvInfo();
		
		samsungTv.channelUp();
		samsungTv.channelUp();
		samsungTv.channelUp();
		samsungTv.channelUp();
		samsungTv.tvInfo();

	}

}
