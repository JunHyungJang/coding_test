import java.util.*;
public class Test8_2 {
    static  int C;
    static int N;

    static int answer = 0;

    static int[] arr ;

    static void DFS(int sum, int now){
        if (sum < C){
            answer = Math.max(sum,answer);
        }
        if(now == N){
            return;
        }else{
            DFS(sum+arr[now], now+1);
            DFS(sum,now+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        C = sc.nextInt();
        N = sc.nextInt();

        arr = new int[N];

        for (int i = 0; i< N;i ++){
            arr[i] = sc.nextInt();
        }

        DFS(0,0);

        System.out.println(answer);
    }

}
