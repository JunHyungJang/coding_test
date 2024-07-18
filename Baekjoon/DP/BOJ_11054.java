package DP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_11054 {
    static int N;
    static int[] arr;

    static void solution(){
        int[] dpL = new int[N];
        int[] dpR = new int[N];

        for (int i = 1 ; i < N ; i ++){
            int temp = i-1;
            int value = 0;
            while (temp >=0){
                if (arr[i] > arr[temp]){
                    value = Math.max(value,dpL[temp]+1);
                }
                temp--;
            }

            dpL[i] = value;
        }

        for (int i = N-2 ; i >=0 ; i --){
            int temp = i+1;
            int value = 0;
            while (temp <= N-1){
                if (arr[i] > arr[temp]){
                    value = Math.max(value,dpR[temp]+1);

                }
                temp ++;
            }

            dpR[i] = value;


        }

//        System.out.println(Arrays.toString(dpL));
//        System.out.println(Arrays.toString(dpR));

        int answer = 0;

        for (int i = 0 ;i < N ; i++){
            answer = Math.max(answer, dpR[i] + dpL[i] +1);
        }
        System.out.println(answer);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr =new int[N];
        for (int i = 0 ; i < N ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution();
    }

}
