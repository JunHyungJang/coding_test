package PartitionSum;
import java.util.*;

public class BOJ_1806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (left<=right && right <N){
            int mid = (left+right)/2;

            for (int i = 0; i <N-mid ; i ++){
                
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}
