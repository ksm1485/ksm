package quiz.class1;

public class SangService {
	
	SangDAO SangDAO = new SangDAO();
	
	// 머리속
	String getInfo(String question) {
		String result = SangDAO.selectAnswer(question);
		if(result == null) {
			result = "(신중히 생각 더 해봐야겠음)";
		} else {
			result = " 흐음...저는요 " + result + " 이거요! "; 
		}
		return null;
	}
	// gpt
	// 노션

}
