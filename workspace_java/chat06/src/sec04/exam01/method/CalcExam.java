package sec04.exam01.method;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		calc.powerOn();
		
		calc.powerOff();
	
	/**
	 *  더하기 기능
	 *  두 수를 입력 받아서 더한 결과를 돌려준다
	 *  
	 *  메소드명 : plus
	 *  전달인자 : int x, int y
	 *  리턴타입 : int (두 수의 합)
	 *  
	 */
	}
	 int plus(int x, int y)  {
		 System.out.println("x : "+ x);
		 System.out.println("y : "+ y);
		 
		 int resule = x + y;
		 
		 return resule; 
	 }
	 /**
	  *  두 정수를 입력 받아서
	  *  나누기한 결과를 x/y
	  *   double로 돌려준다
	  *   단! y가 0일때는 "안된다"고 출력하고 0을 돌려 줌
	  *   
	  *   메소드 명 : divide
	  *   전달인자 : int x, int y
	  *   리턴타입 : double 
	  */
	 
	 double divide(int x, int y) {
		 double result = x/y;
		 return result; 
	 }
	 
	 // int 배열의 모든 값을 더하는 메소드

		 
	 }
		 
	 



