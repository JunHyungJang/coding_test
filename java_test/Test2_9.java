import java.util.Arrays;
import java.util.Scanner;

public class Test2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr=  new int[N][N];
        for (int i = 0; i < N; i ++){
            for (int j = 0 ; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        int maxValue = 0;

        //row

        for (int i = 0 ; i < N ; i++){
            int ans1 = 0;
            int ans2 = 0;
            for (int j = 0; j< N;j ++){
                ans1+= arr[i][j];
                ans2+= arr[j][i];
            }
            maxValue = Math.max(maxValue,ans1);
            maxValue = Math.max(maxValue,ans2);
        }

        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i<N; i ++){
            ans1 += arr[i][i];
            ans2 += arr[i][N-i-1];
        }

        maxValue = Math.max(maxValue,ans1);
        maxValue = Math.max(maxValue,ans2);

        System.out.println(maxValue);




    }
}
