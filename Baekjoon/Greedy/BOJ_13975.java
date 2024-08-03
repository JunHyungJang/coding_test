package Greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_13975 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0 ; i < T ; i ++){
            int K = sc.nextInt();

            PriorityQueue<Long> pq = new PriorityQueue<>();


            for (int j = 0 ; j < K ; j ++){
                pq.offer(sc.nextLong());
            }

            long cnt = 0;
            while (pq.size() > 1){
                long first = pq.poll();
                long second = pq.poll();

                long sum = first+ second;
                cnt+= sum;
                pq.offer(sum);
            }

            System.out.println(cnt);



        }
    }
}
