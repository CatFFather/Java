/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : S부터 N까지 합 구하기
	version : 1.1
*/

package Java0513;

import java.util.Scanner;

public class ex02_2forSnumToLnum {

	public static void main(String[] args) {
		
		
		int sNum=0;
		int lNum=0;
		int sum=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("시작값 >> ");
		sNum = sc.nextInt();
		System.out.println("끝나는 값 >> ");
		lNum = sc.nextInt();
		
		for(int i=sNum; i<=lNum; i++) {
			sum += i;  // sum = sum + i;
			// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
			System.out.print(i);
			//12345678910
			if(i<lNum) {
				System.out.print("+");			// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 +  로 출력되는것을 방지하기 위한 if문 입력
			} else {      // i>= lNum
				System.out.print("=");
			}												//for 문 안에 모든것이 다 반복 ★★★★★이게 중요				
			
		}
		System.out.println(sum);
		System.out.print(sNum + "부터");
		System.out.print(lNum + "까지");
		System.out.println("합은" + sum);
		
		
		
		
		
	}

}
