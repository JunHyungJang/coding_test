import java.util.Scanner;
import java.util.*;
public class Test8_1 {
    static int[] arr;
    static int total;
    static int N;

    static String answer = "NO";
    static void DFS(int sum, int now){
        if (now == N){
            if (total-sum == sum){
                answer = "YES";
            }
            return;
        }else{
            DFS(sum+arr[now], now+1);
            DFS(sum,now+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        arr = new int[N];

        for (int i = 0 ; i< N ; i ++){
            int num = sc.nextInt();
            arr[i] = num;
            total+=num;
        }

        DFS(0,0);
        System.out.println(answer);



    }
}
