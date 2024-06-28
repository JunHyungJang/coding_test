package BackTracking;

import java.util.*;
public class BOJ_15663 {
    static int[] arr;
    static int N;
    static int M;
    static Set<String> set;
    static int[] visited ;
    static int[] result ;
    static void permutation(int cnt){
//        System.out.println(cnt);
        if (cnt == M){
//            System.out.println(Arrays.toString(result));
            String temp = "";
            for (int i : result){
                temp += i + " ";
            }
            set.add(temp);
            return;

        }else{
            for (int i = 0 ; i < N; i++){
                if (visited[i] == 0){
                    visited[i] = 1;
                    result[cnt] = arr[i];
                    permutation(cnt+1);
                    visited[i] = 0;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

//        List<Integer> arr = new ArrayList<>();

        arr = new int[N];
        result = new int[M];
        set = new LinkedHashSet<>();
        for (int i = 0 ; i < N ; i ++){
            arr[i] = sc.nextInt();
        }

        visited = new int[N];
        Arrays.sort(arr);

        permutation(0);

        for (String s : set){
            System.out.println(s);
        }
//        System.out.println(set.size());
    }
}
