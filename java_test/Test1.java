
import java.io.IOException;
import java.util.*;

public class Test1 {

    public static int solution(String word, char c) {
        int cnt = 0;
        word = word.toUpperCase();
        c = Character.toUpperCase(c);
//        for (int i = 0; i< word.length() ; i ++){
//            if (word.charAt(i) == c){
//                cnt +=1;
//            }
//        }
        for (char x : word.toCharArray()){
            if (x == c) {
                cnt+=1;
            }
        }

        return cnt;

    }
    public static void main(String[] var0) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(word,c));
    }
}
