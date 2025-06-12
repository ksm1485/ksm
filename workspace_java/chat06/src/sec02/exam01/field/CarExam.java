package sec02.exam01.field;

public class CarExam {

	public static void main(String[] args) {
		
		// 객체(클레스) 생성
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		myCar.company = "맥라렌";
		System.out.println(myCar.company);
		
		System.out.println(myCar.speed);
		myCar.speed = 400;
		System.out.println(myCar.speed);
		
		Car myCar2 = new Car();
		System.out.println(myCar2.company);
	}

}
