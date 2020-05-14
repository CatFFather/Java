/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 관계연산자(relationalOperation)
	version : 1.0
*/

package Java0511;

public class ex05_relationalOperation {

	public static void main(String[] args) {

		// 관계연산자
		// 정수형 변수 2개를 선언
		int num1 = 7;
		int num2 = 2;

		// > , < , >= , <= , == , != 연산수행
		boolean result;

		result = num1 > num2;
		System.out.println("> 결과 : " + result);

		result = num1 < num2;
		System.out.println("< 결과 : " + result);

		result = num1 >= num2;
		System.out.println(">= 결과 : " + result);

		result = num1 <= num2;
		System.out.println("<= 결과 : " + result);

		result = num1 == num2;
		System.out.println("== 결과 : " + result);

		result = num1 != num2;
		System.out.println("!= 결과 : " + result);

	}

}
