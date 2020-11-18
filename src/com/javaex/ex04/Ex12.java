package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,sum=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		/*
		do {
			num=sc.nextInt();
			sum+=num;
			System.out.println("합계: "+sum);
		}while(num!=0);
		*/
		/*
		for(;;) {
			num=sc.nextInt();
			sum+=num;
			System.out.println("합계: "+sum);
			if(num==0) {
				break;
			}
		}*/
		while(true) {
			num=sc.nextInt();
			sum+=num;
			System.out.println("합계: "+sum);
			if(num==0) {
				break;
			}
		}
		
		System.out.println("종료");
		sc.close();
	}

}
