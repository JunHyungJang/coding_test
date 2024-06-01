import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i ++){
            String newStr = "";
            String word = sc.next();
            String w = new StringBuilder(word).reverse().toString();
            System.out.println(w);
        }
    }
}
