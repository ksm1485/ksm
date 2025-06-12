package sec04.exam06_overloading;

public class Calc {
	
	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a + b;
	}
//	 전달인자가 int, int로 같기 때문에 오버로딩 적용 안됨
//	int plus(int a, int b) {
//		return a + b;
//	}
	
	double plus(double a, double b) {
		System.out.println("double double 실행");
		return a + b;
	}
	
	
	
	
	
	
}
