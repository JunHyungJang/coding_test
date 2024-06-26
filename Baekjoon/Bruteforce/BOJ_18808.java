package Bruteforce;

import java.util.*;

public class BOJ_18808 {

    static int N;
    static int M;
    static int[][] arr;

    static boolean canPost(int r, int c , int a, int b, int[][] sticker){
        boolean flag = true;
        for (int i = 0 ; i < r ; i ++){
            for (int j =0 ; j < c ; j ++){
                if (arr[i+a][b+j] == 1 && sticker[i][j] == 1 ){
                    flag = false;
                }
            }
        }

        if (flag){
            for (int i = 0 ; i < r; i ++){
                for (int j = 0 ; j < c ; j ++){
                    if (arr[i+a][b+j] == 0){
                        arr[i+a][b+j] = sticker[i][j];

                    }
                }
            }
        }

        return flag;

    }

    static boolean check(int r, int c ,int[][] sticker){
//        System.out.println("check r c" +  r + " " + c + " ");
//        System.out.println(N-r);
//        System.out.println(M-c);
        for (int i = 0 ; i < N - r + 1 ; i ++){
            for (int j = 0 ; j < M-c + 1 ; j ++){
//                System.out.println("AB " + i + " " + j );
                if (canPost(r,c,i,j,sticker)){
                    return true;
                }
            }
        }

        return false;
    }

    static int[][] rotate(int r, int c,int[][] sticker) {
        int newR = c;
        int newC = r;
//        System.out.println("Rotate R C " + newR + " " + newC);
        int[][] newSticker = new int[newR][newC];

        for (int i = 0 ; i < newR ; i ++){
            for (int j = 0  ; j < newC ; j ++){
//                System.out.println(i + " " + j );
                newSticker[i][j] = sticker[r-j-1][i];
            }
        }

        return newSticker;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N  = sc.nextInt();
        M = sc.nextInt();
        int K = sc.nextInt();

        arr = new int[N][M];


        for (int i = 0 ; i < K ; i ++){
            int r= sc.nextInt();
            int c= sc.nextInt();
//            System.out.println("Original RC : " +r + " " + c );

            int[][] sticker = new int[r][c];

            // Making sticker
            for (int j = 0 ; j < r; j ++){
                for (int k = 0; k < c ; k ++){
                    sticker[j][k] = sc.nextInt();
                }
            }

            for (int j = 0 ; j < 4 ; j ++){
                if (check(r,c,sticker)){
//                    System.out.println("TRUE");
                    break;
                }
                int[][] newSticker = rotate(r,c,sticker);
                sticker = newSticker;
//                for (int[] st : sticker){
//                    System.out.println(Arrays.toString(st));
//                }
                int newR = c;
                int newC = r;
                r = newR;
                c = newC;
//                System.out.println("fianl r c " + r + c );
            }
//            for (int[] ar : arr){
//                System.out.println(Arrays.toString(ar));
//            }


        }

        int cnt = 0 ;
        for (int i = 0 ; i < N ; i ++){
            for (int j = 0 ; j < M ; j ++){
                if (arr[i][j] == 1){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
