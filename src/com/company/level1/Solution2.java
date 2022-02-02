package com.company.level1;

import java.util.Scanner;

public class Solution2 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long[] answer = solution(x, n);
        for (long l : answer) {
            System.out.println(l);
        }
    }
}