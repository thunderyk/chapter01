package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[]args) {
		
		int num,i=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		num = sc.nextInt();
		System.out.println("=====while문 사용=====");
		while(i<10) {
			System.out.println(num+" * "+i+"= "+num*i);
			++i;
		}
		sc.close();
	}
}
