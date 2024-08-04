package PartitionSum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_1749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N+1][M+1];
        int[][] dp = new int[N+1][M+1];

        for (int i = 1 ; i < N+1 ; i ++){
            for (int j = 1 ; j < M+1 ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1 ; i < N+1; i ++){

        }




    }
}
