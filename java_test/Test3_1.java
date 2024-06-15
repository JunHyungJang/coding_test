import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> lst1 = new ArrayList<>();

        for (int i = 0 ; i < N; i ++){
            lst1.add(sc.nextInt());
        }

        int M = sc.nextInt();

        List<Integer> lst2 = new ArrayList<>();

        for (int i = 0; i < M; i ++){
            lst2.add(sc.nextInt());
        }


//        System.out.println((lst1));
//        System.out.println((lst2));

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (!lst1.isEmpty() && !lst2.isEmpty()){
//            System.out.println(lst1);
//            System.out.println(lst2);

            if (lst1.get(i) >= lst2.get(j)){
                result.add(lst2.remove(j));
//                j++;
            }else{
                result.add(lst1.remove(i));
//                i++;
            }
        }

        if (!lst1.isEmpty()) {
            int len = lst1.size();

            for (int x = 0; x < len ; x ++){
                result.add(lst1.get(x));
            }
        }

        if (!lst2.isEmpty()){
            int len = lst2.size();

            for (int x = 0 ; x < len; x ++){
                result.add(lst2.get(x));
            }
        }

        System.out.println(result);



    }
}
