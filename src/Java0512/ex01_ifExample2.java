/*
	Date : 2020.05.12
	Autoer : Jaehong
	Description : 조건문연습문제2(ifExample2)
	version : 1.0
*/

package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 국어, 영어, 수학점수를 입력받아서 총점, 평균을 구하시오.
		// 평균점수를 이용하여 A+, A, B+, B, C+, C, D+, D, F
		// 프로그램을 만들어보시오!
		// 총점과 평균은 실수형으로
		// 학점처리
		// A+ : 95~100
		// A : 90~94
		// B+ : 85~89
		// B : 80~84
		// C+ : 75~79
		// C : 70~74
		// D+ : 65~69
		// D : 60~64
		// F : 60미만

		Scanner sc = new Scanner(System.in);

		int kor;
		int eng;
		int mat;
		double tot;
		double avg;

		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();

		tot = kor + eng + mat;
		avg = tot / 3;

		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);

		String grade;
		if (avg <= 100) {
			if (avg >= 90) {
				if (avg >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			}
			else if (avg >= 80) {
				if(avg >=85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			}
			else if (avg >= 70) {
				if(avg >=75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			}
			else if (avg >= 60) {
				if(avg >=65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			System.out.println("당신의 학점은 : " + grade + "입니다");

		} else {
			System.out.println("점수 범위를 초과하였습니다.");
		}

	}
}
