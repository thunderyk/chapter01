package com.javaex.ex04;

public class study01 {

	public static void main(String[] args) {
		//다이아몬드 찍기
		int blankA=3, num=0;
		
		for(int i=1;i<8;i++) {
			if(i<5) {
				for(int j=blankA;j>0;j--) {
					System.out.print(" ");
				}
				blankA--;
				for(int k=1;k<=i+num;k++) {
					System.out.print("*");
				}
				num++;
				System.out.println("");
			}else {
				blankA++;
				for(int j=0;j<=blankA;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i-(blankA*3);k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

}
