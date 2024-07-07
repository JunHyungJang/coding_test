package Greedy;
import java.util.*;
public class BOJ_2437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr= new int[N];
        int maxV = 0;
        for (int i = 0 ; i< N ; i++){
            arr[i] = sc.nextInt();
            maxV += arr[i];
        }

        Arrays.sort(arr);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        for (int i = 0; i < N ; i ++){
            int num = arr[i];
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j : set) {
                if (!set.contains(num + j)){
                    temp.add(num +j);
                }
            }



        }

    }
}
