package sec02.exam02;

public class Opexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 10;
		
		x++;
		System.out.println("x: "+ x);
		++x;
		System.out.println("x: "+ x);
		
		x =10;
		x = x + 1; //11
		x += 1; // 위와 같은 코드
		x++;   // 위와 같은 코드
		        // 단, 1을 증가할때만
		
		x = 10;
		int z = ++x;
		System.out.println("z: "+ z);
		
		x = 10;
		z = x++;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		x = 10;
		System.out.println("++x :"+ ++x);
		x = 10;
		System.out.println("x++ :"+ x++);
		
		x = 1;
		z = x++ + ++x;
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		x = 1;
		z = x++ - --x * x++ - x--;
		System.out.println("x: "+ x +", z: "+ z);
		System.out.printf("x: %d, z: %d", x,  z);
		System.out.println();
		
		boolean a = false;
		a = !a;
		System.out.println("a: "+ a);
		
		boolean f = 3 > 4;
		System.out.println(0.1 == 0.1f);
		//(위코드) 소수점을 비교할 때는 같은 타입으로 변환해서 비교하자
		
		String s1 = "s1";
		String s2 = "s1";
		//System.out.println(s1 == s2); // 대문자(String)로 시작한 비교는 == 안됨(주소를 뜻하는게 됨)
		System.out.println(s1.equals(s2)); // 글씨는 무조껀 equals로 비교한다
		System.out.println("ssss".equals(s2));
	    
		//퀴즈
		//난 돈이 10000원 있습니다
		//4500원짜리 프라페치노를 최대 몇 잔 살 수 있나요?
		//그리고 남는 돈
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println("총: "+ count + "잔");
		int change = money % coffee;
		System.out.println("잔액: "+ change);
		
		//올리브영에 꿀홍차가 8000원 15% 세일이면 꿀홍차 가격은?
		int hong = 8000;
		double m = hong - (hong * 0.15);
		
		int score = 87;
		System.out.println("내 점수는 80점과 90점 사이다 참? 거짓?");
		// true / false 출력
		System.out.println(score >= 80 && score <= 90 );
		
		// v1 / v2를 소수점 3자리까지 출력하시오
		// 오칙연산으로만 해결하시오.
		double v1 = 1000.0;
		double v2 = 794.0;
		double v3 = v1 / v2;
		System.out.println(v3);
		v3 = (  (int) (v3 * 1000) ) / 1000.0;
		System.out.println(v3);
		
		double v4 = (v1 / v2) * 1000;
		int v5 = (int) v4;
		double v6 = (double) v5 / 1000;
		
		int s = 95;
		String grade = ( s > 90) ? "A" : "B";
		System.out.println("grade: "+ grade);
		
		
			
	}

}
