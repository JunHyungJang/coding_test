import java.util.*;

import static java.util.Collections.min;


public class Test10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char w = sc.next().charAt(0);

        List<Integer> lst = new ArrayList<>();

        int index = str.indexOf(w);

        while (index >=0){
            lst.add(index);
            index = str.indexOf(w,index+1);
        }

//        System.out.println(lst);
//        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < str.length(); i ++){
            int minSize = str.length();

            for (int j = 0; j < lst.size(); j ++){
                minSize = Math.min(Math.abs(i- lst.get(j)),minSize);
            }
            System.out.print(minSize + " ");
//            answer.add(minSize);

        }

//        System.out.println(answer);
    }
}
