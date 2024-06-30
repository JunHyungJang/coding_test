package DP;

import java.util.*;
public class BOJ_14402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int[] arr= new int[N];

        for (int i = 0 ; i< N ; i++){
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        Arrays.fill(dp,1);
        int maxSize = 1;
        for (int i = 0 ; i< N ; i++){
            for (int j = i-1; j >=0 ; j --){
                if (arr[i] > arr[j] && dp[j] >= dp[i]){
                    dp[i] = dp[j]+1;
                    maxSize = Math.max(maxSize,dp[i]);
                }
            }
        }

//        System.out.println(Arrays.toString(dp));
        List<Integer> lst = new ArrayList<>();
        System.out.println(maxSize);
        for (int i = N-1 ; i >=0 ; i --){
            if (dp[i] == maxSize){
                lst.add(arr[i]);
                maxSize--;
            }

            if (maxSize == 0){
                break;
            }
        }

        Collections.sort(lst);

        for (int num : lst){
            System.out.print(num + " ");
        }
    }


}
