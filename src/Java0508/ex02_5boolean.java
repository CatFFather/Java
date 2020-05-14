package Java0508;

public class ex02_5boolean {

	public static void main(String[] args) {
		// 논리형 (맞다 아니다를 판단해줌)
		// boolean ( Y / N ) ==> true/ false
		
		int num1,num2;
		num1 = 1;
		num2 = 2;
		
		boolean bool1 = true;
		System.out.println(bool1);
		
		boolean bool2 = false;
		System.out.println(bool2);
		
		boolean bool3;
		
		if(num1>num2) {     // num1 값이 num2 보다  크다
			bool3 = false;   // num1 값이 num2보다 작기 때문에 false
		} else {
			bool3 = true;
		}
		
		System.out.println(bool3);
	}

}
