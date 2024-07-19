package DP;

//import java.util.Scanner;
import java.util.*;
public class BOJ_12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] weight = new int[N];
        int[] value = new int[N];
        int[][] dp = new int[N+1][K+1];

        for (int i = 0; i < N ; i ++){
            int w = sc.nextInt();
            int v = sc.nextInt();

            weight[i] = w;
            value[i] = v;
        }

        for (int i = 1 ; i < N+1 ; i ++){
            int w = weight[i-1];
            int v = value[i-1];
            for (int j = 1 ; j < K + 1 ; j ++){
                if (j >= w){
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i-1][j-w] + v);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

//        System.out.println(Arrays.toString(dp));

//        for (int[] arr : dp){
//            System.out.println(Arrays.toString(arr));
//        }

        System.out.println(dp[N][K]);


    }
}
