import java.util.*;

public class Test3_$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N;i ++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 0;
        int sum = arr[0];
        int result = 0;
        while (right>=left && right < N) {
            if (sum == M){
                result++;
                right++;
                if (right+1 > N)  {
                    break;
                }
                sum+=arr[right];
            }else if (sum < M){
                right++;
                if (right+1 > N)  {
                    break;
                }
                sum +=arr[right];
            }else{
                sum -=arr[left];
                left++;
            }
        }

        System.out.println(result);
    }
}
