import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";

        String str = sc.next();
        char[] strArr= str.toCharArray();
        int num = 1;
        char w = strArr[0];

        for (int i = 1; i < strArr.length; i ++){
            if (strArr[i]== w){
                num+=1;
            }else{
                answer+=w;
                if (num >1){
                    answer+=String.valueOf(num);
                }
                num = 1;
                w =strArr[i];
            }
        }

        answer+= w;
        if (num >1) {
            answer+=num;
        }
        System.out.println(answer);

    }
}
