package BinarySearch;

import java.io.*;
import java.util.*;

public class BOJ_7453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[N][4];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Long.parseLong(st.nextToken());
            }
        }

        ArrayList<Long> arr1 = new ArrayList<>();
        ArrayList<Long> arr2 = new ArrayList<>();

        HashMap<Long, Integer> map1 = new HashMap<>();
        HashMap<Long, Integer> map2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                long num = arr[i][0] + arr[j][1];
                if (map1.containsKey(num)) {
                    map1.put(num, map1.getOrDefault(num, 0) + 1);
                } else {
                    map1.put(num, 1);
                    arr1.add(num);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                long num = arr[i][2] + arr[j][3];
                if (map2.containsKey(num)) {
                    map2.put(num, map2.getOrDefault(num, 0) + 1);
                } else {
                    map2.put(num, 1);
                    arr2.add(num);
                }
            }
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        int cnt = 0;

        int left = 0;
        int right = arr2.size()-1;

        while (left < arr1.size()){
            long num = arr1.get(left);
            long expected = -arr1.get(left);

            if (arr2.get(right) == expected){
                cnt += map1.get(num) * map2.get(expected);
                left ++;
                right --;
            }else if (arr2.get(right) > expected){
                right --;
            }else{
                left ++;
            }
        }
        System.out.println(cnt);
    }
}
