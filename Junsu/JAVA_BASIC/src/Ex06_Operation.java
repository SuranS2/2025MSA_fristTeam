
public class Ex06_Operation {

	public static void main(String[] args) {
		 int score=65;
	      String grade=""; //���ڿ� �ʱ�ȭ A+, A-, C+
	      System.out.println("����� ������: " + score);
	      //�� ����, ���� ���ǹ� Ȱ��
	      switch(score/10){
	          case 10:
	          case 9:
	            grade += "A";
	            break;
	          case 8:
	            grade += "B";
	            break;
	          case 7:
	            grade += "C";
	            break;
	          default:
	            grade += "F";
	      }
	      if(score>=70) {
	    	  grade += (score%10 >= 5) ? "+" : (score%10 > 0) ? "-" : "";
	      }
	      System.out.println("����� ������ : " + grade);
	      

		for(int i = 2; i<=9; i++){
			System.out.print(i + "��" + "\t");
		  for(int j = 1; j<=9;j++){
				    System.out.print(i + " * " + j + " = " + i*j  + "\t");
				  }
		  System.out.println();
		}

	}

}
