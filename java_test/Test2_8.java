import java.util.*;

public class Test2_8 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];
        Integer[] sortedArr = new Integer[num];
        for(int i = 0; i < num; i ++) {
            int p = sc.nextInt();
            arr[i] = p;
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr,Collections.reverseOrder());

        Map<Integer,Integer> map = new HashMap<>();

        int rank = 1;
        for (int i = 0; i < num; i ++){
            if (!map.containsKey(sortedArr[i])){
                map.put(sortedArr[i],rank);
            }
            rank ++;
        }

        for (int i = 0; i < num; i ++){
            System.out.print(map.get(arr[i]) + " ");
        }
    }
}
