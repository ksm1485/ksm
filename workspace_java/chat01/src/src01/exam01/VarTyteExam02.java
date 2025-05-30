package src01.exam01;

public class VarTyteExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //형 변환 연산
		 //type casting operator
		  int intValue = 10;
          byte byteValue = (byte)intValue;
          System.out.println(byteValue);
          
          intValue = 200;
          byteValue = (byte)intValue;
          System.out.println(byteValue);  //127을 넘어가기 힘들기 때문에 예상하기 힘들다
                                                  //비트를 2의 보수로 계산한 결과가 나온다.
          double d = -3.14;
          int t = (int) d;
          
          
          int i2 = 100;
          long l1 = (long)i2;
          long l2 = i2;
          
          int i3 = 3;
          long l3 = 4L;
          long l4 = i3 + l3;
          // (long)타입으로 자동 형변환된다 i3 + l3;
          
          int i7 = 10;
          double d7 = 5.5;
          double d8 = i7 + d7;
          System.out.println("d8: "+ d8);
          
          double d9 = 10 / 4;
          System.out.println("d9: "+ d9);
          
  //int 랑 double >>> double 
          //double d9 = (double)10 / 4;
          //System.out.println("d9: "+ d9);      ==2.5가 나온다
          
           // 문자를 숫자로 바꾸기
//          String s1 = "123a";
          String s1 = "123";
//          int i8 = s1;   안됨
          int i8 = Integer.parseInt(s1);
          
          //가장 쉽게 숫자를 문자로 바꾸기
          String s2 = ""+ i8;
          
          //퀴즈
          //회식비 4.3만원
          //참석인원 4명
          //이 때 인당 얼마 내야하는가?
          //1. 디테일하게 원단위까지
          //2. 참석인원은 만원단위로만 회식비를 낸다.
          // [3]. 2번처럼 받으면 주최자는 얼마 내야 하나?
          double total = 4.3;
          int count = 4;
          double result1 = total / count;
          System.out.println("1번: "+ (result1 * 10000));
          
          int result2 = (int)result1;
          System.out.println("2번: "+ (result2 * 10000));
          
          double result3 = total - ((count-1) * result2);
          System.out.println("3번: "+ (result3 * 10000));
          
	}

}
