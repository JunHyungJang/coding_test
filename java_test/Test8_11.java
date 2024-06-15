import java.util.*;


class Node2 {
    int x ;
    int y ;
    int cnt;

    public Node2(int x, int y , int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

public class Test8_11 {

    static int[][] arr= new int[7][7];
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int[][] visited = new int[7][7];

    static boolean isBounded(int x , int y){
        return 0<=x && x < 7 && 0<=y && y<7;
    }
    static int BFS(){
        Queue<Node2> q = new LinkedList<>();

        q.offer(new Node2(0,0,0));
        visited[0][0] = 1;
        while (!q.isEmpty()){

            Node2 n = q.poll();
            int x = n.x;
            int y = n.y;
            int cnt = n.cnt;


            if (x == 6 && y == 6){
                return cnt;
            }
            for (int i = 0 ; i < 4; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (!isBounded(nx,ny)){
                    continue;
                }

                if (visited[nx][ny] == 1){
                    continue;
                }

                if (arr[nx][ny] == 1){
                    continue;
                }

                visited[nx][ny] = 1;
                q.offer(new Node2(nx,ny,cnt+1));


            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 7 ; i ++){
            for (int j = 0; j < 7 ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = BFS();

        System.out.println(answer);




    }
}
