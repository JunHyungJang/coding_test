package DataStructure;
import java.util.*;

public class BOJ_7662 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T ; i ++){
            int N = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            PriorityQueue<Integer> pq1 = new PriorityQueue<>();
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

            for (int j=0;j < N ; j++){

                char c = sc.next().charAt(0);
                int k = sc.nextInt();

                if (c == 'I'){
                    pq1.add(k);
                    pq2.add(k);
                    map.put(k, map.getOrDefault(k,0) + 1);
                }else if (c == 'D'){
                    if (k == 1){
                        while (!pq2.isEmpty()){
                            int maxV = pq2.poll();
                            if (map.containsKey(maxV)){
                                if(map.get(maxV) == 1){
                                    map.remove(maxV);
                                }else{
                                    map.put(maxV, map.get(maxV) -1);
                                }

                                break;
                            }
                        }
                    }else{
                        while (!pq1.isEmpty()){
                            int minV = pq1.poll();
                            if (map.containsKey(minV)){
                                if (map.get(minV) == 1){
                                    map.remove(minV);
                                }else{
                                    map.put(minV, map.get(minV)-1);
                                }
                                break;
                            }
                        }
                    }
                }

            }

            int answerMin = Integer.MAX_VALUE;
            int answerMax = Integer.MIN_VALUE;

            for (int a : map.keySet()){
                answerMin = Math.min(answerMin,a);
                answerMax = Math.max(answerMax,a);
            }

            if (answerMin == Integer.MAX_VALUE && answerMax == Integer.MIN_VALUE){
                System.out.println("EMPTY");
            }else{
                System.out.println(answerMax + " " + answerMin);
            }


        }
    }
}
