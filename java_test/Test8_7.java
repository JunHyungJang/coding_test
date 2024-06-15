import java.util.*;
public class Test8_7 {

    static int N;
    static int r;

    static int[][] arr = new int[35][35];
    static int answer = 0;

    static int solution2(int n , int r){
        if (arr[n][r] > 0){
            return arr[n][r]
;        }
        if (n == r || r == 0){
            return 1;
        }else return arr[n][r] = solution2(n-1,r-1) + solution2(n-1,r);

    }
    static void solution(int now,int sum){
        if (sum == r){
            answer++;
            return;
        }else{
            for (int i = now; i< N ; i++){
                solution(i+1,sum+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);


        N = sc.nextInt();
        r= sc.nextInt();

//        solution(0,0);
        int answer2 = solution2(N,r);
        System.out.println(answer2);
        System.out.println(answer);
    }
}
