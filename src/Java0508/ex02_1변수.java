package Java0508;

public class ex02_1변수 {

	public static void main(String[] args) {
		
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기
		// 위에 메모리 공간을 할당하고, 이름을 부여한것
		
		//var num = 0;
		//[변수타입] [변수명] = [변수값];
		
		int age = 35;                   
		
		int age1;  // 변수선언
		age1 = 35; // 변수초기화
		
		int age2=11, age3=12, age4=13;
		
		//1+1=2;
		
		age1 =10;
		// 10을 age1에 대입한다.
		System.out.println("age1" + age1);
		
		
		//변수타입        1byte  2byte  4byte  8byte
		//1. 정수형     (byte  short   int    long     //int 랑 double 이 많이쓰임 
		//2. 실수형     (            float  double)
		//3. 문자형  (char)  
		//4. 논리형 (boolean)
		
		
		// byte
		// 1byte = 8bit
		// 1byte = -2^7~(2^)-1
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		// short
		// 2byte = 16bit
		// 2byte = -2^15 ~(2^31)-1
		 short sNum1 = -32768;
		 short sNum2 = 32767;
		 //short sNum3 = -32769;
		 short sNum4 = -32768;
		 
		// 4byte = 32bit
		// 4byte = 2^31 ~ (2^31)-1
		// int : -2,147,483,648 ~ 2,147,483,647
		int bNum3 = -129;
		int bNum4 = 128;
		
		// long : 매우크다
		// 8byte = 64bit
		int iNum1 = -2147483648;
		int iNum2 = 2147483647;
		//int iNum3 = -13221474000083648;
		//int iNum4 = 21231000047483648;
		
		long iNum3 = -13221474000083648L;
		// 변수값에는 L을 썻지만 출력은 되지 않는다.
		long iNum4 = 21231000047483648L;   //뒤에 L 추가 해줘야함
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		//실수형
		//float(4byte), double(8byte.)
		// double> float
		
		float pi1 = 3.14f;    //뒤에 f 추가 해줘야함
		double pi2 = 3.14;
		
		float pi3 = -2147483649.121234567890123456789f;
		double pi4 = 3.14321471897045123456789;
		
		System.out.println(pi3);
		System.out.println(pi4);
				
		//long 은 L 추가
		//float는 f 추가
	}

}
