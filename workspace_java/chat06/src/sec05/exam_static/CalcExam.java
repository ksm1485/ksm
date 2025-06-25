package sec05.exam_static;

public class CalcExam {

	public static void main(String[] args) {

		System.out.println("Calc.pi : "+ Calc.pi);
		
		Calc c1 = new Calc();
		c1.color = "블랙";
		System.out.println("c1.pi : "+ c1.pi);

		Calc c2 = new Calc();
		c2.color = "화이트";
		System.out.println("c2.pi : "+ c2.pi);
	}
	
}
