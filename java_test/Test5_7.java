import java.util.*;


class Node {
    int x ;
    int y;

    public Node(int x ,int y){
        this.x = x;
        this.y = y;
    }


}
public class Test5_7 {

    static int solution(Queue<Node> s,PriorityQueue<Integer> pq,int M){
        int cnt = 0;
//        System.out.println(pq);
        while (true){
//            System.out.println(pq.peek());
            Node node = s.poll();

            if (node.y == -pq.peek()){
                cnt++;
                if (node.x == M){
                    return cnt;
                }
                pq.poll();
            }else{
                s.offer(node);
            }

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Queue<Node> s = new LinkedList<>();
        int maxValue = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i ++){
            int t = sc.nextInt();
            pq.add(-t);
            maxValue = Math.max(maxValue,t);
            Node node = new Node(i,t);
            s.offer(node);
        }

        int result = solution(s,pq, M);

        System.out.println(result);

        Queue<Node> q = new LinkedList<>();
        Node l = new Node(1,1);
        q.offer(l);
        l = null;

        System.out.println(q.peek().x);



    }
}
