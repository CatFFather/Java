/*
	Date : 2020.05.14
	Autoer : Jaehong
	Description : while문 예제2
	version : 1.0
*/

package Java0514;

import java.util.Scanner;

public class Ex01_whileEx2th {

	public static void main(String[] args) {

		int account = 0;	//통장만들기 0원
		boolean run = true;	//while문 사용하기 위해서 run(조건변수) 선언, true로 초기화
		Scanner sc = new Scanner(System.in);
		int menu;
//		// while 문 사용
		while (run) {	// 조건식만사용함 여기서는 초기화식이랑 증감식이 사용되지않는다 
			System.out.println("while문 시작");
			System.out.println("-----------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 >>");
			menu = sc.nextInt();	// menu 변수선언, 입력
//		
//		// swich-case 문 사용 (while문 안에 계속반복되도록 넣으면됨)
		
			switch(menu){
			case 1:
				System.out.println("예금액 >> ");
				// int a = sc.nextInt();
				// account += a;
				account += sc.nextInt();	// 예금액 입력
				break;	// swich문 탈출
			case 2:
				System.out.println("출금액>>");
				account -= sc.nextInt();
				break;	// swich문 탈출
			case 3:
				System.out.println("잔고: "+account);
				break;	// swich문 탈출
			case 4:
				run = false;	// 4.입력시 run값이 false로 변한다. 이때 프로그램이 종료되는게 아니고 다시 while로 가서 run값에 false가 떠서 종료가 된다.
				break;	// swich문 탈출
			
			default :
				System.out.println("다시 입력해주세요.\n");
			}	//switch문 종료
			System.out.println("switch문 종료");
			//while문이 여기까지 수행을함
			
		}	//while문 종료
		System.out.println("이용해주셔서 감사합니다");

	}

}