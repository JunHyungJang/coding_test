import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String newStr = "";

        for (char w : word.toCharArray()){
            if (Character.isLowerCase(w)){
                newStr+= Character.toUpperCase(w);
            }else{
                newStr+=Character.toLowerCase(w);
            }
        }

        System.out.println(newStr);
    }
}
