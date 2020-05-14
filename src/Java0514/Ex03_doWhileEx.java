/*
	Date : 2020.05.14
	Autoer : Jaehong
	Description : do-while문 예제(Up&Down게임)
	version : 1.0
*/

package Java0514;

import java.util.Scanner;

public class Ex03_doWhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!

		int answer = (int) (Math.random() * 45) + 1; // 45까지의 랜덤의 숫자가 생성된다
		int input = 0; // 말하는 숫자
		int count = 0; // 입력된 횟수

		boolean run = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Up & Down Game시작!"); // 여기서 랜덤 숫자를 생성이됨

		do {
			System.out.println("1부터 45까지 숫자를 말하세요!");
			input = sc.nextInt();
			count++;	// 카운트값을 늘려준다
			// if (1~45) 실행
			if (answer > input) {						// answe 값이 input 값보다 크면 "Up! 더 큰수를 말하세요!"가 출력되고 다시 처음으로
				System.out.println("Up! 더 큰수를 말하세요!");	
			} else if (answer < input) {				// answe 값이 input 값보다 작으면 "Down! 더 작은수를 말하세요!"가 출력되고 다시 처음으로
				System.out.println("Down! 더 작은수를 말하세요!");
			} else {
				System.out.println("정답은" + answer + "입니다");
				System.out.println("시도한 횟수는 " + count + "입니다");
				run = false;
				// break;
				// ㅑㄹ
			}
			// else (다시 실행해주세요)
				
		} while (run);
		if (count <= 3) {
			System.out.println("통과입니다!!");
		} else {
			System.out.println("벌칙당첨!!");
		}

	}

}
