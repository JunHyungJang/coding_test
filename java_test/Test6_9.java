import java.util.*;
public class Test6_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0 ; i< N; i ++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = (N*(N-1))/2;
        int answer = end;
        while(start<=end){
            int mid = (start+end)/2;

            int temp = 0;
            int cnt = 0;
            for (int i = 0; i < N; i ++){
                if ((temp+arr[i]) <= mid){
                    temp+=arr[i];
                }else{
                    temp = arr[i];
                    cnt++;
                }
            }

            if (temp !=0){
                cnt++;
            }
//            System.out.println("MID" + mid);
//            System.out.println("CNT" + cnt);
            if (cnt <= M){
                answer = Math.min(answer,mid);
                end = mid -  1;
//                System.out.println(mid);
            }else{
                start = mid + 1;
            }

        }
        System.out.println(answer);

    }
}
