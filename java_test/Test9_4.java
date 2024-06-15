import java.util.*;


class Lecture implements Comparable<Lecture>{
    int m;
    int day;

    public Lecture(int m , int day){
        this.m = m;
        this.day=  day;
    }

    @Override
    public int compareTo(Lecture o) {
        if (this.day== o.day){
            return o.m - this.m;
        }
        return o.day - this.day;
    }

    public String toString(){
        return "(" + m + " " + day + ")";
    }
}
public class Test9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maxDay = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Lecture> lst = new ArrayList<>();
        for (int i = 0 ; i < N; i ++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            maxDay = Math.max(maxDay,b);
            lst.add(new Lecture(a,b));
        }

        Collections.sort(lst);

        int j = 0;
        int total = 0;
        for (int i = maxDay; i > 0; i --){
            while(j < N && lst.get(j).day >= i){
                pq.add(lst.get(j).m);
                j++;
            }

            if (!pq.isEmpty()){
                total += pq.poll();
            }
        }
        System.out.println(total);

    }
}
