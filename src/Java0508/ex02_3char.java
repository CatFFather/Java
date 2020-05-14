/*
	Date : 2020.05.08
	Autoer : Jaehong
	Description :
	version : 1.0
*/

package Java0508;

public class ex02_3char {

	public static void main(String[] args) {

		// 문자형 변수타입 char(2byte)       char은 문자 하나만을 저장할때 사용하는 변수
		char ch1;
		ch1 = 'A'; //65
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 'B'; //66
		System.out.println((int)ch2);
		
		char ch3 = 'a'; //97
		char ch4 = 'b'; //98
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		
		int num1 = 65;                      //문자를 쓸때는 ''따옴표가 필요한데 숫자는 따옴표가 필요없다
		System.out.println(num1);
		System.out.println((char)num1);
		//숫자를 문자형으로 바꿀때 변수명 앞에 (char)
		
		//문제1
		//본인이름을 숫자로 표시해보세요.              //아스키코드표
		char ch5 = '이';
		char ch6 = '재';
		char ch7 = '홍';
		System.out.println((int)ch5);
		System.out.println((int)ch6);
		System.out.println((int)ch7);
		
		int num2 = 51060;
		System.out.println((char)num2);
		int num3 = 51116;
		System.out.println((char)num3);
		int num4 = 54861;
		System.out.println((char)num4);
		
		char ch8 = '李';
		System.out.println((int)ch8);
	
	
	}

}
