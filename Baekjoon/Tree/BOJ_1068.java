package Tree;

import java.util.Scanner;

public class BOJ_1068 {
    static int N;
    static int[] arr;
    static int K;

    static int answer = 0;

    static void solution(int idx){
//        System.out.println("IDX: " + idx);
        if (idx == K){
//            System.out.println("its K");
            return;
        } else if ((idx+1)*2-1 >= arr.length){
            answer++;
            return;
        }
        else {
           solution((idx+1)*2 -1);
           solution((idx+1)*2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0 ; i< N ; i++){
            arr[i] = sc.nextInt();
        }

        K = sc.nextInt();
        solution(0);
        System.out.println(answer);
    }
}
