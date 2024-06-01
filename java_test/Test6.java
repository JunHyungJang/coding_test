import java.util.HashMap;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        HashMap<Character,Integer> mp = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String answer = "";
        for (char s : word.toCharArray()){
            if(mp.containsKey(s)){
                continue;
            }

            mp.put(s,1);
            answer+=s;
        }

        System.out.println(answer);
    }
}
