/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 증감연산자(increaseDecreaseOperation)
	version : 1.0
*/

package Java0511;

public class ex02_increaseDecreaseOperation {

	public static void main(String[] args) {

		// 단항연산자
		// 증가 감소 연산자( ++ , -- )

		// ++num : num이 가지고 있는 값에 1을 증가한 뒤에 연산에 적용
		// num++ : num이 가지고 있는 값을 연산에 적용한 뒤 1을 증가

		int num = 5;
		System.out.println("num값 : " + num);

		++num;
		System.out.println("++num 값 : " + num);

		num++;
		System.out.println("num++ 값 : " + num);

		int num1 = 5;
		int result1;

		result1 = ++num1;
		System.out.println("++num1 result : " + result1);
		// result1 = ++num1;
		// 1.num1 = num1 + 1;
		// 2.result1 = num1; 여기서 num1 = 6 이됨

		result1 = num1++;
		System.out.println("num1++ result : " + result1);
		// result1 = num1++;
		// 1.result1 = num1;
		// 2.num1 = num1 +1; //위에랑 아래의 차이점은 순서가 다름 //여기서 num1 = 7 이됨

		// example

		int num2 = 10;
		--num2;
		System.out.println(num2); // 예상결과값 적기 9
		// num2 = num2 -1;
		// num2 = 10 - 1;
		// num2 = 9;

		int result2;
		result2 = --num2;
		System.out.println(result2); // 예상결과값 적기 9 틀림
		// result2 = --num2;
		// num2 = num2 -1;
		// num2 = 9 - 1;
		// result2 = num2; 여기서 num2 = 8
		// result2 = 8;

		result2 = num2--;
		System.out.println(result2); // 예상결과값 적기 9 틀림
		// result2 = num2--;
		// result2 = num2;
		// result2 = 8;
		// num2 = num2 - 1;
		// num2 = 8 - 1; 여기서 num2 = 7

		// example
		int result3;
		// 1번
		System.out.println("num1 : " + num1 + ", num2 : " + num2); // num1 = 7 num2 = 7
		result3 = ++num1 + ++num2;
		System.out.println("num1 : " + num1); // 예상값 8
		System.out.println("num2 : " + num2); // 예상값 8
		System.out.println("result3 : " + result3); // 예상값 16
		// 해설
		// num1 = num1 +1 //8
		// +
		// num2 = num2 +1 //8
		// =
		// result //16

		// 2번
		result3 = num1++ + num2++;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("result3 : " + result3); // 예상값 9 +
		// 해설
		// num1 //8
		// +
		// num2 //8
		// =
		// result //16
		//
		// num1 = num1 + 1; //9
		// num2 = num2 + 1; //9

		// 3 3번
		result3 = num1++ + ++num2;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println(result3);
		// 해설
		// num 1 //9
		// +
		// num2 = num2 + 1; //10
		// =
		// result //19
		//
		// num1 = num1 + 1; //10

		// 4 4번
		result3 = ++num1 + num2++;
		System.out.println("num1 : " + num1); // 11
		System.out.println("num2 : " + num2); // 10
		System.out.println(result3); // 21
		// 해설
		// num1 = num1 +1 //11
		// num2 //10
		// =
		// result //21
		//
		// num2 = num2 +1 //11

		int num3 = 5;
		int num4 = 11;
		int result4;

		result4 = ++num3 + --num4; // result = 6+10 = 16 num3 = 6 num4 = 10
		System.out.println(result4);
		// num3 = num3 + 1 //6
		// +
		// num4 = num4 + 1 //10
		// =
		// result //16

		result4 = num4++ - num3--; // result = 10-6 = 4 num3 = 11 num4 = 5
		System.out.println(result4);
		// num4 //10
		// -
		// num3 //6
		// =
		// result //4
		//
		// num4 = num4 +1; //11
		// num3 = num3 -1; //5

		result4 = num3++ - ++num4; // result = 5-12 = -7 num3 = 6, num4 = 12
		System.out.println(result4);
		// num3 //5
		// -
		// num4 = num4 +1; //12
		// =
		// result //-7
		//
		// num3 = num3 +1; //6

	}

}
