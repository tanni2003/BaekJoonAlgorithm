//#7568
package com.tanni.stage22;
import java.util.Scanner;

public class Big {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] big = new int[num][2];
		int[] rank = new int[num];
		//몸무게, 키 입력
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<2; j++) {
				big[i][j] = sc.nextInt();
			}
		}
		
		//rank 1로 초기화
		for(int i = 0; i<num; i++) {
			rank[i] = 1;
		}
		
		//몸무게, 키가 더 큰 사람이 있으면 rank + 1
		for(int i = 0; i<num; i++) {
			int weight = big[i][0];
			int height = big[i][1];
			for(int j = 0; j<num; j++) {
				if(weight<big[j][0] && height<big[j][1]) {
					rank[i]++;
				}
			}
		}
		for(int i = 0; i<num; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
