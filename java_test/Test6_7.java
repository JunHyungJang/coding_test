import java.util.*;


class Nodes implements Comparable<Nodes>{
    int x;
    int y;

    public Nodes(int x, int y){
        this.x =  x;
        this.y = y;
    }


    public int compareTo(Nodes o) {
        if (this.x ==o.x){
            return this.y-o.y;
        }else{
            return this.x-o.x;
        }
    }

    public String toString(){
        return "(" + x + ", "+ y + ")";
    }
}
public class Test6_7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();

        List<Nodes> arr = new ArrayList<>();

        for (int i = 0; i < N ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Nodes node =  new Nodes(x,y);

            arr.add(node);
        }

        Collections.sort(arr);

//        System.out.println(arr);

        for(Nodes n : arr){
            System.out.println(n.x + " " + n.y);
        }
    }
}
