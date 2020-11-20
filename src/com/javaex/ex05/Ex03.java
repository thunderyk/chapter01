package com.javaex.ex05;

public class Ex03 {

	public static void main(String[]args) {
		int[] intArray = new int[6];
		
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = (int)(Math.random()*100)+1;
			System.out.print(intArray[i]+" ");
		}
	}
}
