/*
	Date : 2020.05.13
	Autoer : Jaehong
	Description : while 문 예제
	version : 1.0
*/

package Java0513;

public class ex11_whileEx {

	public static void main(String[] args) {

		// while문을 이용해서 주사위를 던졌을 때
		// 5가 나오면 종료하는 프로그램을 만드시오.

		boolean run = true;
		int cnt = 0;
		// while(true) 일때 반복문 실행.
		// while(false) 일때 반복문 종료.
		
		while (run) {
			int dice = (int) (Math.random() * 6) + 1;
			cnt++;
			if (dice == 5) {			//여기서 ==주의 ★★ 그냥 =만 쓰면 오류남
				run = false;	//만일 주사위값이 5가되면 run이 false가 되어라
				//run =ㄹ false 가 되어야 종료
			}
			System.out.println("주사위 값 : " + dice);
			
		}
		System.out.println("\n던진횟수 : " + cnt);
		System.out.println("프로그램을 종료합니다.");
	
	
	}

}
