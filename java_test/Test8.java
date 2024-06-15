import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toUpperCase().replaceAll("[^A-Z]","");
//        System.out.println(str);

        String reverseStr = new StringBuilder(str).reverse().toString();
//        System.out.println(reverseStr);

        if (reverseStr.equals(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

