/*
	Date : 2020.05.12
	Autoer : Jaehong
	Description : ex00_day03Summary
	version : 1.0
*/

package Java0512;

public class ex00_day03Summary {

	public static void main(String[] args) {
		// 1. 랜덤메소드 : 0 보다 크거나 같고, 1보다 작은 수를 무작위로 발생시킨다.
		// 수를 무작위로 발생시킨다.
		// 0.00000 ~ 0.99999...
		
		int rNum = (int)(Math.random() *10) +1;
		// 1부터 10까지의 숫자중 랜덤으로 발생
		// (int)(Math.random()*N) + S
		// 시작값 : S , 끝나는 값 : N
		
		//int rNum = (int)(Math.random() *6) +1;
		
		double dNum = Math.random();
		System.out.println("dNum : " + dNum);
		// 0.94188 ==>> 9.4188 ==>> 9 ==>> 10
		// 0.93124 ==>> 9.3124 ==>> 9 ==>> 10
		// 0.74396 ==>> 7.4396 ==>> 7 ==>> 8
		
		//주사위
		// 0.94188 ==>> 5.65128 ==>> 5 ==>> 6
		// 0.93124 ==>> 5.58744 ==>> 5 ==>> 6
		// 0.74396 ==>> 4.46373 ==>> 4 ==>> 5
		
		// 2. 조건문 switch-case
		/*
		 	switch(조건변수){
		 	case 변수값1:
		 		해당 조건이 참일때 실행
		 		break;
		 	case 변수값2:
		 		해당 조건이 참일때 실행
		 		break;
		 	case 변수값3:
		 		해당 조건이 참일때 실행
		 		break;

		 	~~~~
		 	default:
		 		case에서 어떤 조건도 맞지 않을때 실행
		 		break;
		 	}		 
		  */
		// break 가 실행될때까지 다음 case 문을 실행한다.
		
		// 3. 반복문 For
		
		/*
		  	for(초기화식; 조건식; 증강식){
		  		반복할수행문
		  	}
		  
		 
		 */
		
		
		
		
		
	}

}
