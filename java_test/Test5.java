import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] s = sc.next().toCharArray();
        int left = 0;
        int right = s.length -1;

        while (left < right){
            if (Character.isAlphabetic(s[left]) && Character.isAlphabetic(s[right])){
                char leftValue = s[left];
                char rightValue = s[right];
                s[left] = rightValue;
                s[right] = leftValue;
                left ++;
                right --;
            }else if (Character.isAlphabetic(s[left])){
                right--;
            }else{
                left ++;
            }
        }
        String answer= String.valueOf(s);
        System.out.println(answer);

    }
}
