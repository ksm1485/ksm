package sec04.exam04;

public class breakExam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("게임을 시작하지");
		int count = 0;
		while (true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("주사위 : "+ num);
			
			if(num == 6) {
				break;
			}
			count++;
		}
		System.out.println("게임 종료 : 총 : "+ count);

		for(int i=1; i<10; i++) {
			System.out.println(i);
			if(i >= 5) {   //혹시 몰라서 == 을 >= 으로 씀 (오바 방지)
				break;
			}
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println("i: "+ i);
			
			for(int j=0; j<20; j++) {
				System.out.println("j: "+j);
				if(j>=2) {
					System.out.println("break");
					break;
				}
			}
		}
		
		//총 5명이 순차적으로 게임 시작
		for(int i=1; i<=5; i++) {
			// 한명 당 주사위 3번씩 던지기
			for(int j=1; j<=3; i++) {
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("주사위0 : "+ num2);
			
			if(num2 == 6) {
				break;
			}
		}
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		//퀴즈
//		while,
//		문제 1,
//		특정 수(0)가 오기 전까지 반복
//		수를 입력하세요
//		-3
//		"음수"
//		나머지는 "양수"
//
//		문제 2,
//		월을 입력하면 계절이 나오고
//		0을 입력하면 종료
//
//		문제 3,
//		가위바위보게임 0이 입력될 때 까지 반복
//
//		문제 4,
//		은행에서
//		예금, 2. 출금, 3. 잔고확인, 4. 종료,
//		조건
//		예금할 때 음수 불가
//		출금할 때 음수 불가, 잔고보다 큰 금액 불가

		
		
	}
	}


