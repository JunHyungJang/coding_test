import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N = sc.nextInt();

        int maxV = sc.nextInt();
        answer++;
        for (int i = 0; i <N-1; i ++){
            int now = sc.nextInt();

            if (now > maxV){
                answer++;
                maxV = now;
            }
        }
        System.out.println(answer);
    }
}
