import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();
        char[] s = sc.next().toCharArray();

        int left = 0;
        int right = s.length-1;

        while (left < right){
            if (Character.toLowerCase(s[left]) == Character.toLowerCase(s[right])){
                left ++;
                right --;
            }else{
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
