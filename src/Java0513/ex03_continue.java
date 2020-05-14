/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : continue문
	version : 1.0
*/

package Java0513;

public class ex03_continue {

	public static void main(String[] args) {

		// continue문은 반복문과 함께 사용
		// 반복문 안에서 continue문을 만나면 이후 문장은 수행하지 않고,
		// for문의 증감식을 수행한다.

		/*
		  for(초기화식; 조건식; 증감식;{ 특정조건 continue;
		 
		  	반복문 수행;
		  
		  }
		  
		 */
//		for(int i=1; i<=10; i++) {
//			if(i%2 == 0) {
//				continue;
//			}	//2 4 6 8 10 
//			
//			System.out.print(i + " ");
//		}	// 1 3 5 7 9 

		// 1부터 100까지 숫자중에
		// 짝수의 합을 구하는 문제!
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 짝수만 구하는 조건
			if (i % 2 == 1) {
				continue;
			} // 홀수값은 실행되지 않는다.
			sum = sum + i;					// sum의 위치가 if 문 앞에 나오면 안된다 if문이 다 실행되고 sum값이 나와야 짝수가 더해짐
			
			System.out.println("1부터 100까지 짝수의 합 : " + sum);
		}															//이 중괄호 안에 쓰느냐 밖에 쓰느냐도 출력이 다르게 나옴
		System.out.println("1부터 100까지 짝수의 합 : " + sum);
	}

}
