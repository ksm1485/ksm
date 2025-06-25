package Quiz;

public class FruitsMarket {

	//필드
	//필드는 변수고, 변수는 뭔가를 저장할 수 있다
		String name;       //업체명
		String address;	//업체 주소
		
		//생성자
		// new 하자마자 실행되는 메소드의 일종
		FruitsMarket(String name, String address){
			this.name = name;
			this.address = address;
//			this("오픈예정" , address);
		}
		
		// 메소드
		// 동작, 작동

		String tomato = "토마토";
		int tomatoPrice = 2000;
		String apple = "사과";
		int applePrice = 1000;
		
		// 과일 목록 전체 출력
		// 메소드명 : Print
		// 전달인자 : 없음
		// 리턴타입 : void
		void print() {
			System.out.println("사과");
			System.out.println("수박");
			System.out.println("자두");

			System.out.println(this.tomato);
		}
		
		// 과일 가격 문의
		// 메소드명 : ask
		// 전달인자 : 과일명
		// 리턴타입 : 가격
		int ask(String fruitsName) {
			if("사과".equals(fruitsName)) {
				return applePrice;
			} else if (this.tomato.equals(fruitsName)) {
				return tomatoPrice;
			} else {
				System.out.println("그런 과일 없습니다");
				return-1;
			}
		}
}

