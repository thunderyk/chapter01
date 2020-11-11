package com.javaex.ex01;

public class Ex06 {

	public static void main(String[]args) {
		
		int num01=1;
		float num02 = 1.0f;
		float result01 = num01+num02;
		
		
		///////////////////////////////////////////////////////
		//강제형변환 문법
		int i = (int)1112.42323;
		System.out.println(i);
		
		float var01 = 12.5f;
		int var02 = (int)var01;
		
		
		//강제형변환: 확대변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v02);
		
		//강제형변환: 축소변환(비정상)
		int v05 = 123023290;
		byte v06 = (byte)v05;
		System.out.println(v06);
		System.out.println(v05);
		
		//강제형변환: 실수 -> 정수(소수점 이하 사라짐)
		double v07 = 1235.57343434;
		int v08 = (int)v07;
		System.out.println(v08);
		
		
	}
}
