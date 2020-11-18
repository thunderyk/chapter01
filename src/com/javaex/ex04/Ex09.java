package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;

		while (true) {
			if (num % 6 == 0 && num % 14 == 0) {
				System.out.println(num);
				break;
			}
			num++;
		}

	}

}
