import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2_6 {

    static boolean solution(int num){
//        System.out.println("num" + num);
        if (num==1){
            return false;
        }
        if ( num == 2){
            return true;
        }
        for (int i = 2; i <num ; i ++){
//            System.out.println(num/i);
            if ((num % i) ==0){
//                System.out.println(i);

                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++){
            String str = new StringBuilder(sc.next()).reverse().toString();

            int num = Integer.parseInt(str);
            if (solution(num)){
                arr.add(num);
            }
        }
        for (int x : arr){
            System.out.print(x + " ");
        }

    }
}
