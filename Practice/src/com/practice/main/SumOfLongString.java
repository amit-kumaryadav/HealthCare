package com.practice.main;

public class SumOfLongString {
	public static void main(String[] args) {
		String s1 = "897";
		String s2 = "98";
		String temp;
		String tempStr = s1;
		String tempStr1 = s2;
		String finalResult = "";
		int a, b, c, d = 0;
		if (s2.length() > s1.length()) {
			tempStr = s2;
			tempStr1 = s1;
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		while (tempStr.length() > 0) {
			a = 0;b = 0;
			if (tempStr.length() > 0)
				a = Integer.valueOf(Character.toString(s1.charAt(tempStr.length() - 1)));
			if (tempStr1.length() > 0)
				b = Integer.valueOf(Character.toString(s2.charAt(tempStr1.length() - 1)));
			c = (a + b + d) % 10;
			d = (a + b) / 10;
			finalResult = String.valueOf(c) + finalResult;
			if (tempStr.length() > 0)
			tempStr = tempStr.substring(0, tempStr.length() - 1);
			if (tempStr1.length() >0)
			tempStr1 = tempStr1.substring(0, tempStr1.length() - 1);
		}
		System.out.println(finalResult);
	}
}