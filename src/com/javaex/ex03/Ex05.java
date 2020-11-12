package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int TIME = 8;
		int budget = 10000, workTime;
		int pay;
		System.out.print("근무시간: ");
		workTime = sc.nextInt();

		if (workTime > TIME) {
			pay = (int)(((workTime - TIME) * budget) * 1.5) + (TIME * budget);
		} else {
			pay = workTime * budget;	
		}
		
		System.out.println("임금은 " + pay + "원 입니다.");
		sc.close();
	}

}
