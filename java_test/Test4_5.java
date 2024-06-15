import java.util.*;

public class Test4_5 {
    static  int N;
    static int K;
    static int[] arr;

    static TreeSet<Integer> result = new TreeSet<>(Collections.reverseOrder());
    public static void solution(List<Integer> lst, int num){
        if (lst.size() == 3){
            int sum = 0;
            for (int x : lst) {
                sum+=x;
            }
            result.add(sum);
            return;
        }

        for (int i = num ; i < arr.length; i ++){
            lst.add(arr[i]);
            solution(lst,i+1);
            lst.remove(lst.size()-1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int answer= -1;
        N = sc.nextInt();
        K = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i <N; i ++){
            arr[i] = sc.nextInt();
        }

        List<Integer> lst = new ArrayList<>();
        solution(lst,0);

        int cnt = 0;

        for (int x : result){
            cnt++;
            if (cnt == K){
                System.out.println(x);
                return;
            }
        }

        System.out.println(answer);;

    }
}
