import java.util.*;

class People implements Comparable<People>{
    int x ;
    int y;

    public People(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(People p){
        if (this.x == p.x){
            return this.y-p.y;
        }
        return this.x - p.x;
    }

}
public class Test9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<People> pq = new PriorityQueue<>();
        for (int i = 0 ; i < N; i ++){
            int start = sc.nextInt();
            int end  =sc.nextInt();

            pq.offer(new People(start,1));
            pq.offer(new People(end,0));
        }

//        Collections.sort(lst)


        int temp = 0;
        int answer = 0;

        while (!pq.isEmpty()){
            People p = pq.poll();

            if (p.y == 1){
                temp +=1;
                answer =Math.max(answer,temp);
            }else{
                temp -=1;
            }
        }

        System.out.println(answer);
//        People startP = lst.
    }
}
