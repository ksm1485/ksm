package sec04.exam04;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 75;
		if(score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
		}
		if(score < 90) {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		
		int x = 3;
		if( x%2 == 0) {
		System.out.println("짝수");
		}
		else if ( x%2 == 0) { //else if ( x%2 != 0),   else if ( x%2 == 1) 같은코드 
		System.out.println("홀수");
		}
		
		////////////random////////////////
		double random1 = Math.random() ;
		System.out.println(random1);
		
		// Math.random()
		// 0 <= Math.random() < 1
		// 주사위 : 1~6
		// 대충 나머지로 구하는 법
		double random2 = Math.random() * 10000;
		int dice = ( (int)random2) % 6 + 1;
		System.out.println("주사위 : "+ dice);
		
		// 로또 번호 : 1~45 >>> 0~44 + 1
		int lotto = (int) (Math.random()*45) + 1;
		System.out.println("lotto : "+ lotto);
		
		int num = 1;
		if (num == 1) {
			System.out.println("num은 1입니다");
		} else if( num == 2) {
			System.out.println("num은 2입니다");
			}
			else {
				System.out.println("num은 1과 2가 아닙니다");
			}
			
			switch(num) { //switch = char, byte, short, int, String 사용가능
			 case 1:        // switch = boolean, long, float, double 사용 불가 
				 System.out.println("switch num은 1입니다");
				 //break;
			 case 2:
				 System.out.println("switch num은 2입니다");
				 break;
				 default :
					 System.out.println("switch num은 1과 2가 아닙니다");
					 break;
			}
			//월에 따라 계절을 출력
			int month = 1;
			if (month == 1){
			System.out.println("겨울이다.");
			} else if (month == 2 ) {
				System.out.println("겨울이다");
			}
			
			/*문제 1.,
			int 변수에 임의의 수를 넣고
			그 수가 "양수", "0", "음수" 구분하여 출력
			

			문제 2.,
			a와 b 두 수 중에서 큰 값을 출력
			

			문제 3.,
			시간 과 분이 있을 때
			35분이 지난 시간을 출력
			

			문제 4.,
			어떤 수가
			15와 20 사이(포함)에 있는가?
			

			문제 5.
			통장 잔액이 10000원 있을 때
			출금액에 따라
			"잔액이 부족합니다", "얼마 출금 했고 얼마 남았습니다", "정확히 입력 해주세요"
			

			문제 6.,
			값에 따라(예를 들어 125)(단, 0은 양수+짝수)
			"100 보다 큰 수이며, 양수이고, 홀수입니다"
			예를들어 -6
			"100 보다 작은 수이며, 음수이고, 짝수입니다"
			

			문제 7.,
			어제 온도, 오늘 온도 변수 두개
			2, -3
			"오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다"
			 

			문제 8번.,
			변수에 두자리 숫자(10~99)가 있을 때
			10의 자리와 1의 자리가 같은 수인지 판단
			

			문제 9번.,
			사각형의 한쪽 모서리 x1:10, y1:20
			대각선 모서리       x2:90, y2:100
			이럴 때 새로운 점 x3, y3는 사각형에 포함되는가?
			
			*/
			int sum1 = 0;
			
			for(int i = 0; i <= 10; i++) {
				sum1 = sum1 + 1;
				System.out.println(sum1);
			}
			
			/* 반복문 만드는 원리
			 *  ctrl + c + v 했을 때 바뀌지 않는 것
			 *  2. 반복 되지 않는 것에서
			 *  			규칙(패턴) 찾기
			 * 				변수를 활용해서 더 이상 바뀌지 않게 만들기
			 * 3. 시작 조건 파악
			 * 4. 종료 조건 파악
			 * 
			 * for : 반복 횟수를 아는 경우
			 * while : 반복 횟수를 모르는 경우
			 */
			
			// 구구단 2단을 출력하시오
		for (int q=1; q<=9; q++)
				System.out.println("2 X " + q + " =  "+ 2*q);
			
			// 2~10까지 짝수만 출력
 			for (int w=2; w<=10; w += 2)
				System.out.println(w);

				
			//풀어놓은 식	
			System.out.println(2);
			System.out.println(4);
			System.out.println(6);
			System.out.println(8);
			System.out.println(10);
			
			//이번엔 변수를 활용해서 다시 쓰기
			int i3 = 2;
			
			System.out.println(i3);
			
			i3 += 2;
			System.out.println(i3);
			i3 += 2;
			System.out.println(i3);
			
			for(int i4 = 2; i4 <= 10; i4 += 2)
			System.out.println(i4);
						
			// 
			// 2. 10~1 출력
			
			// 1~10까지 다음과 같이 출력
            // 	        1. 홀수
            //				2. 짝수
			//
			// 1~10까지 3개 숫자를 옆으로 나열
			
			// 1부터 100까지 홀수의 개수
			int count = 0;
			for(int j = 1; j <= 100; j++) {
				if(j % 2 != 0) { // 홀수
					count++;
				}
			}
			System.out.println("count: "+ count);
			// 구구단 전체 출력(2단부터 9단까지)
			for (int q=2; q<=2; q++) {
				for(int h=1; h<=9; h++)
				System.out.println(q +" x " + h +" =  "+ (q*h) + " " );
			}
			System.out.println();
			
			//9. 두~세단씩 옆으로 출력
			// 2x1=2     3x1=3
			// 2x2=4     3x2=6
			// ...           ....
			// 4x1=2     5x1=3
			// 4x2=4     5x2=6
			for(int k=2; k<=9; k++) {
				for(int j=1; j<=9; j++) {
					System.out.println(k + " x '" + j + " = " + (k*j) + " " );
					if( (k+1) <= 9) {
						//System.out.println((k+1 ));
					}
				}
			}
			// 0단계
			/*
			 	+
			 	+
			 	+
		 		+
		 		+
			 */
			System.out.println("+");		
			System.out.println("+");		
			System.out.println("+");		
			System.out.println("+");		
			System.out.println("+");		
            
			for (int m=1; m<=5; m++) {
				System.out.println("+");
			}
			String mark = "+";
			// 1단계
            /*
                    +++++
             */
			for (int m=1; m<=5; m++) {
				System.out.print( mark );	
			}
			// 2단계 
			System.out.println("2단계=========================");
			String space = " . ";
			/*
			         +.+.+.+.+.
			 */
			for (int m=1; m<=5; m++) {
				System.out.print( mark );
				System.out.print( space );
			}
			System.out.println();
			
			//3단계
			/*
			        +++++
			        +++++
			        +++++
	        */
			
			
			// 4단계
			/*
			        11111
			        22222
			        33333
			        44444
			        55555
			 */
			
			// 5단계
			/*
			        1
			        22
			        333
			        4444
			        55555
			 */
			
			// 6단계
			/* 
			        +
			        ++
			        +++
			        ++++
			        +++++
			 */
			
			// 7단계
			/*	11111
		    		2222
			    	333
			    	44
			    	5
			*/
			
		// 8단계
		/*		    +....
				    ++...
				    +++..
				    ++++.
				    +++++
    	*/

		// 9단계
		/*		    ....+
				    ...++
				    ..+++
				    .++++
				    +++++
		*/
			
		// 10단계
		/*		    ....+
				    ...+++
				    ..+++++
				    .+++++++
				    +++++++++
	    */

		// 11단계
		/*		    ....+....
				    ...+++...
				    ..+++++..
				    .+++++++.
				    +++++++++
		*/
			
		// 12단계
		// 입력 받은 줄 수대로 출력
		// 예를 들어 3이면
		/*		    ..+..
				    .+++.
				    +++++
	    */ 

		//별찍기 피라미드찍기는 PyramidExam에 있음
			
		//문제1
		//주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력
		// [1,1] [1,2]
			for(int j=1; j<=6; j++) {
				System.out.println(" [ " + j + ", "  +"] ");
			}
		//문제2
			//주사위 2개의 합 별로 나올 수 있는 조합
			//합2 : [1,1]
			//합3 : [1,2] [1,2]
			
		//문제3
			// 합 별 조합의 수 출력
			// 순서에 관계 없이 중복 제거
			// 합2 : [1,1]
			// 합3 : [1,2] 와 [2,1]는 같음
        
//		문제 4
//			순서에 관계 없이 중복 제거
//			합2 : [1,1]
//			합3 : [1,2]와 [2,1]는 같음
//			System.out.println("[1,1]");
//			System.out.println("[1,2]");
//			System.out.println("[1,3]");
//			System.out.println("문제4~~~~~~~~~~~~~~~~");
//			for(int j=1; j<=3; j++) {
//				System.out.println("[1, "+ j + "j");
//			}
//			System.out.println("[2,2]");
//			System.out.println("[2,3]");
//			for(int j=2; j<=3; j++) {
//				System.out.println("[2, "+ j + "j");
//			}
//				System.out.println("[3,3]");
//				for(int j=3; j<=3; j++) {
//					System.out.println("[3, "+ j + "j");
//				}
				for(int k=1; k<=3; k++) {
					for(int j=k; j<=3; j++) {
						System.out.println("["+ k +"," + j +"]");
					}
				}
		//문제5
			//입력받은 정수에 따라 다음과 같이 출력
			/* 3
			 *  00 01 02
			 *  10 11 12
			 *  20 21 22
			 */
			/* 4
			 *  00 01 02 03
			 *  10 11 12 13
			 *  20 21 22 23
			 *  30 31 32 33
			 */
			//문제6
			//입력받은 정수에 따라 다음과 같이 출력
			// 정사각형
			/* 3이 들어오면
			 * + + +
			 * + . +
			 * + + + 
			 */
	        /* 5
	         * +++++
	         * +. . .+
	         * +++++
	         */
				System.out.println("5555555555555555555");
            int z = 5;
            for(int j=1; j<=z; j++) {
            	for(int k=1; k<=z; k++) {
            		if(j == 1 || j == z) {
            		System.out.print("+");
            		}else {
            			// 다른줄에서
            			
            			//처음과 마지막 킨
            			if(k==1 || k==z) {
            				System.out.print("+");
            			}else {
            				System.out.print(".");
            			}
            		}
            	}
            	System.out.println();
            	
            	
            }
	}					
}  

