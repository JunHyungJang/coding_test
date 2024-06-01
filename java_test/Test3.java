import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int maxValue = 0;
        String maxString = "";
        String[] arr= s.split(" ");

        for (String ar: arr){
            if (ar.length()> maxValue){
                maxValue = ar.length();
                maxString = ar;
            }
        }


        System.out.println(maxString);
    }
}
