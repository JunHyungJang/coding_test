import java.util.Scanner;
import java.util.Stack;

public class Test5_4 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        String str = sc.next();

        Stack<Integer> s = new Stack<>();
        int result = 0;
        for (char x : str.toCharArray()){
//            System.out.println(x);
//            System.out.println(s);
            if (Character.isDigit(x)) {
                s.push(x - '0');
            }else{
                int second = s.pop();
                int first = s.pop();

                int temp = 0;

                if (x == '*'){
                    temp = first * second;
                }else if (x == '+'){
                    temp = first + second;
                }else if (x == '-'){
                    temp = first - second;
                }else if (x == '/'){
                    temp = first / second;
                }
                s.push(temp);
            }
        }

        System.out.println(s.peek());
    }
}
