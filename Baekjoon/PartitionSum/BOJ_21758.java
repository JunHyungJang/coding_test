package PartitionSum;
import java.util.*;

public class BOJ_21758 {
    static int N;
    static int[] arr;
    static int case1(){
        int answer = 0;
        int[] sum = new int[N];
        for (int i =1 ; i < N; i ++){
            sum[i] = sum[i-1] + arr[i];
        }
        int totalSum = sum[N-1];
//        System.out.println(totalSum);
        for (int i = 1; i < N ; i++){
            answer = Math.max(answer, totalSum + totalSum - sum[i] - arr[i]);

        }
        return answer;
    }

    static int case2(){
        int answer = 0;
        int[] sum = new int[N];
        for (int i = N-2 ; i >=0 ; i --){
            sum[i] = sum[i+1] + arr[i];
        }

        int totalSum = sum[0];

        for (int i = N-2 ; i >= 0 ; i --){
            answer = Math.max(answer,totalSum + totalSum - sum[i] - arr[i]);
        }

        return answer;
    }

    static int case3(){
        int answer = 0;
        int[] rightTotalSum = new int[N];
        int[] leftTotalSum = new int[N];

        for (int i = 1; i < N ; i ++){
            rightTotalSum[i] = rightTotalSum[i-1] + arr[i];
        }

        for (int i = N-2 ; i >= 0 ; i--){
            leftTotalSum[i] = leftTotalSum[i+1] + arr[i];
        }

        for (int i =1 ; i <= N-2 ; i ++){
            answer = Math.max(answer , leftTotalSum[i] + rightTotalSum[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N ; i ++){
            arr[i] = sc.nextInt();
        }
        int answer = 0;

        //case 1 벌 벌 꿑통
        int answer1 = case1();
        //case2 꿀통 벌 벌
        int answer2 = case2();
        //case3 벌 꿀통 벌

        int answer3 = case3();

//        System.out.println(answer1 + " " + answer2  + " " + answer3);

        int result = 0;
        result = Math.max(Math.max(answer1, answer2) , answer3);
        System.out.println(result);
    }
}
