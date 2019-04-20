package com.practice.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

// Complexity of this algorithm is o(n)
class DriverCalss {
	public boolean getExpression(String Exp) {
		char[] charterArray = Exp.toCharArray();
		ArrayList<Character> openingExp = new ArrayList<>(Arrays.asList('{', '['));
		ArrayList<Character> closiongExp = new ArrayList<>(Arrays.asList('}', ']'));
		HashMap<Character, Character> keyValuePair = new HashMap<>();
		keyValuePair.put(']', '[');
		keyValuePair.put('}', '{');
		Stack<Character> stck = new Stack<>();
		for (char ch : charterArray) {
			if (openingExp.contains(ch)) {
				stck.push(ch);
			} else if (closiongExp.contains(ch)) {
				if (stck.isEmpty()) {
					return false;
				}
				if (!keyValuePair.get(ch).equals(stck.pop())) {
					return false;
				}
			}
		}
		if (!stck.isEmpty()) {
			return false;
		}
		return true;
	}
}

public class ParenthesisCheckInExpression {
	public static void main(String[] args) {
		DriverCalss driver = new DriverCalss();
		String Exp = "{[{}]}";
		if (driver.getExpression(Exp)) {
			System.out.println("Expression is balanced");
		} else {
			System.out.println("Expression is not balanced");
		}
	}
}
