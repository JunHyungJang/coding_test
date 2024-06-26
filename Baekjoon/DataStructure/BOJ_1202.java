package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_1202 {

    static class Jew implements Comparable<Jew> {
        int weight;
        int price;

        public Jew(int weight, int price){
            this.weight = weight;
            this.price = price;
        }


        public int compareTo(Jew j){
            if (this.weight == j.weight){
                return j.price-this.price;
            }

            return this.weight-j.weight;
        }



    }

    static int N;
    static int K;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long answer = 0;

        N = sc.nextInt();
        K = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Jew> jews = new PriorityQueue<>();
        for (int i = 0; i < N ; i ++){
            int weight = sc.nextInt();
            int price = sc.nextInt();
            Jew jew = new Jew(weight,price);
            jews.add(jew);
        }

        for (int i = 0 ; i < K ; i ++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        for (int bag : arr){
            while (!jews.isEmpty() && bag >= jews.peek().weight){
                Jew jew = jews.poll();
                pq.add(jew.price);
            }

            if (!pq.isEmpty()){
                answer+= pq.poll();
            }
        }

        System.out.println(answer);



    }
}
