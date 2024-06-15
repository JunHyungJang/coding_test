import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num=  sc.nextInt();

        int now = sc.nextInt();
        System.out.print(now + " ");
        for(int i = 0; i< num-1; i ++){
            int nextNum= sc.nextInt();
//            System.out.println("nextNum: " + nextNum + "nownum: "+ now );
//            System.out.println(nextNum>now);
            if (nextNum>now){
                System.out.print(nextNum + " ");
            }

            now = nextNum;
        }

    }
}
