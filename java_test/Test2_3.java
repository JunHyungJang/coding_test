import java.util.Arrays;
import java.util.Scanner;

public class Test2_3 {

    static boolean solution(int a, int b){
        if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0 ;i < N;i ++){
            A[i] = sc.nextInt();
        }
        for (int i = 0 ;i < N;i ++){
            B[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));

        for (int i = 0; i < N; i ++){
            if (A[i] == B[i]){
                System.out.println("D");
            }else{
                boolean check = solution(A[i],B[i]);

                if (check){
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
            }
        }
    }
}
