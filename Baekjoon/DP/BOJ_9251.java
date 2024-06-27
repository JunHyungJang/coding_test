package DP;


import java.util.*;
public class BOJ_9251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str1 = sc.next().toCharArray();
        char[] str2 = sc.next().toCharArray();

        int N = str1.length;
        int M = str2.length;

        int[][] dp = new int[N+1][M+1];

        for (int i = 1; i < N+1; i ++){
            for (int j = 1 ; j < M+1 ; j ++){
                if (str1[i-1] == str2[j-1]){
                    dp[i][j] = Math.max(dp[i-1][j-1] +1 , Math.max(dp[i-1][j] , dp[i][j-1]));
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }

//        for (int[] ar : dp){
//            System.out.println(Arrays.toString(ar));
//        }

        int answer = 0 ;

        for (int i  = 0 ; i < N +1; i ++){
            for (int j = 0 ; j < M+1; j ++){
                answer = Math.max(answer,dp[i][j]);
            }
        }

        System.out.println(answer);


    }
}
