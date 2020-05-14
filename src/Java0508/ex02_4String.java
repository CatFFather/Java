/*
	Date : 2020.05.08
	Autoer : Jaehong
	Description : ex02_4String
	version : 1.0
*/


package Java0508;

public class ex02_4String {

	public static void main(String[] args) {
		String str1 = "자바공부는";
		String str2 = "재미없어";
		String str3 = "너무 어려워";
		
		String result;					// 변수선언
		result = str1 + str2;			// 변수초기화
		System.out.println(result);
		//자바공부는 재미없어
		
		result = str1 + str3; //변수초기화
		System.out.println(result);
		//자바공부는 너무 어려워
		
		result = str1 + 8.0;
		System.out.println(result);
		//자바공부는 8.0
		
		System.out.println(str1 + str2);
		System.out.println(str1 + " 너무 " + str2);
		//자바공부는 너무 재미없어
	}

}
