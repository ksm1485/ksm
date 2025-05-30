package src01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		    byte b1;
		    b1 = 127;
		    System.out.println("b1: "+b1);
//		    b1 = 128; int 때문에 128을 못씀
		    
		    char c1 = 65;
		    System.out.println("c1: "+c1);
		    c1 = 65 + 2;
		    System.out.println("c1: "+ c1 );
		    
		    char c2 = 'F' ; //char 타입에만 ''(홀따옴표)를 쓴다
		    System.out.println("c2: "+ c2);
		    System.out.println("c1-c2: "+ (c2-c1));
		    
		    char c3 = '한';
		    System.out.println("c3: "+ c3);
		    System.out.println("c3: "+ (c3+1)); //""(쌍따옴표)을 쓰는 string 타입
		    
		    String s1 = "김상명";
		    System.out.println("s1: "+s1);
		    
		    String s2 = "김\"상명";
		    System.out.println("s2: "+ s2);
		    
		    String s3 = "김\t상\n명"; // (\t) 탭만큼 뛰우기, (\n) 한 줄 내림
		    System.out.println("s3: "+ s3);
		    
		    s3 = s3 + "글씨" + 3 + 2;
		    System.out.println(s3);
		    
		    s3 = s3 + "글씨" + 3 + 2 + (3 + 2);
		    System.out.println(s3);
		    
		    String s4 = 3+2+"글씨";
		    System.out.println(s4);
		    
		    int i1 = 2100000000;
         //int i2 = 2200000000;
		  
		    float f1 = 3.14f;
		    double d1 = 3.14;
		    System.out.println("d1: "+ d1);
	    // float의 정밀도 : 소수점 7자리
		 //double의 정밀도 : 소수점16자리
		    
		    boolean stop = true;
		    boolean start = false;
		    System.out.println(stop);
		    
		    //퀴즈
		    //1. 내 나이를 저장하시오.(age)
		    int age = 20;
		    //2. 내 소유 차가 있다.(car)
		    boolean car = true;
		    //3. 우리집에 있는 스마트폰의 개수(phone)
		    int phone = 3;
		    //4. 내 이름 저장(name)
		    String name = "김상명";
		    //5. 1평은 3.3제곱미터입니다. 5평은?(area)
		    double area = 5 * 3.3;
		    
		    //퀴즈 0
		    /*
		     * 두 변수 a, b에 각각 3, 4를 넣고
		     * 출력 "3과 4".
		     * 단, 변수를 활용해서
		     */
		    int a = 3;
		    int b = 4;
		    System.out.println(a+"과 "+b);
		    
		    //퀴즈 1
		    /*
		     * 1-1 : 두 변수 a, b에 각각 3, 4를 넣고
		     * 출력 결과 : "3 > 4의 결과는 false입니다."
		     * 1-2 : 두 변수의 값을 6,5 변경
		     * 출력 결과 : "6 > 5의 결과는 true입니다."
		     */
		    int x = 3;
		    int y = 4;
		    int x1 = 5;
		    int y2 = 6;
            System.out.println(x + " > " + y + "결과는 "+ (x>y) + "입니다");
            //퀴즈 2
            /*
             * 숫자 132
             * 출력 결과
             * "백의 자리 : 1"
             * "십의 자리 : 3"
             * "일의 자리 : 2"
             */
            int num = 132;
            int bak = num / 100;
            int ship = 10;
            System.out.println("백의 자리: "  + bak);
            num = num - (bak * 100);
            System.out.println(" num : "+ num);
            System.out.println("십의자리 : "+ ship);
            num = num - (ship * 10);
            System.out.println("num "+ num);
            System.out.println("일의 자리"+ num);
            
            
            
            
            
            
            
	}

}
