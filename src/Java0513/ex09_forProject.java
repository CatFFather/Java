/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : forPfoject
	version : 1.0
*/

package Java0513;

public class ex09_forProject {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("□");

			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("■");
			}
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("□");

			}
			System.out.println();
		}

	}

}
