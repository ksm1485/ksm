package sec04.exam03_return;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		boolean status = car.isLeftGas();
		System.out.println("가스 남았나? "+ status);
		
		car.gas = 3;
		car.setGas(3);
		
		status = car.isLeftGas();
		System.out.println("가스 남았나? "+ status);
		
		if(status) {
			System.out.println("출발~!!");
			car.run();
		}

		int money = 20000;
		int coffee = 4500;
		int count = money/coffee;
		System.out.println("총 : "+ count + "잔");

		// 7264원을 5000원 1000원 500원 100원 50원 10원 1원을 몇번 들어가는가?
		
		int m = 7264;
		int a = 5000;
		int re = m/a;
		System.out.println("몇번 : "+ re);
		
		int m2 = m-a;
		System.out.println("잔액 : "+ m2);
		
		int b = 1000;  
		int c = m2/b; 
		System.out.println("몇번 : " + c);
		
		int m3 = m2-b*2;
		System.out.println("잔액 : "+ m3);
		
		int d = 500;
		int e = m3/d;
		System.out.println("몇번 : " + e);
		

		
		
		
		
		
		
	}
}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
			


