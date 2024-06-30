package DP;
import java.util.*;

public class BOJ_1958 {

    static Set<String> solution(int N, int M, char[] charArr1, char[] charArr2){
        int[][] dp2 = new int[N+1][M+1];

        for (int i = 1 ; i <N+1 ; i++){
            for (int j = 1 ; j< M+1 ; j ++){
                if (charArr2[j-1] == charArr1[i-1]){
                    dp2[i][j] = Math.max(dp2[i-1][j-1] +1, Math.max(dp2[i-1][j] , dp2[i][j-1]));
                }else{
                    dp2[i][j] = Math.max(dp2[i-1][j] , dp2[i][j-1]);
                }
            }
        }
        System.out.println("DP");
        for (int[] arr : dp2){
            System.out.println(Arrays.toString(arr));
        }

        Set<String> set = new HashSet<>();

        for (int i = N;i >=0 ; i--){
            for (int j = M ; j >=0 ; j--){
                if (dp2[i][j] >0){
                    String temp = "";
                    int a = i;
                    int b  =j;

                    while (dp2[a][b] >0){
                        temp += charArr2[b-1];
                        a--;
                        b--;
                    }

                    set.add(temp);
                }
            }
        }

        return set;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArr1 = sc.next().toCharArray();
        char[] charArr2 = sc.next().toCharArray();
        char[] charArr3 = sc.next().toCharArray();


        int N = charArr1.length;
        int M = charArr2.length;
        int K = charArr3.length;


        Set<String> set1 = solution(M,K,charArr2,charArr3);
        Set<String> set2 = solution(N,M,charArr1,charArr2);
        Set<String> set3 = solution(N,K,charArr1,charArr3);

        System.out.println("START");
        for (String s : set1){
            System.out.println(s);
        }
        System.out.println("START");
        for (String s : set2){
            System.out.println(s);
        }
        System.out.println("START");
        for (String s : set3){
            System.out.println(s);
        }

        int answer = 0;



        System.out.println(answer);
    }
}
