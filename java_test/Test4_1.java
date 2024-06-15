import java.util.*;

public class Test4_1 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Character, Integer> map = new HashMap<>();
        String str = sc.next();

        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);

        int result = 0 ;
//        int[] a= new int(map.keySet());
        for (int k : map.values()){
            result = Math.max(result,k);
        }

        System.out.println(result);
    }


}
