package PartitionSum;

import java.util.*;
public class BOJ_10986 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long answer = 0;
        int N  = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        int[] summ = new int[N];
        int[] cntArr = new int[M];
        int temp = 0;
        for (int i = 0 ; i < N ; i ++){
            int num = sc.nextInt();
            arr[i] = num % M;
            temp+= arr[i];
            summ[i]=(temp % M );
        }


        for (int i = 0 ; i < N ; i ++){
            int num = summ[i];
            if (num == 0){
                answer++;
            }
            answer+= cntArr[num];
            cntArr[num] +=1;
        }

        System.out.println(answer);


    }
}
