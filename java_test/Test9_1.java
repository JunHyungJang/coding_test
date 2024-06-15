import javax.naming.InitialContext;
import java.lang.reflect.Array;
import java.util.*;

class Person implements Comparable<Person>{
    int x ;
    int y;

    public Person(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x  + " " + this.y + ")";
    }

    @Override
    public int compareTo(Person p){
        return p.x - this.x;
    }
}
public class Test9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Person[] p = new Person[N];

        for (int i = 0 ; i < N; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            p[i] = new Person(x,y);
        }

        Arrays.sort(p, (p1,p2) -> {
            return Integer.compare(p2.x,p1.x);
        });
//        System.out.println(Arrays.toString(p));a
        int maxValue = p[0].y;
        int answer = 0;
        for (int i =1 ; i< N; i++){
            if (p[i].y > maxValue){
                maxValue = p[i].y;
                answer++;
            }
        }
        answer++;
        System.out.println(answer);

    }
}
