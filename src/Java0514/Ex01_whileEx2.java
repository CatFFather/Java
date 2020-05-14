/*
	Date : 2020.05.14
	Autoer : Jaehong
	Description : while문 예제2
	version : 1.0
*/

package Java0514;

import java.util.Scanner;

public class Ex01_whileEx2 {

	public static void main(String[] args) {

//		int acoount; 
//		int balance;
//		boolean run = ture;
//		int menu;
//		// while 문 사용
//		System.out.println("-----------------------------");
//		System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
//		System.out.println("-----------------------------");
//		
//		// swich-case 문 사용
		
		while() {
		System.out.println("-----------------------------");
		System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		menu = sc.nextInt();
		switch(menu) {
		case 1 : 
			System.out.println("예금을 선택하셨습니다.");
			break;
		case 2 :
			System.out.println("출금을 선택하셨습니다.");
			break;
		case 3 : 
			System.out.println("잔고를 선택하셨습니다.");
			break;
		case 4 :
			System.out.println("종료합니다");
			break;
		default : 
			System.out.println("그 외에 숫자를 입력했습니다.");
			break;

		
		}
		
		
		

	}

}
