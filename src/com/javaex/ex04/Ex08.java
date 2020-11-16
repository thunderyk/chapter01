package com.javaex.ex04;

public class Ex08 {

	public static void main(String[]args) {
		int star = 1;
		for(int i=0;i<6;i++) {
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
	}
}
