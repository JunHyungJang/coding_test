package PartitionSum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];
        int[][] dp = new int[N+1][N+1];
        for (int i = 1; i < N+1 ; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N+1 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1 ; i < N+1 ; i ++){
            for (int j = 1 ; j < N+1 ; j ++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] -dp[i-1][j-1] + arr[i][j];
            }
        }

        for (int i = 0 ; i <M ;i ++){
            st = new StringTokenizer(br.readLine());
            int startX =Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int answer = dp[endX][endY] - dp[endX][startY-1] - dp[startX-1][endY] + dp[startX-1][startY-1];
            System.out.println(answer);
        }

    }
}
