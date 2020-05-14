/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 대입연산자(assignmentyOperation)
	version : 1.0
*/

package Java0511;

public class ex03_assignmentyOperation {

	public static void main(String[] args) {

		int age = 35;
		int num = 1;

		// 나이를 의미하는 변수 age에 변수값 35를 대입한다.
		// 왼쪽변수 = 오른쪽변수(또는 상수, 식)
		// lValue(항상 변수) = rValue(상수, 변수, 식) 왼쪽에는 항상 변수 오른쪽은 상수 변수 식
		age = num;
		System.out.println(age); // <<--- 마지막에 선언한 num 값인 1이 나옴
		age = 1 + 25; // <<--- 26이 나옴
		// int 35 = 1+34;

		// 부호연산자 : (+), (-)
		int num1 = 10;

		System.out.println(+num1); // +num1 : 10
		System.out.println(-num1); // -num1 : -10
		System.out.println(num1); // num1 : 10

		num1 = -num1;
		// num1 = -(10);
		System.out.println(num1);

	}

}
