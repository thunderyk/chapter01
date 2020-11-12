package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		num = sc.nextInt();
		/* 방법1 이중 이프문
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
			
		}else if(num==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		*/
		//방법2 else if만 사용
		if((num>0)&&(num%2==0)) {
			System.out.println("짝수입니다.");
		}else if((num>0)&&(num%2!=0)) {
			System.out.println("홀수입니다.");
		}else if(num==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		sc.close();
	}

}
