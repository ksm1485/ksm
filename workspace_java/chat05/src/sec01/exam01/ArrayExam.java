package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 배열 array
		 * 한번에 여러 변수를 만드는 방법
		 * 같은 탕비만 선언할 수 있음
		 * 생성할 때 전체 크기를 지정해줘야 함
		 * 생성된 여러 변수들은 index로 관리한다(index는 0부터 시작)
		 */
		
		//선언 
		int[] a1;         //java 스타일
//		int [] a;
		int a2[];       //c 스타일
		
		//배열 변수는 참조 변수라서 null 을 넣을 수 있다.
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		
		int[] score = new int[3];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75;
		System.out.println("score[1] : "+ score[1] );

		String[] str = new String[3];
		System.out.println("str[0] : "+ str[0] );
		
		// 배열 생성 후 기본값은
		// 0, false, null로 초기화 됨
		System.out.println("srt[100]");
		
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		int[] i1 = new int[] {90, 80, 75};
		int[] i2 = null;
		i2 = new int[] {90, 80, 75};
		
		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우에만
		// new int[]를 생략할 수 있다
		int[] i3 = {90, 80, 75};
		int[] i4 = null;
		//i4 = {90, 80, 75}; 안됨
		
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<3; i++) {
			System.out.println( scores[i] );
			sum += scores[i];
		}
		System.out.println("총 합 : "+ sum);
		System.out.println("평 균 : "+ (sum/3));
		
		// 배열의 길이
		System.out.println("scores.length : "+ scores.length );
		
		int b0 = 5;
		int b1 = 15;
		int b2 = 55;
		
		int [] bs0 = new int[3];
		bs0[0] = b0;		
		bs0[1] = b1;		
		bs0[2] = b2;		
		
		int[] bs1 = new int[3];
		bs1[0] = b0+1;
		bs1[1] = b1+1;
		bs1[2] = b2+1;
		
		int[][] bs = new int[2][3];
		bs[0] = bs0;
		bs[1] = bs1;
		
		System.out.println("bs.length : "+ bs. length);
		System.out.println("bs[0].length : "+ bs[0]. length);
		
		int[] d1 = {1,2,3,4,5};
		int[] d2 = d1;
		int[] d3 = {1,2,3,4,5};
		System.out.println("d1 == d2 : "+ (d1 == d2));
		System.out.println("d1 == d3 : "+ (d1 == d3));
		
		d2[1] = 10;
		System.out.println("d1[1] : "+ d1[1]);
		
		/*
		 *  반복문 사용해서 1~10까지 저장,
		 *  다른 반복문에서 출력
		 */
		int[] e1 = new int[10];
		e1[0] = 1;
		e1[1] = 2;
		
		for(int i=0; i<10; i++) {
			e1[i] = i+1;
		}
		for(int i=0; i<10; i++) {
			System.out.println("e1["+i+"] : "+ e1[i]);
		}
		int[] f = { 4,5,7,2,6};
		int[] f2 = new int [f.length];
//		System.out.println(f[0]);
		for(int i=0; i<f.length; i++) {
			System.out.println(f[i]);
		}
			for(int i=0; i<f2.length; i++) {
				System.out.println(f2[i]);
			}
			for(int i=0; i<f.length; i++) {
				int data = f[i];
				System.out.println("data : "+ data);
			}
			
			// 향상된 for문
			System.out.println("향상된 for문~~~~~~~~~~~");
			
			for( int data : f ) {
				System.out.println("data : "+ data);
			}
			
//			문제 0,
//			배열 깊은 복사 : {1,2,3} -> {1,2,3}
			System.out.println("문제0~~~~~~~~~~~~~~");
			int[] arr0 = {1,2,3};
			int[] arr1 = new int[ arr0.length];
				for(int i=0; i < arr0.length; i++) {
					arr1[i] = arr0[i];
				}
				for(int i=0; i<arr0.length; i++); {
				//System.out.println(arr0[i]);
				}
//			문제1,
//			배열 뒤집기 : {1,2,3} -> {3,2,1}
			System.out.println("문제1~~~~~~~~~~~");
			for(int i=0; i<arr1.length; i++) {
				System.out.println();
			}
//			여기서 = {3,4,7,5,1,9,4}
			int[] array = {3,4,7,5,1,9,4};
System.out.println("문제2~~~~~~~~~~~~~~");
			//			문제2,
//			여기서 홀수의 개수 찾기
			int count = 0;
			for(int i=0; i<array.length; i++) {
				if( array[i] % 2 ==1 ) {
					count++;
				}
			}
			System.out.println(count);
System.out.println("문제3~~~~~~~~~~~~");
			//			문제3,
//			여기서 4보다 큰 수의 개수 구하기
			count = 0;
			for(int i=0; i<array.length; i++) {
				if( array[i] > 4) {
					count++;
				}
			}
			System.out.println(count);
//			문제4,
//			여기서 최대값을 출력하시오
			System.out.println("문제4~~~~~~~~~~~~~~~~");
			int max = 0;
			int[] array3 = {3,4,7,5,1,9,4};
			for(int m=0; m<array3.length; m++) {
				if(max < array3[m]) {
					max = array3[m];
				}
			}
			System.out.println("max : "+ max);

//			문제5,
//			여기서 두번째 큰 수 구하기

//			문제6,
//			오른쪽으로 한칸 밀기(왼쪽은 0으로 채우기)
//			예시 : {3,4,7,5,1,9,4} -> {0,3,4,7,5,1,9,4}
			int[] h = {3,4,7,5,1,9,4};
				int[] k = new int[7];
					for(int i=0; i < h.length; i++) {
						
					}
						

//			문제7,
//			오른쪽이 이동 하는데 맨 끝에 값을 맨 처음으로 보내기
//			{3,4,7,5,1,9,4} -> {4,3,4,7,5,1,9}

//			문제8,
//			임시비밀번호 8자리 생성
			    
//			8-1 : 숫자만
//			8-2 : 소문자만
//			8-3 : 숫자2개 이상, 대/소문자 각 1개 이상,
//			,
//			,

//			문제9,
//			자리가 10개 있는 소극장의 예약 시스템
//			자리 번호는 1~10번까지 번호의 자리가 있습니다.
//			메뉴 : "1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료"
//			만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
//			만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"
//			int seat = new int[10];     // 0 : 예약가능, 1:예약완료
			
					
			
//			문제10,
//			로또 6개 생성. 단, 중복 없이
			
			// 1. 로또 번호 하나 뽑기
			// 2. 중복 체크
			 int[] lotto = new int[6];
		        boolean flag = false;
		        for(int i=0; i<lotto.length; i++) {
		            do {
		                flag = false;
		                lotto[i] = (int)(Math.random()*45) + 1;
		                for(int j=0; j < i; j++) {
		                    if(lotto[j] == lotto[i]) {
		                        System.out.println("중복:"+ lotto[i]);
		                        flag = true;
		                    }
		                }
		            } while( flag );
		        }
		        for(int i=0; i<lotto.length; i++) {
		            System.out.print(lotto[i]+ ", ");
		        }
		        System.out.println();

	
	}
		}

