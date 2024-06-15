import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test8_5 {

    static int N;
    static Integer[] arr ;
    static int total;

    static int answer = Integer.MAX_VALUE;

    static void DFS(int sum,int cnt) {
        if (sum > total){
            return;
        }
        if (cnt >=answer){
            return;
        }
        if (sum == total){
            answer= Math.min(answer,cnt);
        }else{
            for (int i = 0 ;i < N; i ++){
                DFS(sum + arr[i], cnt+1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N  = sc.nextInt();
        arr = new Integer[N];

        for (int i = 0 ; i < N; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        total = sc.nextInt();

        DFS(0,0);

        System.out.println(answer
        );

    }
}
