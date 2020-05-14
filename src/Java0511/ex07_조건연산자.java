/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 조건연산자(Operation)
	version : 1.0
*/

package Java0511;

public class ex07_조건연산자 {

	public static void main(String[] args) {

		// 조건연산자
		// 삼항연산자
		// (조건식) ? 참일때 값 : 거짓일때 값 ;
		int inAge = 35;
		int hoonAge = 50;

		char resultChar;
		int resultInt;
		String resultStr;

		// (조건식) ? 참일때 값 : 거짓일때 값;
		resultChar = (inAge < hoonAge) ? 'O' : 'X';

		resultInt = (inAge < hoonAge) ? 0 : 1;

		resultStr = (inAge < hoonAge) ? "참일경우" : "거짓일경우";

		System.out.println("resultChar : " + resultChar);
		System.out.println("resultInt : " + resultInt);
		System.out.println("resultStr : " + resultStr);

		// 문제.
		// 조건연산자를 사용하여 10이 짝수인 경우에는 true , 홀수인 경우에는 false 출력하는 조건연산자를 작성하시오.

		int num = 10;
		boolean resultEven;

		// ======== 조건연산자 작성========
		// (조건식) ? 참일때 값 : 거짓일때 값;
		resultEven = (num % 2 == 0) ? true : false;
		// resultEven = (num % 2 ==1) ? false : true;
		System.out.println(resultEven);

	}

}
