/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : S부터 N까지 합 구하기
	version : 1.0
*/

package Java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {

	public static void main(String[] args) {
		// for 문 사용해서 두개의 정수(시작값, 끝나는 값)를 입력받아서 
		// 총합을 구하는 프로그램을 만들어 보시오.

		int num1;
		int num2;
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("시작 숫자를 입력해주세요");
		num1 = sc.nextInt();
		System.out.println("끝나는 숫자를 입력해주세요");
		num2 = sc.nextInt();
		
		for(num1=num1;num1<=num2;num1++) {
			sum = sum + num1;
			
		}
		System.out.println("총합 : " + sum );		//이 출력문구를 괄호안에 넣을때랑 밖에 넣을때 다르게 출력됨
		
		

		
		// 교수님이 알려준 정답
		
//		int sNum=0;
//		int lNum=0;
//		int sum=0;
//		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("시작값 >> ");
//		sNum = sc.nextInt();
//		System.out.println("끝나는 값>> ");
//		lNum = sc.nextInt();
//		
//		for(int i=sNum; i<=lNum; i++) {
//			sum += i;  // sum = sum + i;
//		}
//		System.out.print(sNum + "부터");
//		System.out.print(lNum + "까지");
//		System.out.println("합은" + sum);
//		

		
		
		
	}

}
