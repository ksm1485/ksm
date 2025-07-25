package quiz.class1;

public class study {
	
	void getAnswer(student student, String question) {
		System.out.println(student + "에 대하여");
		System.out.println(student.name+ "님에게 물어봅니다");
		System.out.println(question +"의 대답은 : "+ student.answer(question));
	}

}
