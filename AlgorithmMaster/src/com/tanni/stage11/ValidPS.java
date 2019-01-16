//#9012
package com.tanni.stage11;
import java.util.Scanner;
import java.util.Stack;

public class ValidPS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<num; i++) {
			String str = sc.nextLine();
			System.out.println(valid_ps(str));
		}
	}
	public static String valid_ps(String str) {
		Stack<Character> stack = new Stack<Character>();
		String result = "YES";
		
		if(str.charAt(0) == ')' || str.charAt(str.length()-1) == '(') {
			result = "NO";
		}
		else {
			for(int i = 0; i<str.length(); i++) {
				char s = str.charAt(i);
				if(s == '(') {
					stack.push(s);
				}
				else {
					if(stack.isEmpty()) {
						result = "NO";
						return result;
					}
					else {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty()) {
				result = "NO";
			}
		}
		return result;
	}
}
