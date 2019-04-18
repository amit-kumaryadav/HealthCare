package com.practice.main;

public class GettingDuplicateUsingHashing {
	static final int char_length = 256;

	public static void fillChar(String str, int[] count) {
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)] = count[str.charAt(i)] + 1;
		}
	}

	public static void genrateDuplicate(String str) {
		int[] count = new int[char_length];
		fillChar(str, count);
		for (int i = 0; i < char_length; i++) {
			if (count[i] > 1)
				System.out.printf("%c, count = %d \n", i, count[i]);
		}
	}

	public static void main(String args[]) {
		String str = "zwwweeeerterr";
		genrateDuplicate(str);
	}
}
