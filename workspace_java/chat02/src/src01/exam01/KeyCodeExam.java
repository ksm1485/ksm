package src01.exam01;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3);
		System.out.print(478);		

		System.out.println(5);		
		System.out.println(6);
		
		System.out.printf("이름: %s ", "김자바" );
		System.out.println();
		System.out.printf("나이: %s, 나이: %d ", "김자바",  25);
		System.out.println();
		System.out.printf("나이: %6s, 나이: %04d ", "김자바",  25);
		System.out.println();
		
		////////////////입력/////////////////
		int keycode;
		/* scanner 연습때문에 주석처리
		try {
			keycode = System.in.read();
			System.out.println("keycode: "+ keycode);
			
			keycode = System.in.read();
			System.out.println("keycode: "+ keycode);

			keycode = System.in.read();
			System.out.println("keycode: "+ keycode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			*/
		
		Scanner scan = new Scanner(System.in);
		// 엔터까지의 모든 글씨
		String inputData = scan.nextLine();
		System.out.println("inputData : "+ inputData);
		
		//엔터쳤을 때 띄어쓰기까지의 모든 글씨
		String inputData2 = scan.nextLine();
		System.out.println("inputData2 : "+ inputData2);
		
		//엔터쳤을 떄의 숫자
		int input = scan.nextInt();
		System.out.println("input: "+ (input*10));
		
		System.out.print("x값을 입력하시오 :");
		int input2 = scan.nextInt();
		System.out.println("입력한 x값: "+ input2);

		
		
	}

}
