/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 조건문연습문제1(ifExample1)
	version : 1.0
*/

package Java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		// 문제. 성적출력 예제
		// 점수를 입력받아서 90점 이상이면 "A"학점 입니다" 출력
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 60미만
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수를 입력하세요 : " );
		score = sc.nextInt();
		
		System.out.print("제 점수는 ");
		
		if (score>=90) {							//조건식에는 () 괄호가 있어야한다 
			System.out.println("A학점입니다.");
		} else if (score>=80){
			System.out.println("B학점입니다.");
		} else if (score>=70){
			System.out.println("C학점입니다.");
		} else if (score>=60){
			System.out.println("D학점입니다.");
		} else {									//마지막 else 때만 괄호가 없다.
			System.out.println("F학점입니다");
			
		}
		
	
		
		

	}

}
