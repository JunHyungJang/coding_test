import java.util.HashMap;
import java.util.Scanner;

import java.util.*;

public class Test5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Queue<Character> q = new LinkedList<>();

        for (char x : arr1){
            q.offer(x);
        }

        for (char x : arr2){
            if (q.contains(x)){
                if (q.poll() != x ){
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (!q.isEmpty()){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

    }
}
