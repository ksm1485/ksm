package quiz.class1;

public class SangController extends student {

		SangController(){
			super( "상명" );
		}
		
		SangService SangService = new SangService(); 
		
		@Override
		String answer(String question) {
			String result = SangService.getInfo(question);
			return result;
		}
		
}
