import java.util.*;

public class Test10_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N+1];

        dp[1] = 1;

        for (int i = 2 ; i < N+1 ; i ++){
            for (int j = 1; j < 3 ; j ++){
//                System.out.println(j);
                if ((i-j) == 0){
                    dp[i]++;
                }else{
                    dp[i] += dp[i-j];
                }
            }
        }

//        System.out.println(Arrays.toString(dp));
        System.out.println(dp[N]);
    }
}
