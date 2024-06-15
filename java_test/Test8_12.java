import java.util.Arrays;
import java.util.Scanner;

public class Test8_12 {

    static int N;
    static int M;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int[][]arr;
//    static int[][]

    static int answer = 0;

    static boolean check(){
        boolean flag = true;

        for (int i = 0; i < M ; i ++){
            for (int j = 0; j < N ; j ++){
                if (arr[i][j] == 0){
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    static boolean isBounded(int x, int y){
        return 0<=x && x <M && 0<=y && y < N;
    }

    static boolean solution(){
        boolean flag = false;
        int[][] oldArr= new int[M][N];
        for (int i = 0; i < M; i ++){
            oldArr[i] = arr[i].clone();
        }
        for (int i = 0 ; i < M; i ++){
            for (int j = 0 ; j < N; j ++){
                if (arr[i][j] != 1){
                    continue;
                }

                for (int k = 0; k < 4 ; k ++){
                    int nx = i + dx[k];
                    int ny = j  + dy[k];

                    if (!isBounded(nx,ny)){
                        continue;
                    }

                    if (arr[nx][ny] !=0){
                        continue;
                    }

                    oldArr[nx][ny] = 1;
                    flag = true;
                }
            }
        }

        arr = oldArr.clone();
        for (int i = 0; i < M; i ++){
            arr[i] = oldArr[i].clone();
        }

        return flag;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M][N];


        for (int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        if (check()){
            System.out.println(0);
            return;
        }
//        answer++;

        while (true){
            answer++;


            boolean flag = solution();
            if (!flag){
                System.out.println(-1);
                return;
            }

            if (check()){
                System.out.println(answer);
                return;
            }
        }



    }
}
