/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 조건문
	version : 1.0
*/

package Java0511;

public class ex10_조건문if {

	public static void main(String[] args) {
		/*
		 * if(조건식){ 조건식이 참일 경우 실행 } else{ 조건식이 거짓일 경우 실행 }
		 */

		boolean condition = true;
		System.out.println("if문 시작");

		if (condition) {
			System.out.println("조건만족");
			System.out.println("condition이 " + condition);
		} else {
			System.out.println("조건불만족");
			System.out.println("condition이 " + !condition);
		}

		System.out.println("if문 종료");

		System.out.println();
		System.out.println("======================================");

		int num1 = 5, num2 = 7;
		if (num1 > num2) {
			System.out.println("num1이 크다");
		} else {
			System.out.println("num2가 크다");
		}

		// 문제. 나이 10살!
		// 나이가 8살이면 학교에 갑니다.
		// 그렇지 않으면 학교에 가지 않습니다.

		/*
		 * 나이는 10살이다.
		 * 
		 * 만약 (나이가 8살 이라면){ 학교에 갑니다. } 그렇지 않다면{ 학교에 가지 않습니다.
		 */
		int ageMy = 10, ageSt = 8;
		if (ageSt <= ageMy) {
			System.out.println("학교에 갑니다");
		} else {
			System.out.println("학교에 가지않습니다"); // 내가 한거
		}

		int age = 10, num = 8;

		if (age >= 8) {
			System.out.println("학교에 갑니다.");
		} else {
			System.out.println("학교에 가지 않습니다."); // 교수님이 알려준답
		}

		String str1 = "java";
		String str2 = "java";
		//네이버 로그인 할때 아이디가 같으면 로그인이 되고 같지않으면 로그인이 되지않는다.
		
		if (str1.equals(str2)) {
			System.out.println("두 문장이 같다.");
		} else {
			System.out.println("두 문장이 다르다.");
		}

	}

}
