package Quiz;

public class Quiz {

	public static void main(String[] args) {

		String[] en = {"love", "hate", "devil", "engel" };
		String[] ko = {"사랑", "증오", "악마", "천사"};

//		영어를 한국어로 번역하는 메소드
//		메소드명 : en2ko
//		전달인자 : String 영단어
//		리턴타임 : String 한국어
//		String en2ko(String word) {
//			
//		}
		
		int s1 = 0;
		for(int i=0; i<ko.length; i++) {
			if(ko[i].equals("악마")) {
				s1 = i;
			}
		}
		System.out.println(s1);
		System.out.println(en[s1]);

		//은행 계좌 Class를 만들어 입*출금과 잔액 조회
		
	
	
	}
}
