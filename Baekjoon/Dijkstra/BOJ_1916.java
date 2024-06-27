package Dijkstra;

import java.util.*;
public class BOJ_1916 {

    static class Node implements Comparable<Node>{
        int num;
        int distance;

        public Node(int num,int distance){
            this.num =num;
            this.distance = distance;
        }

        public int compareTo(Node n){
            return this.distance - n.distance;
        }


    }

    static ArrayList<int[]>[] arr;
    static int N;
    static int answer = 0;
    static int[] dp;

    static void dijkstra(int start,int end){
        PriorityQueue<Node> q = new PriorityQueue<>();
        int[] visited = new int[N+1];
//        visited[start] = 1;
        q.offer(new Node(start,0));
        dp[start] = 0;

        while (!q.isEmpty()){
            Node node = q.poll();
            int num = node.num;
            int distance = node.distance;
//            System.out.println("NOW: "+ num);
            if (visited[num] == 1){
                continue;
            }
            visited[num] = 1;
            for (int[] ar : arr[num]){
                int nextNum = ar[0];
                int nextDistance = ar[1];
                if (dp[nextNum] > distance + nextDistance){
                    dp[nextNum] = distance + nextDistance;
                    q.offer(new Node(nextNum,dp[nextNum]));
                }

            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N =sc.nextInt();
        int M = sc.nextInt();

        arr = new ArrayList[N+1];

        dp = new int[N+1];

        for (int i = 0 ; i < N+1; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0 ; i < N+1 ; i ++){
            arr[i] = new ArrayList<int[]>();
        }

        for (int i = 0 ; i < M ; i ++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();

            arr[a].add(new int[]{b, c});
//            arr[b].add(new int[]{a,c});
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        dijkstra(start,end);
//        System.out.println(Arrays.toString(dp));

        System.out.println(dp[end]);



    }
}
