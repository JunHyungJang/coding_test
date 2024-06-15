import java.util.Scanner;

public class Test8_10 {
    static int[][] arr = new int[7][7];
    static int[][] visited = new int[7][7];
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int answer = 0;

    static boolean isBounded(int x ,int y){
        return 0<=x && x < 7 && 0<=y && y<7;
    }
    static void DFS(int x , int y) {
//        System.out.println(x + " " + y);
        if (x == 6 && y == 6){
            answer++;
            return;
        }

        for (int i = 0 ; i < 4 ; i ++){
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
            DFS(nx,ny);
            visited[nx][ny] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7 ; i ++){
            for (int j = 0 ; j < 7 ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        visited[0][0] = 1;
        DFS(0,0);
        System.out.println(answer);

    }
}
