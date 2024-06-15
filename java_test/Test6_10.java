import java.util.*;
public class Test6_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i< N; i +=1){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.print(Arrays.toString(arr));
        int start = 0;
        int left = arr[arr.length- 1];
        int answer = left;

        while (start <= left){
            int mid = (start+left)/2;
//            System.out.println( mid+ " " + start + " " + left);

            int cnt = 1;
            int temp = arr[0];

            for (int i = 1; i < N ; i ++){
                if ((arr[i]- temp) >= mid){
                    cnt++;
                    temp = arr[i];
                }
            }
//            System.out.println(cnt);
            if (cnt >= M){
                start = mid+ 1;
                answer = mid;
            }else{
                left = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
