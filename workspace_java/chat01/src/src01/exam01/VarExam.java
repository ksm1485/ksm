package src01.exam01;

public class VarExam {

	public static void main(String[] args) {
		
           int value; //변수 선언
           value  = 5; // 변수의 값 넣기
          
           int result = value + 10;
           
           System.out.println(result);
           
           int hour = 3;
           int minute = 5;
           System.out.println(hour + "시간" + minute + "분");
           
           System.out.println("value :   "+ value);
           value = value + 1; // 오른쪽으로 결과 적용
           System.out.println("value :   "+ value);
           
           //이클립스 단축키
           /*
            * 한줄 지우기 : ctrl + d
            * 한줄 복사 : ctrl + alt + 위아래 방향키
            * 주석 단축키 : ctrl + /
            * 한줄 이동 : alt + 위아래 방향키
            * 자동 정렬 : ctrl + shift + f
            */
           
           // 변수 a를 선언과 동시에 10으로 초기화
           int a = 10;
           int b; //변수 선언
         //System.out.println(b) ;
           int x = 10;
           int y = 4;
           y = x;
           System.out.println(y) ;
// 퀴즈
           int  x1 = 26845;
           int  x2 = 15974;
           
           int temp = x1;
           x1 = x2;
           x2 = temp;
           /*
            * 
            */
           System.out.println("x1 : "+ x1); // 684684
           System.out.println("x2 : "+ x2); // 15974
                   
	}

}