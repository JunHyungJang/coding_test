import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Test5_3 {
    static int N;
    static int[][] arr;

    static int move;

    static int[] moveArr;

    static int solution(Stack<Integer> s){
        int result = 0;
        for (int x : moveArr){
//            System.out.println(s);
//            System.out.println(x);
            for (int i = 0; i < N; i ++){
                if (arr[i][x] != 0){
                    int now = arr[i][x];

                    s.push(now);
                    while(s.size() >= 2){
                        int first = s.pop();
                        int second = s.pop();

                        if (first != second){
                            s.push(second);
                            s.push(first);
                            break;
                        }else{
                            result+=2;
                        }
                    }
                    arr[i][x] = 0;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N][N];

        for (int i = 0; i < N; i ++){
            for (int j = 0; j < N; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        move = sc.nextInt();

        moveArr = new int[move];

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < move; i ++){
            moveArr[i] = sc.nextInt()-1;
        }

//        System.out.println(Arrays.toString(moveArr));

        int result = solution(s);
        System.out.println(result);


    }


}
