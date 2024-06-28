package Graph;


import java.util.*;
public class BOJ_1005 {

    static class Node{
        int tower;
        int time;

        public Node(int tower,int time){
            this.tower = tower;
            this.time = time;
        }
    }

    static int N;
    static int K;
    static int[] consumed;
    static int[] total;
    static int[] degrees;
    static int lastTower;
    static ArrayList<Integer>[] map;

    static int solution(){
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1 ; i< N+1; i ++){
            if (degrees[i] == 0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()){
            int tower = q.poll();

            total[tower] += consumed[tower];

            if (tower == lastTower){
                return total[tower];
            }
            for (int num : map[tower]){
                degrees[num]--;
                total[num] = Math.max(total[num], total[tower]);
                if (degrees[num] == 0){
                    q.offer(num);
                }
            }
        }


        return total[lastTower];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ;i < T ; i ++){
            N = sc.nextInt();
            K = sc.nextInt();
//            System.out.println("N K" + N + " "+ K);
            map = new ArrayList[N+1];
            degrees = new int[N+1];
            consumed = new int[N+1];
            total = new int[N+1];
            for (int j = 0 ; j < N+1 ; j ++){
                map[j] = new ArrayList<>();
            }
            for (int j = 0 ; j < N; j ++){
                consumed[j+1] = sc.nextInt();
            }

//            System.out.println("LENGTH:" + map.length);
            for (int j = 0 ; j < K ; j++){
                int start = sc.nextInt();
                int end = sc.nextInt();
//                System.out.println(start + " " + end);
                map[start].add(end);
                degrees[end]++;
            }
            lastTower = sc.nextInt();
            int answer=  solution();
            System.out.println(answer);

//            System.out.println(C);
//            for (ArrayList<Integer> ar : map){
//                System.out.println(ar);
//            }
//            System.out.println(Arrays.toString(degrees));

        }

    }
}
