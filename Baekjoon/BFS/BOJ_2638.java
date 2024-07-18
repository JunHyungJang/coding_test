package BFS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_2638 {

    static int N;
    static int M;
    static int[][] arr;
    static int[] dx ={1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] checkArr;

    static class Node{
        int x ;
        int y;
        public Node(int x ,int y){
            this.x = x;
            this.y = y;
        }
    }
    static boolean isBound(int x , int y){
        return 0<=x  && x <N && 0<=y && y < M;
    }

    static boolean check(){
        for (int i = 0 ; i < N ; i ++){
            for (int j = 0;  j < M ; j ++){
                if (arr[i][j] == 1){
                    return false;
                }
            }
        }

        return true;
    }

    static void BFS(int x,int y, int[][] visited){
        boolean flag = true;

        Queue<Node> q=  new LinkedList<>();
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node(x,y));
        q.offer(new Node(x,y));

        while (!q.isEmpty()){
            Node node = q.poll();
            for (int i = 0 ;i  < 4 ; i ++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (!isBound(nx,ny)){
                    continue;
                }

                if (visited[nx][ny] == 1){
                    continue;
                }

                if (checkArr[nx][ny] == 1){
                    continue;
                }

                visited[nx][ny] = 1;
                if (nx == 0 || nx == N-1 || ny == 0 || ny  == M-1){
                    flag = false;
                }

                nodeList.add(new Node(nx,ny));
                q.offer(new Node(nx,ny));
            }
        }

        for (int i = 0 ; i < nodeList.size() ; i ++){
            int nx = nodeList.get(i).x;
            int ny = nodeList.get(i).y;
            if (flag){
                checkArr[nx][ny] = 2;
            }else{
                checkArr[nx][ny]  = 0;
            }
        }
    }

    static void solution(){
        int[][] tempArr = new int[N][M];
        checkArr = new int[N][M];
        for(int i = 0 ;i < N ; i ++){
            for (int j = 0 ; j < M ; j ++){
                tempArr[i][j] = arr[i][j];
                checkArr[i][j] = arr[i][j];
            }
        }

        int[][] visited = new int[N][M];
        for (int i = 0; i < N ; i ++){
            for (int j = 0; j < M ; j ++){
                if (checkArr[i][j] == 0  && visited[i][j] == 0){
                    visited[i][j] = 1;
                    BFS(i,j,visited);
                }
            }
        }

//        for (int[] ar : checkArr){
//            System.out.println(Arrays.toString(ar));
//        }

        for (int i = 0 ; i < N ;  i ++){
            for (int j = 0;j  < M ; j ++){
                int num = 0;
                for (int k = 0 ; k < 4 ; k ++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (!isBound(nx,ny)){
                        continue;
                    }

                    if (checkArr[nx][ny] == 0){
                        num++;
                    }
                }

                if (num >=2){
                    tempArr[i][j] = 0;
                }

            }
        }

        for (int i = 0;i < N ; i ++){
            for (int j = 0; j < M ; j ++){
                arr[i][j] = tempArr[i][j];
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i = 0; i < N ; i ++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < M; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer=  0;
        while(true){

            if (check()){
                System.out.println(answer);
                break;
            }

            solution();

//            for (int[] ar : arr){
//                System.out.println(Arrays.toString(ar));
//            }
//            System.out.println("----------------------");
            answer++;

        }




    }
}
