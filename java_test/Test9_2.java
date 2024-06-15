import java.util.*;

class room implements Comparable<room>{
    int start;
    int end ;

    public room(int start,int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(room o) {
        if (this.end == o.end){
            return this.start-o.start;
        }
        return this.end-o.end;
    }

    public String toString(){
        return "(" + this.start + " " + this.end + ")";
    }
}

public class Test9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<room> pq = new PriorityQueue<>();

//        List<room> lst = new ArrayList<>();

        for (int i = 0; i <N;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

//            lst.add(new room(start,end));
            pq.add(new room(start,end));
        }


//        Collections.sort(lst);

//        System.out.println();

        int cnt = 0;
        int end = 0;

        while(!pq.isEmpty()){
//            System.out.println(pq);
            room r= pq.poll();

            if (r.start >= end){
                end = r.end;
                cnt++;
//                System.out.println("+");
            }

        }

        System.out.println(cnt);




//        System.out.println(pq.size());
    }
}
