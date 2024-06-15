import java.util.*;

public class Test6_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N;i ++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        int first = 0;
        int second= 0;
        for (int i = 0; i < N-1 ; i ++){
            if (arr[i] > arr[i+1]){
                if (!flag) {
                    first = i;
                    second = i + 1;
                    flag = true;
                }else{
                    second = i+1;
                }
            }

        }
        first++;
        second++;
        System.out.print(first + " ") ;
        System.out.print(second);

    }
}
