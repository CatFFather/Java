/*
	Date : 2020.05.12
	Autoer : Jaehong
	Description : 반복문for(loopFor)
	version : 1.0
*/

package Java0512;

public class ex08_loopFor {

	public static void main(String[] args) {
		// 안녕하세요 10번 출력!

		System.out.println("안녕하세요!");

		// 반복문 for

		/*
		 //시작할 값//~까지 
		 // for(초기화식; 조건식; 증강식){
		  반복할 수행문 
		   }
		  
		 */
		int i;
		
//		for (i = 1; i <= 10; i++){
//			System.out.println(i + "안녕하세요");
//		}
//		// num = i(10번) + 1
//		System.out.println("반복문 이후 i값 : "+ i );

		
		// 1부터 10까지 합을 출력!
		
		int sum=0;
		
		for(i=1;i<=10;i++) {
			sum += i;		// sum = sum+i  sum에 i를 더한다. sum+= i;로 표현하기 어렵다면 sum = sum+i로 사용해도 똑같은 결과가 나온다
			System.out.print("i : " + i + "\t =>>");
			System.out.println("\tsum : " + sum );
		}
		System.out.println("1부터 10까지 합은 " + sum );
	
	
	
	
	}

	// 1부터 10까지 합을 출력!

	

}
