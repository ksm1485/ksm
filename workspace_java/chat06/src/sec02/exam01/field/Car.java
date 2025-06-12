package sec02.exam01.field;

public class Car {
		
		//필드
	
		//필드의 선언과 동시에 초기화
		String company = "람보르기니";
		String model = "아벤타도르";
		String color = "빨강";
		int maxSpeed = 400;
		
		//필드 선언
		//초기화 하지 않은 경우
		//0, false, null로 초기화 된다.
		int speed;
		//필드 영역에서 실행(행동) 할 수 없다
//		speed = 50; // speed의 값을 50으로 바꾸는 행동
}
