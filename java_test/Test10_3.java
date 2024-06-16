import java.util.*;

public class Test10_3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int N =sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0 ; i <N; i ++){
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        dp[0] = 1;
        int answer = 0;
        for (int i = 1; i < N ; i ++){
            int temp = 1;
            for (int j = i-1; j >=0; j --){
                if (arr[j] < arr[i]){
                    temp = Math.max(temp,dp[j] + 1);
                }
            }
            dp[i] = temp;
            answer = Math.max(temp,answer);

        }

//        System.out.println(Arrays.toString(dp));
        System.out.println(answer);
//        System.out.println(Math.max(A));


    }
}
