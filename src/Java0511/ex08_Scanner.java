/*
	Date : 2020.05.11
	Autoer : Jaehong
	Description : 입력(Scanner)
	version : 1.0
*/

package Java0511;

import java.util.Scanner;

// 두 번째
// 2.Scanner 클래스는 java.util 패키지에 있는 입력 클래스
public class ex08_Scanner {

	public static void main(String[] args) {
		// 첫 번째
		// 1.스캐너를 사용하기 위해 스캐너 객체 선언
		Scanner sc = new Scanner(System.in); // 통일성을 쉬해 공부할때는 sc로 사용
		Scanner scan = new Scanner(System.in); // scan으로 설정해도 됨

		String name;
		int age;
		String address;

		System.out.println("println");
		System.out.print("print");
		System.out.println("두개 차이점 확인하기");
		// ln : 줄바꿈

		System.out.println("이름을 입력하세요.");
		name = sc.next();
		// 세 번째
		// 변수에 입력한 값을 담는다.

		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine().trim();
		// trim() : 앞뒤 공백을 제거한다.

		System.out.println("주소를 입력하세요.");
		address = sc.nextLine();

		System.out.println();
		System.out.println("===== 출력내용 =====");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + address);
	}

}
