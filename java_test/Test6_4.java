import java.util.*;

public class Test6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> lst = new ArrayList<>();

        for (int i = 0;  i< M; i ++){
            int num = sc.nextInt();

            if (lst.size() < N){
                if (lst.contains(num)){
                    lst.remove(lst.indexOf(num));
                }
                lst.add(0,num);
            }else{
                if (lst.contains(num)){
                    lst.remove(lst.indexOf(num));
                }else{
                    lst.remove(lst.size()-1);
                }
                lst.add(0,num);
            }

        }
        for (int i = 0; i < lst.size() ; i ++){
            System.out.print(lst.get(i) + " ");
        }
    }


}
