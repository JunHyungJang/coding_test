import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();




        String answer = "";

        for (char x : str.toCharArray()){
            if (Character.isDigit(x)){
                answer+=x;
            }
        }

        int intAnswer = Integer.parseInt(answer);

        System.out.println(intAnswer);
    }
}
