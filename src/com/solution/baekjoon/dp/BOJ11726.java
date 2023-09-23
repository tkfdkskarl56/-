package com.solution.baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 11726, 2*n 타일링, 실버 3
 */
public class BOJ11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[1001];

		dp[1] = 1;
		dp[2] = 2;

		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		System.out.println(dp[n]);
	}
}
