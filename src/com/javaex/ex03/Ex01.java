package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int score;

		System.out.print("점수: ");
		score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격입니다.");
		}
		
		sc.close();
	}

}
