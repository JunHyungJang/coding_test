package DP;
import java.lang.reflect.Array;
import java.util.*;
public class BOJ_17404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][3];

        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i ++){
            Arrays.fill(dp[i],1000*1000);
        }
        for (int i = 0; i < N ; i ++){
            int a = sc.nextInt();
            int b  = sc.nextInt();
            int c = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            arr[i][2] = c;
        }
       int answer = 1000*1000;
       for (int i = 0; i < 3 ; i ++){
           for (int j=0; j < 3 ; j ++){
               if (j==i){
                   dp[0][j] = arr[0][i];
               }else{
                   dp[0][j] = 1000*1000;
               }
           }
           for (int j = 1; j < N ; j ++){

               dp[j][0] = Math.min(dp[j-1][1], dp[j-1][2]) + arr[j][0];
               dp[j][1] = Math.min(dp[j-1][0], dp[j-1][2]) + arr[j][1];
               dp[j][2] = Math.min(dp[j-1][0], dp[j-1][1]) + arr[j][2];
           }


//           for (int[] ar : dp){
//               System.out.println(Arrays.toString(ar));
//           }
           for (int j = 0 ; j < 3 ;j ++){
               if (j != i){
//                   System.out.println(answer + " " + dp[N-1][j]);
                   answer = Math.min(answer,dp[N-1][j]);
               }
           }
       }

//        System.out.println(Arrays.toString(dp[N-1]));

        System.out.println(answer);
    }
}
