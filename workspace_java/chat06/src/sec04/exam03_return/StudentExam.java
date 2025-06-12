package sec04.exam03_return;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "김상명";
		s1.age = 27;
		System.out.println("이름 : " + s1.name);
		System.out.println("나이 : " + s1.age);
		
		Student s2 = new Student();
		s2.name = "고현지";
		s2.age = 30;
		System.out.println("이름 : " + s2.name);
		System.out.println( "나이 : " + s2.age);
		
		s1.setName("ㄴㄴㄴ");
//		System.out.println(s1.name);
		
		String name = s1.getName();
		System.out.println("name : "+ name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
