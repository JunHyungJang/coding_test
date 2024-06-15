import java.util.*;
public class Test5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        String str = sc.next();

        for (char x : str.toCharArray()){
            if (stack.size() == 0) {
                stack.push(x);
            }else {
                if (stack.peek() == '('){
                    if (x == ')'){
                        stack.pop();
                    }else{
                        stack.push(x);
                    }
                }
            }
        }

//        System.out.println(stack);
        if (!stack.isEmpty()){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
