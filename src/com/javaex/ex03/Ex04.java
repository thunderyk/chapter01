package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int TIME = 8;
		int budget=10000, overCharge=12000, workTime,pay;
		
		System.out.print("근무시간: ");
		workTime = sc.nextInt();
		
		if(workTime>TIME) {
			pay= (workTime-TIME)*overCharge + (TIME*budget);
		}else {
			pay = workTime*budget;
		}
		System.out.println("임금은 "+pay+"원 입니다.");
		sc.close();
		
	}

}
