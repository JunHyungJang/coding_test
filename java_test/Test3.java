import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int maxValue = 0 ,pos;
//        int pos = 0;
        String maxString = "";

        while ((pos = s.indexOf(" ")) != -1){
            System.out.println(pos);
            String st = s.substring(0,pos);
            System.out.println(st);
            int len = st.length();

            if (len > maxValue){
                len = maxValue;
                maxString = st;
            }

            s = s.substring(pos+1);
        }

        if (s.length() > maxValue){
            maxString = s;
        }

        System.out.println(maxString);
    }
}
