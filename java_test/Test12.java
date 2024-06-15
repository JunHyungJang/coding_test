import java.util.Scanner;

public class Test12 {

    static char solution(String str){
        String bin = "";

        for(char w: str.toCharArray()){
            if (w == '#'){
                bin+="1";
            }else{
                bin+= "0";
            }
        }
//        System.out.println(bin);
        int decimal = Integer.parseInt(bin,2);
//        System.out.println(decimal);
////        System.out.println();
//        System.out.println((char)decimal);
        return (char) decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        int num = sc.nextInt();
        String str = sc.next();
        int len = str.length();
        int idx = 0;
        while(idx+7 <= len){
            char c = solution(str.substring(idx,idx+7));
            answer+=c;
            idx+=7;
        }

        System.out.println(answer);
    }
}
