import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test10_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i ++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder());

        int total = sc.nextInt();
        int[] dp = new int[total+1];
        dp[1] = 1;
        for (int i = 2; i < total+1; i ++){
            dp[i] = dp[i-1] + 1;
            for (int j = 0 ; j < N ; j++){
                if (i-arr[j] >=0)
                    dp[i] = Math.min(dp[i-arr[j]]+ 1, dp[i]);
                }
            }
//        System.out.println(Arrays.toString(dp));

        System.out.println(dp[total]);
        }
    }

