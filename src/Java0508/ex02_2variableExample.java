/*
	Date : 2020.05.08
	Autoer : Jaehong
	Description : Java 기본설정
	version : 1.0
*/

package Java0508;

public class ex02_2variableExample {

	public static void main(String[] args) {
		// 변수이름
		// 1. 카멜표기법 : 시작은 소문자, 다른뜻 단어가
		// 등장할때 대문자를 사용해서 표기
		// ex) jInfo , 학생수를 표시 =>> numberOfStudent
		// 2. 영문자, 숫자, 특수문자 (_(언더바), $) 사용가능
		// 3. 변수명은 숫자로 시작할 수 없다.
		// 4. 변수명은 예약어(int, double 등) 사용할 수 없다.
		
		
		//int int;
		//itn double;
		 int 123;          //숫자로 시작해서 오류
		 int 1number;      //숫자로 시작해서 오류
		 
		 int number1;
		 int _number; 
		 int number_;
		 
		 int $number;
		 int number$;
		 
		 int #number;      //_랑$가 아니면 오류
		 int number#;      //_랑$가 아니면 오류
		 int number&;      //_랑$가 아니면 오류
		 int a; 
		 
		 
	}

}
