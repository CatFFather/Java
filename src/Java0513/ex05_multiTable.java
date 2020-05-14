/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : 구구단
	version : 1.0
*/
package Java0513;

public class ex05_multiTable {

	public static void main(String[] args) {

		// 중첩 for문을 이용하여 구구단을 작성해라
		// 2단부터 9단까지!
		// 내가 한거

//		for (int i = 2; i <= 9; i++) {
//			System.out.println(i + "단입니다!");
//			for (int j = 1; j <= 9; j++) {
//				// 실행할 반복문
//				int ij = i * j;			//이거 안써도 됨
//
//				System.out.print(i + "X" + j);
//				System.out.println("=" + ij);
//			}
//			System.out.println("==========================");
//		}

//		// 교수님이랑 같이한거 i랑 j랑 순서만 바꾼거임
//		for (int i = 1; i <= 9; i++) {
//			
//			for (int j = 2; j <= 9; j++) {
//				// 실행할 반복문
//				int ij = i * j;			//이거 안써도 됨
//
//				System.out.print(j + "X" + i + "=" + ij);
//				System.out.print("\t");
//			
//			}
//			System.out.println();
//			
//		}

		
		// 응용문제.
		// 홀수단 만 출력하기!

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				// 실행할 반복문
				if( j % 2 ==0) { //j가 짝수다!
					continue;
				}
				

				System.out.print(j + "X" + i + "=" + i*j);
				System.out.print("\t");

			}
			System.out.println();

		}

	}

}
