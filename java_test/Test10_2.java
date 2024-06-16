import java.util.*;

public class Test10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] dp = new int[N+2];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < N+2; i ++){
            dp[i] = dp[i-1] + dp[i-2];
        }

//        System.out.println(Arrays.toString(dp));

        System.out.println(dp[N+1]);


    }
}
