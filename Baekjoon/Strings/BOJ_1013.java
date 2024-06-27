package Strings;

import java.util.*;

public class BOJ_1013 {

    static int[] needs ;
    static int answer= 0;

    static boolean check(int[] arr){
        boolean flag = true;

        for (int i = 0 ; i < 4 ; i ++){
            if (arr[i] < needs[i]){
                flag = false;
                break;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[] str = sc.next().toCharArray();


        // ACGT
        needs = new int[4];

        for (int i = 0 ; i< 4 ; i++){
            needs[i] = sc.nextInt();
        }

        int[] arr = new int[4];

        for (int i = 0 ; i < M ; i ++){
            if (str[i] == 'A'){
                arr[0]++;
            }else if (str[i] == 'C'){
                arr[1]++;
            }else if (str[i] == 'G'){
                arr[2]++;
            }else if (str[i] == 'T'){
                arr[3]++;
            }
        }

//        System.out.println(Arrays.toString(needs));

        if (check(arr)) {
//                System.out.println("i " +i );
            answer++;
        }
        for (int i = M ; i< N ; i ++){
//            System.out.println("ARRAYS" + Arrays.toString(arr));
//            System.out.println(i + " " + (M+i));
//            if (check(arr)) {
////                System.out.println("i " +i );
//                answer++;
//            }


//                System.out.println(str[i]);
            if (str[i-M] == 'A'){
                arr[0]--;
            }else if (str[i-M] == 'C'){
                arr[1]--;
            }else if (str[i-M] == 'G'){
                arr[2] --;
            }else if (str[i-M] == 'T'){
                arr[3]--;
            }
//                System.out.println(str[M+i]);
            if (str[i] == 'A'){
                arr[0]++;
            }else if (str[i] == 'C'){
                arr[1]++;
            }else if (str[i] == 'G'){
                arr[2]++;
             }else if (str[i] == 'T'){
                arr[3]++;
            }

            if (check(arr)){
                answer++;
            }

        }

        System.out.println(answer);




    }
}
