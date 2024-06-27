package Tree;


import java.util.*;
public class BOJ_1991 {

    static Map<Character,char[]> map;


    static void preorder(char c){
        char[] arr = map.get(c);
        System.out.print(c);

        if (arr[0] != '.'){
            preorder(arr[0]);
        }

        if (arr[1] !='.'){
            preorder(arr[1]);
        }
    }

    static void mediumorder(char c){
//        System.out.println(c);

        char[] arr = map.get(c);
//        System.out.println(c);
//        System.out.println(Arrays.toString(arr));

        if (arr[0]!= '.'){
            mediumorder(arr[0]);
        }

        System.out.print(c);

        if (arr[1] !='.'){
            mediumorder(arr[1]);
        }
    }

    static void postorder(char c){
        char[] arr= map.get(c);

        if (arr[0] != '.'){
            postorder(arr[0]);
        }

        if (arr[1] != '.'){
            postorder(arr[1]);
        }

        System.out.print(c);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        map = new HashMap<>();

        for (int i = 0 ; i < N; i ++){
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);
            char c = sc.next().charAt(0);
            char[] arr = new char[2];
            arr[0] = b;
            arr[1] = c;
            map.put(a,arr);
        }

//        for (char c : map.keySet()){
//            System.out.println(c);
//            System.out.println(map.get(c));
//        }
        preorder('A');
        System.out.println();
        mediumorder('A');
        System.out.println();
        postorder('A');
        System.out.println();


    }
}
