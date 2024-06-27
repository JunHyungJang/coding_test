package DFS;
import java.util.*;
public class BOJ_1987 {

    static int N;
    static int M;
    static Character[][] arr;
    static int[][] visited;
    static int answer = 0;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean isBounded(int x ,int y){
        return 0<=x && x <N && 0<=y && y <M;
    }
    static void DFS(int x, int y, Set<Character> set , int cnt){
//        System.out.println(x + " " + y + " cnt " + cnt);

        answer =Math.max(answer,cnt);


        for (int i = 0 ; i < 4;  i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (!isBounded(nx,ny)){
                continue;
            }

            if (visited[nx][ny] == 1){
                continue;
            }

            if (set.contains(arr[nx][ny])){
                continue;
            }

            visited[nx][ny] = 1;
            set.add(arr[nx][ny]);
            DFS(nx,ny,set,cnt+1);
            set.remove(arr[nx][ny]);
            visited[nx][ny] = 0;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new Character[N][M];

        for (int i = 0 ; i < N ; i ++){
            char[] charArr = sc.next().toCharArray();
//            System.out.println(charArr);
            for (int j = 0 ; j < M ; j ++){
                arr[i][j] = charArr[j];
            }
        }
//        System.out.println(arr);
        visited=  new int[N][M];
        Set<Character> set = new HashSet<>();
//        set.add(arr[0][0]);
        visited[0][0] = 1;
        set.add(arr[0][0]);
        DFS(0,0,set,1);

        System.out.println(answer);




    }
}
