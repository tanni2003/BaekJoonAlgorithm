//#1427
package com.tanni.stage9;
import java.util.Scanner;
import java.util.Arrays;

public class DescendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strings = sc.nextLine();
		int len = strings.length();
		int[] num = new int[len];
		int[] temp = new int[len];
		String result = "";
		
		for(int i = 0; i<len; i++) {
			num[i] = strings.charAt(i) - '0';
		}
		
		Arrays.sort(num);
		
		for(int i = 0; i<len; i++) {
			temp[i] = num[len-i-1];
		}
		
		for(int i = 0; i<len; i++) {
			result += temp[i];
		}
		System.out.println(result);
	}
}
