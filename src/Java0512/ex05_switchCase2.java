/*
	Date : 2020.05.12
	Autoer : Jaehong
	Description : 조건문2 (switchCase2)
	version : 1.0
*/

package Java0512;

import java.util.Scanner;

public class ex05_switchCase2 {

	public static void main(String[] args) {
		// swich-case문 사용해서
		// 월별 날짜 계산하기

		int month;
		int day = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요 >> ");
		month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("값을 잘못 입력했습니다!");
			break;
		}	
			// 맨위에 day = 0으로 설정해야 오류가 나지않는다. 이유 : 
														//여기 if문이 없고
			if(month>=1 && month<=12) {					//System.out.println("입력하신 "+ month +"월은 "+ day +" 일까지입니다.");	
														//만 있으면 0값을 넣었을때 입력하신 0월은 0일까지입니다.가 출력이 됨
				System.out.println("입력하신 "+ month +"월은 "+ day +" 일까지입니다.");	
			} else {
				System.out.println(" ");	//여기서 else를 지우고 if문에 {}중괄호를 지워도 출력이 된다.
			}
	
	
	
	
	}	
		

}
