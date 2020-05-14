/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : 별찍기예제
	version : 1.0
*/

package Java0513;

public class ex06_forStar {

	public static void main(String[] args) {
	
				// *
				// **
				// ***
				// ****
				// *****
		

		int i;
		for(i=1; i<=5; i++) {
			// i = 1 에서 * 1개		// i = 1에서 j = 1개
			// i = 2 에서 * 2개		// i = 2에서 j = 2개
			//						// 
			// i = 5에서  * 5개		// i = 5에서 j = 5개
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
		
		

	}

}
