package com.practice.main;

public class LongestCommonSubstring {
	public int getLengthOfLongestCommonSubString(char[] s1, char[] s2, int firstLength, int secondLength) {
		int result = 0;
		StringBuffer sb = new StringBuffer();
		int LCStuff[][] = new int[firstLength + 1][secondLength + 1];
		for (int i = 0; i < firstLength; i++) {
			for (int j = 0; j < secondLength; j++) {
				if ((i != 0 && j != 0) && (s1[i] == s2[j])) {
					LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
					if (result < LCStuff[i][j])
						sb.append(s1[i]);
					result = Math.max(result, LCStuff[i][j]);
				} else {
					LCStuff[i][j] = 0;
				}
			}
		}
		System.out.println(sb);
		return result;
	}

	public static void main(String[] args) {
		String s1 = "amitZwayam";
		String s2 = "amanZwayam";
		LongestCommonSubstring log = new LongestCommonSubstring();
		System.out.println(
				log.getLengthOfLongestCommonSubString(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
	}
}
