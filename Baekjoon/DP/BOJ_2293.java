package DP;


import java.util.*;
public class BOJ_2293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N ;i ++){
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[M+1];
        for (int coin : coins){
            for (int i = 0 ; i< M+1 ; i ++){
                if (i-coin >=0){
                    if (i-coin == 0){
                        dp[i]+=1;
                    }else{
                        dp[i] += dp[i-coin];
                    }
                }
            }
//            System.out.println(Arrays.toString(dp));

        }

//        System.out.println(Arrays.toString(dp));

        int answer = dp[M];
        System.out.println(answer);
    }
}
