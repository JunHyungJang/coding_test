import java.util.*;

public class Test3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i ++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < K; i ++){
            start+=arr[i];
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        result.add(map.size());
        System.out.println(map);
        for (int i = K; i < N; i ++){
            System.out.println(map);
            System.out.println(arr[i-K]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if (map.get(arr[i-K]) ==1) {
                map.remove(arr[i-K]);
            }else{
                map.put(arr[i-K],map.get(arr[i-K]) -1);
            }

            result.add(map.size());
        }

        System.out.println(result);
    }
}
