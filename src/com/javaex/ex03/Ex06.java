package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int given_num = 3, input_num;

		System.out.println("점수를 입력하세요");
		input_num = sc.nextInt();

		if ((input_num % given_num) == 0) {
			System.out.println(input_num + "은(는) " + given_num + "의 배수입니다.");
		} else if (input_num == 0) {
			System.out.println(input_num + "은(는) " + given_num + "의 배수가 아닙니다.");
		} else {
			System.out.println(input_num + "은(는) " + given_num + "의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
