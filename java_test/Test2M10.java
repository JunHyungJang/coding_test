import java.util.Arrays;
import java.util.Scanner;

public class Test2M10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int N = sc.nextInt();

        int[][] arr =  new int[N+2][N+2];


        for (int i = 1 ; i <N+1;i ++){
            for (int j = 1; j<N+1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        System.out.println(Arrays.deepToString(arr));

        for (int i = 1 ; i <N+1; i ++){
            for (int j = 0; j <N+1; j ++){
                int num = arr[i][j];

                if (num > arr[i-1][j] && num >arr[i+1][j] && num > arr[i][j-1] && num > arr[i][j+1]){
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);



    }
}
