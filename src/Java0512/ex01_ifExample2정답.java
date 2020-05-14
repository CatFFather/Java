package Java0512;

import java.util.Scanner;

public class ex01_ifExample2정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		double tot, avg;

		System.out.println("국어점수 입력 >> ");
		kor = sc.nextInt();
		System.out.println("영어점수 입력 >> ");
		eng = sc.nextInt();
		System.out.println("수학점수 입력 >> ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot/3;
		
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
