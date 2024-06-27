package BFS;


import java.util.*;
public class BOJ_1245 {

    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int N;
    static int M;
    static int[][] arr;
    static int[] dx = {1,-1,0,0,1,1,-1,-1};
    static int[] dy = {0,0,1,-1,1,-1,-1,1};
    static int[][] visited;
    static int answer = 0;

    static boolean isBounded(int x,int y){
        return 0<=x && x < N && 0<=y && y < M;
    }
    static void BFS(int x, int y){
        Queue<Node> q = new LinkedList<>();
        int[][] visitedTemp = new int[N][M];
        ArrayList<Node> arrTemp = new ArrayList<>();

        boolean flag =true;
        int num = arr[x][y];

        visitedTemp[x][y] = 1;
        q.offer(new Node(x,y));
        arrTemp.add(new Node(x,y));
        while (!q.isEmpty()){

            if (!flag){
                break;
            }
            Node node = q.poll();

            for (int i = 0 ; i<8 ; i ++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (!isBounded(nx,ny)){
                    continue;
                }

                if (visitedTemp[nx][ny] == 1){
                    continue;
                }

                if (arr[nx][ny] == num){
                    visitedTemp[nx][ny] = 1;
                    arrTemp.add(new Node(nx,ny));
                    q.offer(new Node(nx,ny));
                }else if (arr[nx][ny] > num){
                    flag = false;
                    break;
                }else{
                    visitedTemp[nx][ny] = 1;
                }




            }
        }

        if (flag){
            for (Node node : arrTemp){
                visited[node.x][node.y] = 1;
            }
            answer++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        visited = new int[N][M];
        for (int i = 0 ; i < N ; i ++){
            for (int j = 0 ; j < M ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < N ; i ++){
            for (int j = 0 ; j < M ; j ++){
                if (visited[i][j] == 0){
                    BFS(i,j);
                }
            }
        }

        System.out.println(answer);





    }
}
