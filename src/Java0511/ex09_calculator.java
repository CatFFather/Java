/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 계산기(calculator)
	version : 1.0
*/

package Java0511;

import java.util.Scanner;

public class ex09_calculator {

	public static void main(String[] args) {

		// 계산기
		// 두개의 정수를 입력받아서 결과를 출력해보자!

		int num1;
		int num2;
		int result; // 이 int를 double 로 바꿔줘야하고,

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력 : ");
		num1 = sc.nextInt();

		System.out.println("두 번째 숫자를 입력 : ");
		num2 = sc.nextInt();

		// + , - , x , / , %
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result);

		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result);

		result = num1 * num2;
		System.out.println("곱셈결과 : " + result);

		result = num1 / num2; // int(정수) 로 해서 나눗셈 결과가 0으로 나옴
		System.out.println("나눗셈결과 : " + result); // result = (double)num1 / num2; 로 바꾸면 소수점도 나옴

		result = num1 % num2;
		System.out.println("나머지결과 : " + result);

	}

}
