//#5585
package com.tanni.Greedy;
import java.util.*;

public class Change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		System.out.println(change(price));
	}
	public static int change(int price) {
		int answer = 0;
		int[] coin = {500, 100, 50, 10, 5, 1};
		int temp = 1000 - price;
		int i = 0;
		
		while(true) {
			if(temp == 0) {
				break;
			}
			else if(temp >= coin[i]) {
				answer += temp/coin[i];
				temp = temp%coin[i];
			}
			i++;
		}
		return answer;
	}
}