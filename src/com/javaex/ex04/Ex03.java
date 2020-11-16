package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[]args) {
		
		int dan;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		dan = sc.nextInt();
		
		System.out.println("=====for문 사용=====");
		for(int j=1 ; j<10;j++) {
			System.out.println(dan+" * "+j+"= "+dan*j);
		}
		sc.close();
	}
}
