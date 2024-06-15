import java.util.*;

public class Test3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++){
            int n = sc.nextInt();
            if (!map.containsKey(n)){
                map.put(n,1);
            }
        }

        int M = sc.nextInt();

        for (int i = 0 ; i < M; i ++){
            int n = sc.nextInt();

            if (map.containsKey(n)){
                result.add(n);
            }
        }
//        Arrays.sort(result);
        Collections.sort(result);
        System.out.println(result);
    }
}
