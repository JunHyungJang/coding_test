package PartitionSum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_2143 {
    static int T;
    static int a ;
    static int b;
    static int[] A;
    static int[] B;

    static void solution(){

        long answer = 0;
        long[] sumA = new long[a+1];
        long[] sumB = new long[b+1];

        for (int i = 1 ; i < a+1 ; i ++){
            sumA[i] = A[i-1] + sumA[i-1];
        }

        for (int i = 1 ; i < b+1; i ++){
            sumB[i] = B[i-1] + sumB[i-1];
        }


        Map<Long,Integer> mapA = new HashMap<>();

        for (int i = 0 ; i < a ; i ++){
            for (int j = i ;j < a ; j ++){
                long temp = sumA[j+1]-sumA[i];
                mapA.put(temp, mapA.getOrDefault(temp,0)+1);
            }
        }

        for (int i = 0 ; i < b ; i ++){
            for (int j = i ; j < b ; j ++){
                long temp = sumB[j+1]-sumB[i];
                if (mapA.containsKey(T-temp)){
                    answer+=mapA.get(T-temp);
                }
            }
        }

        System.out.println(answer);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());
//        System.out.println(N);

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A = new int[a];
        for (int i = 0 ; i < a ; i ++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        B = new int[b];
        for (int i = 0 ; i < b ; i ++){
            B[i] = Integer.parseInt(st.nextToken());
        }


        solution();
    }
}
