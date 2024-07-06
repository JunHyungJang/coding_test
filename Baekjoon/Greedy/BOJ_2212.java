package Greedy;
import java.util.*;
public class BOJ_2212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i =0; i < N ; i ++){
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(arr);
        for (int i = 1; i < N; i ++){
            pq.add(arr[i]- arr[i-1]);
        }

        int k = M-1;

        while(k >0 && !pq.isEmpty()){
//            System.out.println(pq.peek());
            pq.poll();
            k--;
        }

        int answer = 0;
        while (!pq.isEmpty()){
            answer+=pq.poll();

        }

        System.out.println(answer);




    }
}
