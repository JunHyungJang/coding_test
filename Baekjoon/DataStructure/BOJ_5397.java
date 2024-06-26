package DataStructure;
import java.util.*;


public class BOJ_5397 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

//        LinkedList<Character> lst = new LinkedList<>();

        for (int i = 0 ; i < N ; i ++){
            String str = sc.next();

            LinkedList<Character> lst = new LinkedList<>();

            ListIterator<Character> iter = lst.listIterator();
            for (char c:  str.toCharArray()){

                if (c == '<'){
                    if (iter.hasPrevious()){
                        iter.previous();
                    }
                }else if (c == '>'){
                    if (iter.hasNext()){
                        iter.next();

                }
                }else if (c == '-'){
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                }else{
                    iter.add(c);
                }
//                System.out.println(idx);

            }

            Iterator it = lst.iterator();

            while (it.hasNext()){
                Object obj = it.next();
                System.out.print(obj);
            }




        }




    }
}
