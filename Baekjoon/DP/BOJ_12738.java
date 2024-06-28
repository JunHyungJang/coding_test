package DP;
import java.util.*;

public class BOJ_12738 {

    static int N;
    static int[] arr;

    static int binarySearch(int num, List<Integer> lst){
        int left = 0;
        int right = lst.size()-1;

        while (left <= right){
            int mid = (left +right)/2;
            if (lst.get(mid) <  num){
                left = mid +1;
            }else {
                right = mid-1;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0 ; i< N ; i ++){
            arr[i]= sc.nextInt();
        }

        List<Integer> lst = new ArrayList<>();
        if (N==1){
            System.out.println(1);
            return;
        }
        lst.add(arr[0]);
        for (int i = 1 ; i < N ; i ++){
            int num = arr[i];
//            System.out.println(num);
//            System.out.println(lst);
            int s = lst.size();
            if (num > lst.get(s-1)){
                lst.add(num);
            }else{
                int idx = binarySearch(num,lst);
//                System.out.println(idx);
                lst.set(idx,num);
            }
        }

//        System.out.println(lst);
        System.out.println(lst.size());
    }

}

