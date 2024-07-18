package PartitionSum;

import java.util.*;
public class BOJ_16139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int N = sc.nextInt();
        int[][] arr = new int[str.length][26];

        for (int i = 0 ; i < str.length; i++){
            for (int j = 0 ; j  <26 ; j ++){
                if (i!=0){
                    arr[i][j] = arr[i-1][j];
                }
            }

            arr[i][str[i] - 'a'] += 1;
        }

        for (int i = 0 ; i < N ; i++){
            char s = sc.next().charAt(0);
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left == 0){
                System.out.println(arr[right][s-'a']);
            }else{
                System.out.println(arr[right][s-'a'] - arr[left-1][s-'a']);
            }
        }

    }
}
