import java.util.*;

public class Test7_8 {

    public static boolean isBounded(int x){
        return 1<= x && x < 10001;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[10001];

        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = Integer.MAX_VALUE;
        }
//        System.out.println(Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList();

        q.offer(N);
        arr[N] = 0;
        while(!q.isEmpty()) {

            int n = q.poll();
//            System.out.println(n);
            if (n == M){
                System.out.println(arr[n]);
                break;
            }
            int first = n +1 ;
            int second = n - 1;
            int third = n + 5;

            if (isBounded(first)){
                if (arr[first] > arr[n] + 1){
                    arr[first] = arr[n] + 1;
                    q.offer(first);
                }
            }

            if (isBounded(second)){
                if (arr[second] > arr[n] + 1){
                    arr[second] = arr[n] + 1;
                    q.offer(second);
                }
            }

            if (isBounded(third)){
                if (arr[third] > arr[n] + 1){
                    arr[third] = arr[n] + 1;
                    q.offer(third);
                }
            }
        }

    }
}
